package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DomainGroupMoveDomainRequest extends BaseRequest {
    public DomainGroupMoveDomainRequest() {
        super("DomainGroup_moveDomain", "POST");
    }

    public DomainGroupMoveDomainRequest setFromGroupId(Object value) {
        putBody("from_group_id", value);
        return this;
    }

    public DomainGroupMoveDomainRequest setToGroupId(Object value) {
        putBody("to_group_id", value);
        return this;
    }

    public DomainGroupMoveDomainRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }
}
