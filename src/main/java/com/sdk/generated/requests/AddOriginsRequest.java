package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class AddOriginsRequest extends BaseRequest {
    public AddOriginsRequest() {
        super("AddOrigins", "POST");
    }

    public AddOriginsRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public AddOriginsRequest setOrigins(Object value) {
        putBody("origins", value);
        return this;
    }
}
