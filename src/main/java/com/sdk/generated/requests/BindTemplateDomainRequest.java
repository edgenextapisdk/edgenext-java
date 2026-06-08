package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class BindTemplateDomainRequest extends BaseRequest {
    public BindTemplateDomainRequest() {
        super("BindTemplateDomain", "POST");
    }

    public BindTemplateDomainRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public BindTemplateDomainRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }

    public BindTemplateDomainRequest setBindBusinessIds(Object value) {
        putBody("bind_business_ids", value);
        return this;
    }
}
