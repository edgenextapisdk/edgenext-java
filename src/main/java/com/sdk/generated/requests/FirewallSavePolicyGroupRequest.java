package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class FirewallSavePolicyGroupRequest extends BaseRequest {
    public FirewallSavePolicyGroupRequest() {
        super("Firewall_savePolicyGroup", "POST");
        putBody("from", "diy");
    }

    public FirewallSavePolicyGroupRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public FirewallSavePolicyGroupRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public FirewallSavePolicyGroupRequest setFrom(Object value) {
        putBody("from", value);
        return this;
    }

    public FirewallSavePolicyGroupRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public FirewallSavePolicyGroupRequest setName(Object value) {
        putBody("name", value);
        return this;
    }
}
