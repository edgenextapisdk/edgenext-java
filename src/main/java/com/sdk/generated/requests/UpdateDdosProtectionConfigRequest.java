package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UpdateDdosProtectionConfigRequest extends BaseRequest {
    public UpdateDdosProtectionConfigRequest() {
        super("UpdateDdosProtectionConfig", "PUT");
    }

    public UpdateDdosProtectionConfigRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public UpdateDdosProtectionConfigRequest setApplicationDdosProtection(Object value) {
        putBody("application_ddos_protection", value);
        return this;
    }

    public UpdateDdosProtectionConfigRequest setVisitorAuthentication(Object value) {
        putBody("visitor_authentication", value);
        return this;
    }
}
