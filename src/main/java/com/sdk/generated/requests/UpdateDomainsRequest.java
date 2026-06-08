package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UpdateDomainsRequest extends BaseRequest {
    public UpdateDomainsRequest() {
        super("UpdateDomains", "PUT");
    }

    public UpdateDomainsRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public UpdateDomainsRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
