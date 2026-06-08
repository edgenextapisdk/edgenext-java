package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class OriginGroupBindOriginGroupToDomainsRequest extends BaseRequest {
    public OriginGroupBindOriginGroupToDomainsRequest() {
        super("OriginGroup_bindOriginGroupToDomains", "POST");
    }

    public OriginGroupBindOriginGroupToDomainsRequest setOriginGroupId(Object value) {
        putBody("origin_group_id", value);
        return this;
    }

    public OriginGroupBindOriginGroupToDomainsRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }

    public OriginGroupBindOriginGroupToDomainsRequest setDomainGroupIds(Object value) {
        putBody("domain_group_ids", value);
        return this;
    }

    public OriginGroupBindOriginGroupToDomainsRequest setDomains(Object value) {
        putBody("domains", value);
        return this;
    }
}
