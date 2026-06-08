package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UnbindRuleTemplateRequest extends BaseRequest {
    public UnbindRuleTemplateRequest() {
        super("UnbindRuleTemplate", "PUT");
    }

    public UnbindRuleTemplateRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public UnbindRuleTemplateRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }
}
