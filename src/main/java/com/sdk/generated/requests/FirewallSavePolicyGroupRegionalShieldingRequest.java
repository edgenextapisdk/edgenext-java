package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class FirewallSavePolicyGroupRegionalShieldingRequest extends BaseRequest {
    public FirewallSavePolicyGroupRegionalShieldingRequest() {
        super("Firewall_savePolicyGroupRegionalShielding", "POST");
    }

    public FirewallSavePolicyGroupRegionalShieldingRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public FirewallSavePolicyGroupRegionalShieldingRequest setFrom(Object value) {
        putBody("from", value);
        return this;
    }

    public FirewallSavePolicyGroupRegionalShieldingRequest setName(Object value) {
        putBody("name", value);
        return this;
    }
}
