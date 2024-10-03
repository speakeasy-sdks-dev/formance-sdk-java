/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.utils.LazySingletonValue;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class ListConnectorTasksRequest {

    /**
     * The name of the connector.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connector")
    private Connector connector;

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<String> cursor;

    /**
     * The maximum number of results to return per page.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<Long> pageSize;

    @JsonCreator
    public ListConnectorTasksRequest(
            Connector connector,
            Optional<String> cursor,
            Optional<Long> pageSize) {
        Utils.checkNotNull(connector, "connector");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(pageSize, "pageSize");
        this.connector = connector;
        this.cursor = cursor;
        this.pageSize = pageSize;
    }
    
    public ListConnectorTasksRequest(
            Connector connector) {
        this(connector, Optional.empty(), Optional.empty());
    }

    /**
     * The name of the connector.
     */
    @JsonIgnore
    public Connector connector() {
        return connector;
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

    /**
     * The maximum number of results to return per page.
     * 
     */
    @JsonIgnore
    public Optional<Long> pageSize() {
        return pageSize;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the connector.
     */
    public ListConnectorTasksRequest withConnector(Connector connector) {
        Utils.checkNotNull(connector, "connector");
        this.connector = connector;
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public ListConnectorTasksRequest withCursor(String cursor) {
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
    public ListConnectorTasksRequest withCursor(Optional<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public ListConnectorTasksRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public ListConnectorTasksRequest withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
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
        ListConnectorTasksRequest other = (ListConnectorTasksRequest) o;
        return 
            Objects.deepEquals(this.connector, other.connector) &&
            Objects.deepEquals(this.cursor, other.cursor) &&
            Objects.deepEquals(this.pageSize, other.pageSize);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connector,
            cursor,
            pageSize);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListConnectorTasksRequest.class,
                "connector", connector,
                "cursor", cursor,
                "pageSize", pageSize);
    }
    
    public final static class Builder {
 
        private Connector connector;
 
        private Optional<String> cursor = Optional.empty();
 
        private Optional<Long> pageSize;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the connector.
         */
        public Builder connector(Connector connector) {
            Utils.checkNotNull(connector, "connector");
            this.connector = connector;
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
        
        public ListConnectorTasksRequest build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }            return new ListConnectorTasksRequest(
                connector,
                cursor,
                pageSize);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "pageSize",
                        "15",
                        new TypeReference<Optional<Long>>() {});
    }
}

