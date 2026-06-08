package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class NetworkSpeedSortCacheRulesRequest extends BaseRequest {
    public NetworkSpeedSortCacheRulesRequest() {
        super("NetworkSpeedSortCacheRules", "PUT");
    }

    public NetworkSpeedSortCacheRulesRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public NetworkSpeedSortCacheRulesRequest setBusinessType(Object value) {
        putBody("business_type", value);
        return this;
    }

    public NetworkSpeedSortCacheRulesRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
