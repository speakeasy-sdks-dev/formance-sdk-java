/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class CreateBalanceRequestBuilder {

    private CreateBalanceRequest request;
    private final SDKMethodInterfaces.MethodCallCreateBalance sdk;

    public CreateBalanceRequestBuilder(SDKMethodInterfaces.MethodCallCreateBalance sdk) {
        this.sdk = sdk;
    }

    public CreateBalanceRequestBuilder request(CreateBalanceRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateBalanceResponse call() throws Exception {

        return sdk.createBalance(
            request);
    }
}
