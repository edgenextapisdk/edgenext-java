package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdappstopFirewallPolicyRequest extends BaseRequest {
    public TjkdappstopFirewallPolicyRequest() {
        super("TjkdappstopFirewallPolicy", "POST");
    }

    public TjkdappstopFirewallPolicyRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
