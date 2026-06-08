package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UnBindDomainCertRequest extends BaseRequest {
    public UnBindDomainCertRequest() {
        super("UnBindDomainCert", "POST");
    }

    public UnBindDomainCertRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public UnBindDomainCertRequest setCaId(Object value) {
        putBody("ca_id", value);
        return this;
    }
}
