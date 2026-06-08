package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CloudDnsDomainGroupAddGroupRequest extends BaseRequest {
    public CloudDnsDomainGroupAddGroupRequest() {
        super("CloudDns_DomainGroup_addGroup", "POST");
    }

    public CloudDnsDomainGroupAddGroupRequest setGroupName(Object value) {
        putBody("group_name", value);
        return this;
    }

    public CloudDnsDomainGroupAddGroupRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
