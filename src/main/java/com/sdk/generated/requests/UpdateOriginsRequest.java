package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UpdateOriginsRequest extends BaseRequest {
    public UpdateOriginsRequest() {
        super("UpdateOrigins", "PUT");
    }

    public UpdateOriginsRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public UpdateOriginsRequest setOrigins(Object value) {
        putBody("origins", value);
        return this;
    }
}
