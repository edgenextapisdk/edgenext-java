package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CreateDomainTemplateRequest extends BaseRequest {
    public CreateDomainTemplateRequest() {
        super("CreateDomainTemplate", "POST");
    }

    public CreateDomainTemplateRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }

    public CreateDomainTemplateRequest setTemplateSourceId(Object value) {
        putBody("template_source_id", value);
        return this;
    }
}
