package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class OriginGroupCopyOriginGroupRequest extends BaseRequest {
    public OriginGroupCopyOriginGroupRequest() {
        super("OriginGroup_copyOriginGroup", "POST");
    }

    public OriginGroupCopyOriginGroupRequest setOriginGroupId(Object value) {
        putBody("origin_group_id", value);
        return this;
    }

    public OriginGroupCopyOriginGroupRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }
}
