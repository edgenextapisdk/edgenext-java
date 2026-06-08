package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DomainGroupSaveGroupRequest extends BaseRequest {
    public DomainGroupSaveGroupRequest() {
        super("DomainGroup_saveGroup", "POST");
    }

    public DomainGroupSaveGroupRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public DomainGroupSaveGroupRequest setGroupName(Object value) {
        putBody("group_name", value);
        return this;
    }

    public DomainGroupSaveGroupRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
