package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class ListBriefDomainsRequest extends BaseRequest {
    public ListBriefDomainsRequest() {
        super("ListBriefDomains", "POST");
    }

    public ListBriefDomainsRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
