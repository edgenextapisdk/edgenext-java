package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DeleteForwardRuleRequest extends BaseRequest {
    public DeleteForwardRuleRequest() {
        super("deleteForwardRule", "DELETE");
    }

    public DeleteForwardRuleRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
