package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class NetworkSpeedGetTemplateConfigRequest extends BaseRequest {
    public NetworkSpeedGetTemplateConfigRequest() {
        super("NetworkSpeedGetTemplateConfig", "POST");
    }

    public NetworkSpeedGetTemplateConfigRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public NetworkSpeedGetTemplateConfigRequest setBusinessType(Object value) {
        putBody("business_type", value);
        return this;
    }

    public NetworkSpeedGetTemplateConfigRequest setConfigGroups(Object value) {
        putBody("config_groups", value);
        return this;
    }

    public NetworkSpeedGetTemplateConfigRequest setUpstreamCheck(Object value) {
        putBody("upstream_check", value);
        return this;
    }
}
