/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


public class GetInfoRequestBuilder {

    private final SDKMethodInterfaces.MethodCallGetInfo sdk;

    public GetInfoRequestBuilder(SDKMethodInterfaces.MethodCallGetInfo sdk) {
        this.sdk = sdk;
    }

    public GetInfoResponse call() throws Exception {

        return sdk.getInfoDirect();
    }
}
