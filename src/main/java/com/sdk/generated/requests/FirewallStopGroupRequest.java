package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class FirewallStopGroupRequest extends BaseRequest {
    public FirewallStopGroupRequest() {
        super("Firewall_stopGroup", "POST");
    }

    public FirewallStopGroupRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
