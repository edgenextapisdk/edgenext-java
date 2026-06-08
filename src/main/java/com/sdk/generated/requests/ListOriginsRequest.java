package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class ListOriginsRequest extends BaseRequest {
    public ListOriginsRequest() {
        super("ListOrigins", "GET");
    }

    public ListOriginsRequest setDomainId(Object value) {
        putQuery("domain_id", value);
        return this;
    }
}
