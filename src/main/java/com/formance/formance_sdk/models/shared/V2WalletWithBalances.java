/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;


public class V2WalletWithBalances {

    @JsonProperty("balances")
    private Balances balances;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    /**
     * The unique ID of the wallet.
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("ledger")
    private String ledger;

    /**
     * Metadata associated with the wallet.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    @JsonProperty("name")
    private String name;

    @JsonCreator
    public V2WalletWithBalances(
            @JsonProperty("balances") Balances balances,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("id") String id,
            @JsonProperty("ledger") String ledger,
            @JsonProperty("metadata") Map<String, String> metadata,
            @JsonProperty("name") String name) {
        Utils.checkNotNull(balances, "balances");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(ledger, "ledger");
        metadata = Utils.emptyMapIfNull(metadata);
        Utils.checkNotNull(name, "name");
        this.balances = balances;
        this.createdAt = createdAt;
        this.id = id;
        this.ledger = ledger;
        this.metadata = metadata;
        this.name = name;
    }

    @JsonIgnore
    public Balances balances() {
        return balances;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * The unique ID of the wallet.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    /**
     * Metadata associated with the wallet.
     */
    @JsonIgnore
    public Map<String, String> metadata() {
        return metadata;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2WalletWithBalances withBalances(Balances balances) {
        Utils.checkNotNull(balances, "balances");
        this.balances = balances;
        return this;
    }

    public V2WalletWithBalances withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The unique ID of the wallet.
     */
    public V2WalletWithBalances withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public V2WalletWithBalances withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * Metadata associated with the wallet.
     */
    public V2WalletWithBalances withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public V2WalletWithBalances withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        V2WalletWithBalances other = (V2WalletWithBalances) o;
        return 
            Objects.deepEquals(this.balances, other.balances) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.ledger, other.ledger) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            balances,
            createdAt,
            id,
            ledger,
            metadata,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2WalletWithBalances.class,
                "balances", balances,
                "createdAt", createdAt,
                "id", id,
                "ledger", ledger,
                "metadata", metadata,
                "name", name);
    }
    
    public final static class Builder {
 
        private Balances balances;
 
        private OffsetDateTime createdAt;
 
        private String id;
 
        private String ledger;
 
        private Map<String, String> metadata;
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder balances(Balances balances) {
            Utils.checkNotNull(balances, "balances");
            this.balances = balances;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * The unique ID of the wallet.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }

        /**
         * Metadata associated with the wallet.
         */
        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public V2WalletWithBalances build() {
            return new V2WalletWithBalances(
                balances,
                createdAt,
                id,
                ledger,
                metadata,
                name);
        }
    }
}

