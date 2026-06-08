package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CloudDnsDomainGroupUpdateGroupRequest extends BaseRequest {
    public CloudDnsDomainGroupUpdateGroupRequest() {
        super("CloudDns_DomainGroup_updateGroup", "PUT");
    }

    public CloudDnsDomainGroupUpdateGroupRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public CloudDnsDomainGroupUpdateGroupRequest setGroupName(Object value) {
        putBody("group_name", value);
        return this;
    }

    public CloudDnsDomainGroupUpdateGroupRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public CloudDnsDomainGroupUpdateGroupRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }
}
