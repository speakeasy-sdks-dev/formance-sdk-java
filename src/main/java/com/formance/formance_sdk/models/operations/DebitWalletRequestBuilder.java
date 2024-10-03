/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class DebitWalletRequestBuilder {

    private DebitWalletRequest request;
    private final SDKMethodInterfaces.MethodCallDebitWallet sdk;

    public DebitWalletRequestBuilder(SDKMethodInterfaces.MethodCallDebitWallet sdk) {
        this.sdk = sdk;
    }

    public DebitWalletRequestBuilder request(DebitWalletRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public DebitWalletResponse call() throws Exception {

        return sdk.debitWallet(
            request);
    }
}
