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


public class DeleteWorkflowRequest {

    /**
     * The flow id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=flowId")
    private String flowId;

    @JsonCreator
    public DeleteWorkflowRequest(
            String flowId) {
        Utils.checkNotNull(flowId, "flowId");
        this.flowId = flowId;
    }

    /**
     * The flow id
     */
    @JsonIgnore
    public String flowId() {
        return flowId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The flow id
     */
    public DeleteWorkflowRequest withFlowId(String flowId) {
        Utils.checkNotNull(flowId, "flowId");
        this.flowId = flowId;
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
        DeleteWorkflowRequest other = (DeleteWorkflowRequest) o;
        return 
            Objects.deepEquals(this.flowId, other.flowId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            flowId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteWorkflowRequest.class,
                "flowId", flowId);
    }
    
    public final static class Builder {
 
        private String flowId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The flow id
         */
        public Builder flowId(String flowId) {
            Utils.checkNotNull(flowId, "flowId");
            this.flowId = flowId;
            return this;
        }
        
        public DeleteWorkflowRequest build() {
            return new DeleteWorkflowRequest(
                flowId);
        }
    }
}

