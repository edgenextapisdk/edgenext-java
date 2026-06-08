package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class WafAttackEventDetailRequest extends BaseRequest {
    public WafAttackEventDetailRequest() {
        super("waf_attack_event_detail", "POST");
    }

    public WafAttackEventDetailRequest setRemoteAddr(Object value) {
        putBody("remote_addr", value);
        return this;
    }

    public WafAttackEventDetailRequest setHttpHost(Object value) {
        putBody("http_host", value);
        return this;
    }

    public WafAttackEventDetailRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public WafAttackEventDetailRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public WafAttackEventDetailRequest setPage(Object value) {
        putBody("page", value);
        return this;
    }

    public WafAttackEventDetailRequest setPerPage(Object value) {
        putBody("per_page", value);
        return this;
    }
}
