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


public class CreateWalletResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Wallet created
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.CreateWalletResponse> createWalletResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public CreateWalletResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.CreateWalletResponse> createWalletResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createWalletResponse, "createWalletResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createWalletResponse = createWalletResponse;
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
     * Wallet created
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.CreateWalletResponse> createWalletResponse() {
        return createWalletResponse;
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
    public CreateWalletResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Wallet created
     */
    public CreateWalletResponse withCreateWalletResponse(com.formance.formance_sdk.models.shared.CreateWalletResponse createWalletResponse) {
        Utils.checkNotNull(createWalletResponse, "createWalletResponse");
        this.createWalletResponse = Optional.ofNullable(createWalletResponse);
        return this;
    }

    /**
     * Wallet created
     */
    public CreateWalletResponse withCreateWalletResponse(Optional<? extends com.formance.formance_sdk.models.shared.CreateWalletResponse> createWalletResponse) {
        Utils.checkNotNull(createWalletResponse, "createWalletResponse");
        this.createWalletResponse = createWalletResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateWalletResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateWalletResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateWalletResponse other = (CreateWalletResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.createWalletResponse, other.createWalletResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            createWalletResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateWalletResponse.class,
                "contentType", contentType,
                "createWalletResponse", createWalletResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.CreateWalletResponse> createWalletResponse = Optional.empty();
 
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
         * Wallet created
         */
        public Builder createWalletResponse(com.formance.formance_sdk.models.shared.CreateWalletResponse createWalletResponse) {
            Utils.checkNotNull(createWalletResponse, "createWalletResponse");
            this.createWalletResponse = Optional.ofNullable(createWalletResponse);
            return this;
        }

        /**
         * Wallet created
         */
        public Builder createWalletResponse(Optional<? extends com.formance.formance_sdk.models.shared.CreateWalletResponse> createWalletResponse) {
            Utils.checkNotNull(createWalletResponse, "createWalletResponse");
            this.createWalletResponse = createWalletResponse;
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
        
        public CreateWalletResponse build() {
            return new CreateWalletResponse(
                contentType,
                createWalletResponse,
                statusCode,
                rawResponse);
        }
    }
}

