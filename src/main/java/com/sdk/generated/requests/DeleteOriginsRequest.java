package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DeleteOriginsRequest extends BaseRequest {
    public DeleteOriginsRequest() {
        super("DeleteOrigins", "DELETE");
    }

    public DeleteOriginsRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }

    public DeleteOriginsRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }
}
