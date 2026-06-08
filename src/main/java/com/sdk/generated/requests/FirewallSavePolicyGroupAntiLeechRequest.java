package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class FirewallSavePolicyGroupAntiLeechRequest extends BaseRequest {
    public FirewallSavePolicyGroupAntiLeechRequest() {
        super("Firewall_savePolicyGroupAntiLeech", "POST");
    }

    public FirewallSavePolicyGroupAntiLeechRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public FirewallSavePolicyGroupAntiLeechRequest setFrom(Object value) {
        putBody("from", value);
        return this;
    }

    public FirewallSavePolicyGroupAntiLeechRequest setName(Object value) {
        putBody("name", value);
        return this;
    }
}
