package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class NetworkSpeedCreateRuleRequest extends BaseRequest {
    public NetworkSpeedCreateRuleRequest() {
        super("NetworkSpeedCreateRule", "POST");
    }

    public NetworkSpeedCreateRuleRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public NetworkSpeedCreateRuleRequest setBusinessType(Object value) {
        putBody("business_type", value);
        return this;
    }

    public NetworkSpeedCreateRuleRequest setConfigGroup(Object value) {
        putBody("config_group", value);
        return this;
    }

    public NetworkSpeedCreateRuleRequest setCustomPage(Object value) {
        putBody("custom_page", value);
        return this;
    }

    public NetworkSpeedCreateRuleRequest setUpstreamUriChangeRule(Object value) {
        putBody("upstream_uri_change_rule", value);
        return this;
    }

    public NetworkSpeedCreateRuleRequest setRespHeadersRule(Object value) {
        putBody("resp_headers_rule", value);
        return this;
    }

    public NetworkSpeedCreateRuleRequest setCustomizedReqHeadersRule(Object value) {
        putBody("customized_req_headers_rule", value);
        return this;
    }
}
