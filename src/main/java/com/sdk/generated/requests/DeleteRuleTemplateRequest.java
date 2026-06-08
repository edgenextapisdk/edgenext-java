package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DeleteRuleTemplateRequest extends BaseRequest {
    public DeleteRuleTemplateRequest() {
        super("DeleteRuleTemplate", "DELETE");
    }

    public DeleteRuleTemplateRequest setId(Object value) {
        putBody("id", value);
        return this;
    }
}
