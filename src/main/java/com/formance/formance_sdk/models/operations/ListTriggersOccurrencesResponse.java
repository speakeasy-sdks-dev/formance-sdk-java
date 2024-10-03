/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.Response;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class ListTriggersOccurrencesResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * List of triggers occurrences
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ListTriggersOccurrencesResponse> listTriggersOccurrencesResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListTriggersOccurrencesResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.ListTriggersOccurrencesResponse> listTriggersOccurrencesResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(listTriggersOccurrencesResponse, "listTriggersOccurrencesResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.listTriggersOccurrencesResponse = listTriggersOccurrencesResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListTriggersOccurrencesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * List of triggers occurrences
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.ListTriggersOccurrencesResponse> listTriggersOccurrencesResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.ListTriggersOccurrencesResponse>) listTriggersOccurrencesResponse;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListTriggersOccurrencesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * List of triggers occurrences
     */
    public ListTriggersOccurrencesResponse withListTriggersOccurrencesResponse(com.formance.formance_sdk.models.shared.ListTriggersOccurrencesResponse listTriggersOccurrencesResponse) {
        Utils.checkNotNull(listTriggersOccurrencesResponse, "listTriggersOccurrencesResponse");
        this.listTriggersOccurrencesResponse = Optional.ofNullable(listTriggersOccurrencesResponse);
        return this;
    }

    /**
     * List of triggers occurrences
     */
    public ListTriggersOccurrencesResponse withListTriggersOccurrencesResponse(Optional<? extends com.formance.formance_sdk.models.shared.ListTriggersOccurrencesResponse> listTriggersOccurrencesResponse) {
        Utils.checkNotNull(listTriggersOccurrencesResponse, "listTriggersOccurrencesResponse");
        this.listTriggersOccurrencesResponse = listTriggersOccurrencesResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListTriggersOccurrencesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListTriggersOccurrencesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListTriggersOccurrencesResponse other = (ListTriggersOccurrencesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.listTriggersOccurrencesResponse, other.listTriggersOccurrencesResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            listTriggersOccurrencesResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListTriggersOccurrencesResponse.class,
                "contentType", contentType,
                "listTriggersOccurrencesResponse", listTriggersOccurrencesResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ListTriggersOccurrencesResponse> listTriggersOccurrencesResponse = Optional.empty();
 
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
         * List of triggers occurrences
         */
        public Builder listTriggersOccurrencesResponse(com.formance.formance_sdk.models.shared.ListTriggersOccurrencesResponse listTriggersOccurrencesResponse) {
            Utils.checkNotNull(listTriggersOccurrencesResponse, "listTriggersOccurrencesResponse");
            this.listTriggersOccurrencesResponse = Optional.ofNullable(listTriggersOccurrencesResponse);
            return this;
        }

        /**
         * List of triggers occurrences
         */
        public Builder listTriggersOccurrencesResponse(Optional<? extends com.formance.formance_sdk.models.shared.ListTriggersOccurrencesResponse> listTriggersOccurrencesResponse) {
            Utils.checkNotNull(listTriggersOccurrencesResponse, "listTriggersOccurrencesResponse");
            this.listTriggersOccurrencesResponse = listTriggersOccurrencesResponse;
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
        
        public ListTriggersOccurrencesResponse build() {
            return new ListTriggersOccurrencesResponse(
                contentType,
                listTriggersOccurrencesResponse,
                statusCode,
                rawResponse);
        }
    }
}

