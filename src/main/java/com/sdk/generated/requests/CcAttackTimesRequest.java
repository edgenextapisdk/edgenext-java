package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CcAttackTimesRequest extends BaseRequest {
    public CcAttackTimesRequest() {
        super("cc_attack_times", "POST");
    }

    public CcAttackTimesRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CcAttackTimesRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CcAttackTimesRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CcAttackTimesRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
