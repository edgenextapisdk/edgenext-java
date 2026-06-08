package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class BindRuleTemplateRequest extends BaseRequest {
    public BindRuleTemplateRequest() {
        super("BindRuleTemplate", "PUT");
    }

    public BindRuleTemplateRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public BindRuleTemplateRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }
}
