/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


public class OrchestrationgetServerInfoRequestBuilder {

    private final SDKMethodInterfaces.MethodCallOrchestrationgetServerInfo sdk;

    public OrchestrationgetServerInfoRequestBuilder(SDKMethodInterfaces.MethodCallOrchestrationgetServerInfo sdk) {
        this.sdk = sdk;
    }

    public OrchestrationgetServerInfoResponse call() throws Exception {

        return sdk.orchestrationgetServerInfoDirect();
    }
}
