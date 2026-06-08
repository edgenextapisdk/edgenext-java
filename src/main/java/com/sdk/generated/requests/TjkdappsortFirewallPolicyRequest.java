package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdappsortFirewallPolicyRequest extends BaseRequest {
    public TjkdappsortFirewallPolicyRequest() {
        super("TjkdappsortFirewallPolicy", "POST");
    }

    public TjkdappsortFirewallPolicyRequest setNewSorts(Object value) {
        putBody("new_sorts", value);
        return this;
    }
}
