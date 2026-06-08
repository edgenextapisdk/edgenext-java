package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdappopenFirewallPolicyRequest extends BaseRequest {
    public TjkdappopenFirewallPolicyRequest() {
        super("TjkdappopenFirewallPolicy", "POST");
    }

    public TjkdappopenFirewallPolicyRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
