package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class WafAttackTimesRequest extends BaseRequest {
    public WafAttackTimesRequest() {
        super("waf_attack_times", "POST");
    }

    public WafAttackTimesRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public WafAttackTimesRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public WafAttackTimesRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public WafAttackTimesRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
