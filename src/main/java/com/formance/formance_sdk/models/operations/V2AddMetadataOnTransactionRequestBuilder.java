/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class V2AddMetadataOnTransactionRequestBuilder {

    private V2AddMetadataOnTransactionRequest request;
    private final SDKMethodInterfaces.MethodCallV2AddMetadataOnTransaction sdk;

    public V2AddMetadataOnTransactionRequestBuilder(SDKMethodInterfaces.MethodCallV2AddMetadataOnTransaction sdk) {
        this.sdk = sdk;
    }

    public V2AddMetadataOnTransactionRequestBuilder request(V2AddMetadataOnTransactionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2AddMetadataOnTransactionResponse call() throws Exception {

        return sdk.addMetadataOnTransaction(
            request);
    }
}
