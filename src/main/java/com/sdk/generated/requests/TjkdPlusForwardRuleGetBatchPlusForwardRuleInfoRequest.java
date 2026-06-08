package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdPlusForwardRuleGetBatchPlusForwardRuleInfoRequest extends BaseRequest {
    public TjkdPlusForwardRuleGetBatchPlusForwardRuleInfoRequest() {
        super("TjkdPlusForwardRule_getBatchPlusForwardRuleInfo", "POST");
    }

    public TjkdPlusForwardRuleGetBatchPlusForwardRuleInfoRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
