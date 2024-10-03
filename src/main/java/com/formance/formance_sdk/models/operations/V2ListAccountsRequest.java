/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class V2ListAccountsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends Map<String, Object>> requestBody;

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<String> cursor;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=expand")
    private Optional<String> expand;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * The maximum number of results to return per page.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<Long> pageSize;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pit")
    private Optional<OffsetDateTime> pit;

    @JsonCreator
    public V2ListAccountsRequest(
            Optional<? extends Map<String, Object>> requestBody,
            Optional<String> cursor,
            Optional<String> expand,
            String ledger,
            Optional<Long> pageSize,
            Optional<OffsetDateTime> pit) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(expand, "expand");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(pit, "pit");
        this.requestBody = requestBody;
        this.cursor = cursor;
        this.expand = expand;
        this.ledger = ledger;
        this.pageSize = pageSize;
        this.pit = pit;
    }
    
    public V2ListAccountsRequest(
            String ledger) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), ledger, Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> requestBody() {
        return (Optional<Map<String, Object>>) requestBody;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @JsonIgnore
    public Optional<String> cursor() {
        return cursor;
    }

    @JsonIgnore
    public Optional<String> expand() {
        return expand;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    @JsonIgnore
    public Optional<Long> pageSize() {
        return pageSize;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> pit() {
        return pit;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2ListAccountsRequest withRequestBody(Map<String, Object> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public V2ListAccountsRequest withRequestBody(Optional<? extends Map<String, Object>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public V2ListAccountsRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public V2ListAccountsRequest withCursor(Optional<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    public V2ListAccountsRequest withExpand(String expand) {
        Utils.checkNotNull(expand, "expand");
        this.expand = Optional.ofNullable(expand);
        return this;
    }

    public V2ListAccountsRequest withExpand(Optional<String> expand) {
        Utils.checkNotNull(expand, "expand");
        this.expand = expand;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2ListAccountsRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public V2ListAccountsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public V2ListAccountsRequest withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public V2ListAccountsRequest withPit(OffsetDateTime pit) {
        Utils.checkNotNull(pit, "pit");
        this.pit = Optional.ofNullable(pit);
        return this;
    }

    public V2ListAccountsRequest withPit(Optional<OffsetDateTime> pit) {
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
        V2ListAccountsRequest other = (V2ListAccountsRequest) o;
        return 
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.cursor, other.cursor) &&
            Objects.deepEquals(this.expand, other.expand) &&
            Objects.deepEquals(this.ledger, other.ledger) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.pit, other.pit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            cursor,
            expand,
            ledger,
            pageSize,
            pit);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ListAccountsRequest.class,
                "requestBody", requestBody,
                "cursor", cursor,
                "expand", expand,
                "ledger", ledger,
                "pageSize", pageSize,
                "pit", pit);
    }
    
    public final static class Builder {
 
        private Optional<? extends Map<String, Object>> requestBody = Optional.empty();
 
        private Optional<String> cursor = Optional.empty();
 
        private Optional<String> expand = Optional.empty();
 
        private String ledger;
 
        private Optional<Long> pageSize = Optional.empty();
 
        private Optional<OffsetDateTime> pit = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(Map<String, Object> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends Map<String, Object>> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Parameter used in pagination requests. Maximum page size is set to 15.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when this parameter is set.
         * 
         */
        public Builder cursor(String cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = Optional.ofNullable(cursor);
            return this;
        }

        /**
         * Parameter used in pagination requests. Maximum page size is set to 15.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when this parameter is set.
         * 
         */
        public Builder cursor(Optional<String> cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
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
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }

        /**
         * The maximum number of results to return per page.
         * 
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * The maximum number of results to return per page.
         * 
         */
        public Builder pageSize(Optional<Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
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
        
        public V2ListAccountsRequest build() {
            return new V2ListAccountsRequest(
                requestBody,
                cursor,
                expand,
                ledger,
                pageSize,
                pit);
        }
    }
}

