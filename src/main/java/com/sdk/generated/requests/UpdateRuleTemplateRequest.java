package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UpdateRuleTemplateRequest extends BaseRequest {
    public UpdateRuleTemplateRequest() {
        super("UpdateRuleTemplate", "PUT");
    }

    public UpdateRuleTemplateRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public UpdateRuleTemplateRequest setName(Object value) {
        putBody("name", value);
        return this;
    }

    public UpdateRuleTemplateRequest setDescription(Object value) {
        putBody("description", value);
        return this;
    }
}
