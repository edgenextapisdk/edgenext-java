package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DomainGroupAddGroupRequest extends BaseRequest {
    public DomainGroupAddGroupRequest() {
        super("DomainGroup_addGroup", "POST");
    }

    public DomainGroupAddGroupRequest setGroupName(Object value) {
        putBody("group_name", value);
        return this;
    }

    public DomainGroupAddGroupRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
