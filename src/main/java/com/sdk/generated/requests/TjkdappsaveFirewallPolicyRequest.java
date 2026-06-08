package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdappsaveFirewallPolicyRequest extends BaseRequest {
    public TjkdappsaveFirewallPolicyRequest() {
        super("TjkdappsaveFirewallPolicy", "POST");
    }

    public TjkdappsaveFirewallPolicyRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public TjkdappsaveFirewallPolicyRequest setTjkdAppId(Object value) {
        putBody("tjkd_app_id", value);
        return this;
    }

    public TjkdappsaveFirewallPolicyRequest setType(Object value) {
        putBody("type", value);
        return this;
    }

    public TjkdappsaveFirewallPolicyRequest setRules(Object value) {
        putBody("rules", value);
        return this;
    }

    public TjkdappsaveFirewallPolicyRequest setAction(Object value) {
        putBody("action", value);
        return this;
    }

    public TjkdappsaveFirewallPolicyRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public TjkdappsaveFirewallPolicyRequest setStatus(Object value) {
        putBody("status", value);
        return this;
    }
}
