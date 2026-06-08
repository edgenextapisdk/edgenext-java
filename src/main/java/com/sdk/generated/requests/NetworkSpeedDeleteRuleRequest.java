package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class NetworkSpeedDeleteRuleRequest extends BaseRequest {
    public NetworkSpeedDeleteRuleRequest() {
        super("NetworkSpeedDeleteRule", "DELETE");
    }

    public NetworkSpeedDeleteRuleRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public NetworkSpeedDeleteRuleRequest setBusinessType(Object value) {
        putBody("business_type", value);
        return this;
    }

    public NetworkSpeedDeleteRuleRequest setConfigGroup(Object value) {
        putBody("config_group", value);
        return this;
    }

    public NetworkSpeedDeleteRuleRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
