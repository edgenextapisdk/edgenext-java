package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class FirewallDeleteGroupRequest extends BaseRequest {
    public FirewallDeleteGroupRequest() {
        super("Firewall_deleteGroup", "POST");
    }

    public FirewallDeleteGroupRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
