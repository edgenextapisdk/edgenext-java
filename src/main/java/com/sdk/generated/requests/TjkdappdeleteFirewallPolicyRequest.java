package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdappdeleteFirewallPolicyRequest extends BaseRequest {
    public TjkdappdeleteFirewallPolicyRequest() {
        super("TjkdappdeleteFirewallPolicy", "POST");
    }

    public TjkdappdeleteFirewallPolicyRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
