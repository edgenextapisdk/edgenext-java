package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class FirewallDeleteRequest extends BaseRequest {
    public FirewallDeleteRequest() {
        super("Firewall_delete", "POST");
    }

    public FirewallDeleteRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
