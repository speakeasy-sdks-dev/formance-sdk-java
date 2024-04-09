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


public class ChangeConfigSecretResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * Secret successfully changed.
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ConfigResponse> configResponse;

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

    public ChangeConfigSecretResponse(
            Optional<? extends com.formance.formance_sdk.models.shared.ConfigResponse> configResponse,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(configResponse, "configResponse");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.configResponse = configResponse;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * Secret successfully changed.
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.ConfigResponse> configResponse() {
        return configResponse;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Secret successfully changed.
     */
    public ChangeConfigSecretResponse withConfigResponse(com.formance.formance_sdk.models.shared.ConfigResponse configResponse) {
        Utils.checkNotNull(configResponse, "configResponse");
        this.configResponse = Optional.ofNullable(configResponse);
        return this;
    }

    /**
     * Secret successfully changed.
     */
    public ChangeConfigSecretResponse withConfigResponse(Optional<? extends com.formance.formance_sdk.models.shared.ConfigResponse> configResponse) {
        Utils.checkNotNull(configResponse, "configResponse");
        this.configResponse = configResponse;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ChangeConfigSecretResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ChangeConfigSecretResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ChangeConfigSecretResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ChangeConfigSecretResponse other = (ChangeConfigSecretResponse) o;
        return 
            java.util.Objects.deepEquals(this.configResponse, other.configResponse) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            configResponse,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ChangeConfigSecretResponse.class,
                "configResponse", configResponse,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ConfigResponse> configResponse = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Secret successfully changed.
         */
        public Builder configResponse(com.formance.formance_sdk.models.shared.ConfigResponse configResponse) {
            Utils.checkNotNull(configResponse, "configResponse");
            this.configResponse = Optional.ofNullable(configResponse);
            return this;
        }

        /**
         * Secret successfully changed.
         */
        public Builder configResponse(Optional<? extends com.formance.formance_sdk.models.shared.ConfigResponse> configResponse) {
            Utils.checkNotNull(configResponse, "configResponse");
            this.configResponse = configResponse;
            return this;
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
        
        public ChangeConfigSecretResponse build() {
            return new ChangeConfigSecretResponse(
                configResponse,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

