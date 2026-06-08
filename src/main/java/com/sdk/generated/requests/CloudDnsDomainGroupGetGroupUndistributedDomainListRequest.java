package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CloudDnsDomainGroupGetGroupUndistributedDomainListRequest extends BaseRequest {
    public CloudDnsDomainGroupGetGroupUndistributedDomainListRequest() {
        super("CloudDns_DomainGroup_getGroupUndistributedDomainList", "POST");
    }

    public CloudDnsDomainGroupGetGroupUndistributedDomainListRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public CloudDnsDomainGroupGetGroupUndistributedDomainListRequest setDomain(Object value) {
        putBody("domain", value);
        return this;
    }
}
