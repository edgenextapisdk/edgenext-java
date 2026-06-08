package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class WafWebshellEventDetailRequest extends BaseRequest {
    public WafWebshellEventDetailRequest() {
        super("waf_webshell_event_detail", "POST");
    }

    public WafWebshellEventDetailRequest setRemoteAddr(Object value) {
        putBody("remote_addr", value);
        return this;
    }

    public WafWebshellEventDetailRequest setRequestUrl(Object value) {
        putBody("request_url", value);
        return this;
    }

    public WafWebshellEventDetailRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public WafWebshellEventDetailRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public WafWebshellEventDetailRequest setPage(Object value) {
        putBody("page", value);
        return this;
    }

    public WafWebshellEventDetailRequest setPerPage(Object value) {
        putBody("per_page", value);
        return this;
    }
}
