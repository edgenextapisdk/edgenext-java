package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainAddDomainRequest extends BaseRequest {
    public DnsDomainAddDomainRequest() {
        super("DnsDomain_addDomain", "POST");
    }

    public DnsDomainAddDomainRequest setDomain(Object value) {
        putBody("domain", value);
        return this;
    }
}
