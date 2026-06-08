package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class AccessInfoDownloadRequest extends BaseRequest {
    public AccessInfoDownloadRequest() {
        super("AccessInfoDownload", "POST");
    }

    public AccessInfoDownloadRequest setDomainInfos(Object value) {
        putBody("domain_infos", value);
        return this;
    }
}
