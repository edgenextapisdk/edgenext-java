package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class NetworkSpeedUpdateCacheRuleRequest extends BaseRequest {
    public NetworkSpeedUpdateCacheRuleRequest() {
        super("NetworkSpeedUpdateCacheRule", "PUT");
    }

    public NetworkSpeedUpdateCacheRuleRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public NetworkSpeedUpdateCacheRuleRequest setName(Object value) {
        putBody("name", value);
        return this;
    }

    public NetworkSpeedUpdateCacheRuleRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
