package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdPlusDomainAddTjkdPlusDomainRequest extends BaseRequest {
    public TjkdPlusDomainAddTjkdPlusDomainRequest() {
        super("TjkdPlusDomain_addTjkdPlusDomain", "POST");
    }

    public TjkdPlusDomainAddTjkdPlusDomainRequest setPackageId(Object value) {
        putBody("package_id", value);
        return this;
    }

    public TjkdPlusDomainAddTjkdPlusDomainRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }
}
