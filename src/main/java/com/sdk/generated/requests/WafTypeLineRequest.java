package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class WafTypeLineRequest extends BaseRequest {
    public WafTypeLineRequest() {
        super("waf_type_line", "POST");
    }

    public WafTypeLineRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public WafTypeLineRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public WafTypeLineRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public WafTypeLineRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public WafTypeLineRequest setInterval(Object value) {
        putBody("interval", value);
        return this;
    }
}
