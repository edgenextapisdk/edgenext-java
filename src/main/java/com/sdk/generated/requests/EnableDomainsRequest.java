package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class EnableDomainsRequest extends BaseRequest {
    public EnableDomainsRequest() {
        super("EnableDomains", "POST");
    }

    public EnableDomainsRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }
}
