package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DeleteDomainsRequest extends BaseRequest {
    public DeleteDomainsRequest() {
        super("DeleteDomains", "DELETE");
    }

    public DeleteDomainsRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
