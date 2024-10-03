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
import java.util.Objects;


public class V2DeleteLedgerMetadataRequest {

    /**
     * Key to remove.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=key")
    private String key;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @JsonCreator
    public V2DeleteLedgerMetadataRequest(
            String key,
            String ledger) {
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(ledger, "ledger");
        this.key = key;
        this.ledger = ledger;
    }

    /**
     * Key to remove.
     */
    @JsonIgnore
    public String key() {
        return key;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Key to remove.
     */
    public V2DeleteLedgerMetadataRequest withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2DeleteLedgerMetadataRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
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
        V2DeleteLedgerMetadataRequest other = (V2DeleteLedgerMetadataRequest) o;
        return 
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            key,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2DeleteLedgerMetadataRequest.class,
                "key", key,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private String key;
 
        private String ledger;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Key to remove.
         */
        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
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
        
        public V2DeleteLedgerMetadataRequest build() {
            return new V2DeleteLedgerMetadataRequest(
                key,
                ledger);
        }
    }
}

