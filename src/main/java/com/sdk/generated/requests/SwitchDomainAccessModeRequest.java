package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class SwitchDomainAccessModeRequest extends BaseRequest {
    public SwitchDomainAccessModeRequest() {
        super("SwitchDomainAccessMode", "POST");
    }

    public SwitchDomainAccessModeRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public SwitchDomainAccessModeRequest setAccessMode(Object value) {
        putBody("access_mode", value);
        return this;
    }
}
