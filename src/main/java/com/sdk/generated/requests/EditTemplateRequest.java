package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class EditTemplateRequest extends BaseRequest {
    public EditTemplateRequest() {
        super("EditTemplate", "PUT");
    }

    public EditTemplateRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public EditTemplateRequest setName(Object value) {
        putBody("name", value);
        return this;
    }

    public EditTemplateRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
