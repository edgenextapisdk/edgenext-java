package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class NetworkSpeedUpdateCacheRuleStatusRequest extends BaseRequest {
    public NetworkSpeedUpdateCacheRuleStatusRequest() {
        super("NetworkSpeedUpdateCacheRuleStatus", "PUT");
    }

    public NetworkSpeedUpdateCacheRuleStatusRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public NetworkSpeedUpdateCacheRuleStatusRequest setBusinessType(Object value) {
        putBody("business_type", value);
        return this;
    }

    public NetworkSpeedUpdateCacheRuleStatusRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }

    public NetworkSpeedUpdateCacheRuleStatusRequest setStatus(Object value) {
        putBody("status", value);
        return this;
    }
}
