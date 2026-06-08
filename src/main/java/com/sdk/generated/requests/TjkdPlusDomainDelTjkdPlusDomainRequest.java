package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdPlusDomainDelTjkdPlusDomainRequest extends BaseRequest {
    public TjkdPlusDomainDelTjkdPlusDomainRequest() {
        super("TjkdPlusDomain_delTjkdPlusDomain", "DELETE");
    }

    public TjkdPlusDomainDelTjkdPlusDomainRequest setPackageDomainIds(Object value) {
        putBody("package_domain_ids", value);
        return this;
    }

    public TjkdPlusDomainDelTjkdPlusDomainRequest setPackageDomains(Object value) {
        putBody("package_domains", value);
        return this;
    }

    public TjkdPlusDomainDelTjkdPlusDomainRequest setIgnoreNotExistsDomain(Object value) {
        putBody("ignore_not_exists_domain", value);
        return this;
    }
}
