package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class SwitchDomainNodesRequest extends BaseRequest {
    public SwitchDomainNodesRequest() {
        super("SwitchDomainNodes", "POST");
    }

    public SwitchDomainNodesRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public SwitchDomainNodesRequest setProtectStatus(Object value) {
        putBody("protect_status", value);
        return this;
    }

    public SwitchDomainNodesRequest setExclusiveResourceId(Object value) {
        putBody("exclusive_resource_id", value);
        return this;
    }
}
