package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class NetworkSpeedCreateCacheRuleRequest extends BaseRequest {
    public NetworkSpeedCreateCacheRuleRequest() {
        super("NetworkSpeedCreateCacheRule", "POST");
    }

    public NetworkSpeedCreateCacheRuleRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public NetworkSpeedCreateCacheRuleRequest setBusinessType(Object value) {
        putBody("business_type", value);
        return this;
    }

    public NetworkSpeedCreateCacheRuleRequest setName(Object value) {
        putBody("name", value);
        return this;
    }

    public NetworkSpeedCreateCacheRuleRequest setExpr(Object value) {
        putBody("expr", value);
        return this;
    }

    public NetworkSpeedCreateCacheRuleRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public NetworkSpeedCreateCacheRuleRequest setConf(Object value) {
        putBody("conf", value);
        return this;
    }
}
