package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class RefreshDomainsAccessRequest extends BaseRequest {
    public RefreshDomainsAccessRequest() {
        super("RefreshDomainsAccess", "POST");
    }

    public RefreshDomainsAccessRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }
}
