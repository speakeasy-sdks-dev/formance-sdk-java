/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class ReconciliationgetServerInfoResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Server information
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ServerInfo> serverInfo;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public ReconciliationgetServerInfoResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.ServerInfo> serverInfo,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(serverInfo, "serverInfo");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.serverInfo = serverInfo;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Server information
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.ServerInfo> serverInfo() {
        return serverInfo;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ReconciliationgetServerInfoResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Server information
     */
    public ReconciliationgetServerInfoResponse withServerInfo(com.formance.formance_sdk.models.shared.ServerInfo serverInfo) {
        Utils.checkNotNull(serverInfo, "serverInfo");
        this.serverInfo = Optional.ofNullable(serverInfo);
        return this;
    }

    /**
     * Server information
     */
    public ReconciliationgetServerInfoResponse withServerInfo(Optional<? extends com.formance.formance_sdk.models.shared.ServerInfo> serverInfo) {
        Utils.checkNotNull(serverInfo, "serverInfo");
        this.serverInfo = serverInfo;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ReconciliationgetServerInfoResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ReconciliationgetServerInfoResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        ReconciliationgetServerInfoResponse other = (ReconciliationgetServerInfoResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.serverInfo, other.serverInfo) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            serverInfo,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReconciliationgetServerInfoResponse.class,
                "contentType", contentType,
                "serverInfo", serverInfo,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ServerInfo> serverInfo = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * Server information
         */
        public Builder serverInfo(com.formance.formance_sdk.models.shared.ServerInfo serverInfo) {
            Utils.checkNotNull(serverInfo, "serverInfo");
            this.serverInfo = Optional.ofNullable(serverInfo);
            return this;
        }

        /**
         * Server information
         */
        public Builder serverInfo(Optional<? extends com.formance.formance_sdk.models.shared.ServerInfo> serverInfo) {
            Utils.checkNotNull(serverInfo, "serverInfo");
            this.serverInfo = serverInfo;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public ReconciliationgetServerInfoResponse build() {
            return new ReconciliationgetServerInfoResponse(
                contentType,
                serverInfo,
                statusCode,
                rawResponse);
        }
    }
}

