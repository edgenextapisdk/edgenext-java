package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CloudDnsDomainGroupSaveDomainToGroupRequest extends BaseRequest {
    public CloudDnsDomainGroupSaveDomainToGroupRequest() {
        super("CloudDns_DomainGroup_saveDomainToGroup", "POST");
    }

    public CloudDnsDomainGroupSaveDomainToGroupRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public CloudDnsDomainGroupSaveDomainToGroupRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }

    public CloudDnsDomainGroupSaveDomainToGroupRequest setAction(Object value) {
        putBody("action", value);
        return this;
    }
}
