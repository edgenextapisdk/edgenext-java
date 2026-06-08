package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class BindDomainCertRequest extends BaseRequest {
    public BindDomainCertRequest() {
        super("BindDomainCert", "POST");
    }

    public BindDomainCertRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public BindDomainCertRequest setCaId(Object value) {
        putBody("ca_id", value);
        return this;
    }
}
