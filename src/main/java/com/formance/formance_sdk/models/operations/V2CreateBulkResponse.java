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


public class V2CreateBulkResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.V2BulkResponse> v2BulkResponse;

    public V2CreateBulkResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V2BulkResponse> v2BulkResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2BulkResponse, "v2BulkResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2BulkResponse = v2BulkResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
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

    /**
     * OK
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.V2BulkResponse> v2BulkResponse() {
        return v2BulkResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V2CreateBulkResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2CreateBulkResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2CreateBulkResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public V2CreateBulkResponse withV2BulkResponse(com.formance.formance_sdk.models.shared.V2BulkResponse v2BulkResponse) {
        Utils.checkNotNull(v2BulkResponse, "v2BulkResponse");
        this.v2BulkResponse = Optional.ofNullable(v2BulkResponse);
        return this;
    }

    /**
     * OK
     */
    public V2CreateBulkResponse withV2BulkResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2BulkResponse> v2BulkResponse) {
        Utils.checkNotNull(v2BulkResponse, "v2BulkResponse");
        this.v2BulkResponse = v2BulkResponse;
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
        V2CreateBulkResponse other = (V2CreateBulkResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.v2BulkResponse, other.v2BulkResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2BulkResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CreateBulkResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2BulkResponse", v2BulkResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V2BulkResponse> v2BulkResponse = Optional.empty();  
        
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

        /**
         * OK
         */
        public Builder v2BulkResponse(com.formance.formance_sdk.models.shared.V2BulkResponse v2BulkResponse) {
            Utils.checkNotNull(v2BulkResponse, "v2BulkResponse");
            this.v2BulkResponse = Optional.ofNullable(v2BulkResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder v2BulkResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2BulkResponse> v2BulkResponse) {
            Utils.checkNotNull(v2BulkResponse, "v2BulkResponse");
            this.v2BulkResponse = v2BulkResponse;
            return this;
        }
        
        public V2CreateBulkResponse build() {
            return new V2CreateBulkResponse(
                contentType,
                statusCode,
                rawResponse,
                v2BulkResponse);
        }
    }
}

