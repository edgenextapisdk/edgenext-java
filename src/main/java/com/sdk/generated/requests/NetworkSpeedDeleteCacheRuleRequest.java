package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class NetworkSpeedDeleteCacheRuleRequest extends BaseRequest {
    public NetworkSpeedDeleteCacheRuleRequest() {
        super("NetworkSpeedDeleteCacheRule", "DELETE");
    }

    public NetworkSpeedDeleteCacheRuleRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public NetworkSpeedDeleteCacheRuleRequest setBusinessType(Object value) {
        putBody("business_type", value);
        return this;
    }

    public NetworkSpeedDeleteCacheRuleRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
