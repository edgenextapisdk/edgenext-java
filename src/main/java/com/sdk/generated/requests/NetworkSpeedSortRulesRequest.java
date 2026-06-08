package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class NetworkSpeedSortRulesRequest extends BaseRequest {
    public NetworkSpeedSortRulesRequest() {
        super("NetworkSpeedSortRules", "PUT");
    }

    public NetworkSpeedSortRulesRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public NetworkSpeedSortRulesRequest setBusinessType(Object value) {
        putBody("business_type", value);
        return this;
    }

    public NetworkSpeedSortRulesRequest setConfigGroup(Object value) {
        putBody("config_group", value);
        return this;
    }

    public NetworkSpeedSortRulesRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
