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
import java.util.Objects;


public class ActivityCreateTransactionOutput {

    @JsonProperty("data")
    private OrchestrationTransaction data;

    @JsonCreator
    public ActivityCreateTransactionOutput(
            @JsonProperty("data") OrchestrationTransaction data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public OrchestrationTransaction data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ActivityCreateTransactionOutput withData(OrchestrationTransaction data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
        ActivityCreateTransactionOutput other = (ActivityCreateTransactionOutput) o;
        return 
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ActivityCreateTransactionOutput.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private OrchestrationTransaction data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(OrchestrationTransaction data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public ActivityCreateTransactionOutput build() {
            return new ActivityCreateTransactionOutput(
                data);
        }
    }
}

