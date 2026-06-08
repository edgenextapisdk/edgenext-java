package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class FirewallStopRequest extends BaseRequest {
    public FirewallStopRequest() {
        super("Firewall_stop", "POST");
    }

    public FirewallStopRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
