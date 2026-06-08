package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DomainGroupDelGroupRequest extends BaseRequest {
    public DomainGroupDelGroupRequest() {
        super("DomainGroup_delGroup", "POST");
    }

    public DomainGroupDelGroupRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }
}
