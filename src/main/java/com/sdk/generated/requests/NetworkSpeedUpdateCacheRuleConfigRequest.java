package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class NetworkSpeedUpdateCacheRuleConfigRequest extends BaseRequest {
    public NetworkSpeedUpdateCacheRuleConfigRequest() {
        super("NetworkSpeedUpdateCacheRuleConfig", "PUT");
    }

    public NetworkSpeedUpdateCacheRuleConfigRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public NetworkSpeedUpdateCacheRuleConfigRequest setName(Object value) {
        putBody("name", value);
        return this;
    }

    public NetworkSpeedUpdateCacheRuleConfigRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public NetworkSpeedUpdateCacheRuleConfigRequest setExpr(Object value) {
        putBody("expr", value);
        return this;
    }

    public NetworkSpeedUpdateCacheRuleConfigRequest setConf(Object value) {
        putBody("conf", value);
        return this;
    }
}
