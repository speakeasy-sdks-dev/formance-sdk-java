/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class V2GetTransactionRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=expand")
    private Optional<String> expand;

    /**
     * Transaction ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private BigInteger id;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pit")
    private Optional<OffsetDateTime> pit;

    @JsonCreator
    public V2GetTransactionRequest(
            Optional<String> expand,
            BigInteger id,
            String ledger,
            Optional<OffsetDateTime> pit) {
        Utils.checkNotNull(expand, "expand");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(pit, "pit");
        this.expand = expand;
        this.id = id;
        this.ledger = ledger;
        this.pit = pit;
    }
    
    public V2GetTransactionRequest(
            BigInteger id,
            String ledger) {
        this(Optional.empty(), id, ledger, Optional.empty());
    }

    @JsonIgnore
    public Optional<String> expand() {
        return expand;
    }

    /**
     * Transaction ID.
     */
    @JsonIgnore
    public BigInteger id() {
        return id;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> pit() {
        return pit;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2GetTransactionRequest withExpand(String expand) {
        Utils.checkNotNull(expand, "expand");
        this.expand = Optional.ofNullable(expand);
        return this;
    }

    public V2GetTransactionRequest withExpand(Optional<String> expand) {
        Utils.checkNotNull(expand, "expand");
        this.expand = expand;
        return this;
    }

        /**
         * Transaction ID.
         */
    public V2GetTransactionRequest withId(long id) {
        this.id = BigInteger.valueOf(id);
        return this;
    }

    /**
     * Transaction ID.
     */
    public V2GetTransactionRequest withId(BigInteger id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2GetTransactionRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    public V2GetTransactionRequest withPit(OffsetDateTime pit) {
        Utils.checkNotNull(pit, "pit");
        this.pit = Optional.ofNullable(pit);
        return this;
    }

    public V2GetTransactionRequest withPit(Optional<OffsetDateTime> pit) {
        Utils.checkNotNull(pit, "pit");
        this.pit = pit;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V2GetTransactionRequest other = (V2GetTransactionRequest) o;
        return 
            Objects.deepEquals(this.expand, other.expand) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.ledger, other.ledger) &&
            Objects.deepEquals(this.pit, other.pit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            expand,
            id,
            ledger,
            pit);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2GetTransactionRequest.class,
                "expand", expand,
                "id", id,
                "ledger", ledger,
                "pit", pit);
    }
    
    public final static class Builder {
 
        private Optional<String> expand = Optional.empty();
 
        private BigInteger id;
 
        private String ledger;
 
        private Optional<OffsetDateTime> pit = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder expand(String expand) {
            Utils.checkNotNull(expand, "expand");
            this.expand = Optional.ofNullable(expand);
            return this;
        }

        public Builder expand(Optional<String> expand) {
            Utils.checkNotNull(expand, "expand");
            this.expand = expand;
            return this;
        }

        /**
         * Transaction ID.
         */
        public Builder id(long id) {
            this.id = BigInteger.valueOf(id);
            return this;
        }

        /**
         * Transaction ID.
         */
        public Builder id(BigInteger id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }

        public Builder pit(OffsetDateTime pit) {
            Utils.checkNotNull(pit, "pit");
            this.pit = Optional.ofNullable(pit);
            return this;
        }

        public Builder pit(Optional<OffsetDateTime> pit) {
            Utils.checkNotNull(pit, "pit");
            this.pit = pit;
            return this;
        }
        
        public V2GetTransactionRequest build() {
            return new V2GetTransactionRequest(
                expand,
                id,
                ledger,
                pit);
        }
    }
}

