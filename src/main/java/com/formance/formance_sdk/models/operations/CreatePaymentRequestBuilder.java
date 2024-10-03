/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.models.shared.PaymentRequest;
import com.formance.formance_sdk.utils.Utils;

public class CreatePaymentRequestBuilder {

    private PaymentRequest request;
    private final SDKMethodInterfaces.MethodCallCreatePayment sdk;

    public CreatePaymentRequestBuilder(SDKMethodInterfaces.MethodCallCreatePayment sdk) {
        this.sdk = sdk;
    }

    public CreatePaymentRequestBuilder request(PaymentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreatePaymentResponse call() throws Exception {

        return sdk.createPayment(
            request);
    }
}
