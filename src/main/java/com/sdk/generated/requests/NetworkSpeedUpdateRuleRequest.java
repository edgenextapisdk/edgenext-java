package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class NetworkSpeedUpdateRuleRequest extends BaseRequest {
    public NetworkSpeedUpdateRuleRequest() {
        super("NetworkSpeedUpdateRule", "PUT");
    }

    public NetworkSpeedUpdateRuleRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public NetworkSpeedUpdateRuleRequest setConfigGroup(Object value) {
        putBody("config_group", value);
        return this;
    }

    public NetworkSpeedUpdateRuleRequest setCustomPage(Object value) {
        putBody("custom_page", value);
        return this;
    }

    public NetworkSpeedUpdateRuleRequest setUpstreamUriChangeRule(Object value) {
        putBody("upstream_uri_change_rule", value);
        return this;
    }

    public NetworkSpeedUpdateRuleRequest setRespHeadersRule(Object value) {
        putBody("resp_headers_rule", value);
        return this;
    }

    public NetworkSpeedUpdateRuleRequest setCustomizedReqHeadersRule(Object value) {
        putBody("customized_req_headers_rule", value);
        return this;
    }
}
