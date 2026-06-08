package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class FirewallOpenGroupRequest extends BaseRequest {
    public FirewallOpenGroupRequest() {
        super("Firewall_openGroup", "POST");
    }

    public FirewallOpenGroupRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
