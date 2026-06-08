package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DisableDomainsRequest extends BaseRequest {
    public DisableDomainsRequest() {
        super("DisableDomains", "POST");
    }

    public DisableDomainsRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }
}
