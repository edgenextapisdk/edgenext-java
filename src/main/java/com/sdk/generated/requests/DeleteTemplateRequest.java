package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DeleteTemplateRequest extends BaseRequest {
    public DeleteTemplateRequest() {
        super("DeleteTemplate", "DELETE");
    }

    public DeleteTemplateRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }
}
