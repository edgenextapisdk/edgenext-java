package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainBatchDeleteDomainsRequest extends BaseRequest {
    public DnsDomainBatchDeleteDomainsRequest() {
        super("DnsDomain_batchDeleteDomains", "DELETE");
    }

    public DnsDomainBatchDeleteDomainsRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }
}
