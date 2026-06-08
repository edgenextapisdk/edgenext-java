package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdPlusForwardRuleDelPlusForwardRuleRequest extends BaseRequest {
    public TjkdPlusForwardRuleDelPlusForwardRuleRequest() {
        super("TjkdPlusForwardRule_delPlusForwardRule", "DELETE");
    }

    public TjkdPlusForwardRuleDelPlusForwardRuleRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
