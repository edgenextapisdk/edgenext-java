package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UpdateDomainBaseSettingsRequest extends BaseRequest {
    public UpdateDomainBaseSettingsRequest() {
        super("UpdateDomainBaseSettings", "PUT");
    }

    public UpdateDomainBaseSettingsRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public UpdateDomainBaseSettingsRequest setValue(Object value) {
        putBody("value", value);
        return this;
    }
}
