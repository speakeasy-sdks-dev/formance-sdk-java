/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class GetConnectorTaskRequestBuilder {

    private GetConnectorTaskRequest request;
    private final SDKMethodInterfaces.MethodCallGetConnectorTask sdk;

    public GetConnectorTaskRequestBuilder(SDKMethodInterfaces.MethodCallGetConnectorTask sdk) {
        this.sdk = sdk;
    }

    public GetConnectorTaskRequestBuilder request(GetConnectorTaskRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetConnectorTaskResponse call() throws Exception {

        return sdk.getConnectorTask(
            request);
    }
}
