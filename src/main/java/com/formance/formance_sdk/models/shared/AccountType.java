/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum AccountType {
    UNKNOWN("UNKNOWN"),
    INTERNAL("INTERNAL"),
    EXTERNAL("EXTERNAL");

    @JsonValue
    private final String value;

    private AccountType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
