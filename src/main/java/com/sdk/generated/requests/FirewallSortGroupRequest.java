package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class FirewallSortGroupRequest extends BaseRequest {
    public FirewallSortGroupRequest() {
        super("Firewall_sortGroup", "POST");
    }

    public FirewallSortGroupRequest setNewSorts(Object value) {
        putBody("new_sorts", value);
        return this;
    }
}
