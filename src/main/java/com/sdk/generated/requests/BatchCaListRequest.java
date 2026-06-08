package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class BatchCaListRequest extends BaseRequest {
    public BatchCaListRequest() {
        super("Batch_caList", "POST");
    }

    public BatchCaListRequest setDomains(Object value) {
        putBody("domains", value);
        return this;
    }
}
