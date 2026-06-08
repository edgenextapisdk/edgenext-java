package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class FirewallSortRequest extends BaseRequest {
    public FirewallSortRequest() {
        super("Firewall_sort", "POST");
    }

    public FirewallSortRequest setNewSorts(Object value) {
        putBody("new_sorts", value);
        return this;
    }
}
