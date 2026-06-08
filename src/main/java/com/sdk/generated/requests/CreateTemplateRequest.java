package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CreateTemplateRequest extends BaseRequest {
    public CreateTemplateRequest() {
        super("CreateTemplate", "POST");
    }

    public CreateTemplateRequest setName(Object value) {
        putBody("name", value);
        return this;
    }

    public CreateTemplateRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public CreateTemplateRequest setTemplateSourceId(Object value) {
        putBody("template_source_id", value);
        return this;
    }

    public CreateTemplateRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }

    public CreateTemplateRequest setGroupIds(Object value) {
        putBody("group_ids", value);
        return this;
    }

    public CreateTemplateRequest setDomains(Object value) {
        putBody("domains", value);
        return this;
    }

    public CreateTemplateRequest setBindAll(Object value) {
        putBody("bind_all", value);
        return this;
    }
}
