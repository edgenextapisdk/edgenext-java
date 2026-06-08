package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class FirewallSavePolicyRequest extends BaseRequest {
    public FirewallSavePolicyRequest() {
        super("Firewall_savePolicy", "POST");
        putBody("product_flag", "plus");
    }

    public FirewallSavePolicyRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public FirewallSavePolicyRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public FirewallSavePolicyRequest setPackageId(Object value) {
        putBody("package_id", value);
        return this;
    }

    public FirewallSavePolicyRequest setProductFlag(Object value) {
        putBody("product_flag", value);
        return this;
    }

    public FirewallSavePolicyRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public FirewallSavePolicyRequest setTjkdAppId(Object value) {
        putBody("tjkd_app_id", value);
        return this;
    }

    public FirewallSavePolicyRequest setFrom(Object value) {
        putBody("from", value);
        return this;
    }

    public FirewallSavePolicyRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public FirewallSavePolicyRequest setType(Object value) {
        putBody("type", value);
        return this;
    }

    public FirewallSavePolicyRequest setUseType(Object value) {
        putBody("use_type", value);
        return this;
    }

    public FirewallSavePolicyRequest setAction(Object value) {
        putBody("action", value);
        return this;
    }

    public FirewallSavePolicyRequest setActionData(Object value) {
        putBody("action_data", value);
        return this;
    }

    public FirewallSavePolicyRequest setRules(Object value) {
        putBody("rules", value);
        return this;
    }
}
