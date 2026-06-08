package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CloudDnsDomainGroupDeleteGroupRequest extends BaseRequest {
    public CloudDnsDomainGroupDeleteGroupRequest() {
        super("CloudDns_DomainGroup_deleteGroup", "DELETE");
    }

    public CloudDnsDomainGroupDeleteGroupRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }
}
