package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CcQpsMaxRequest extends BaseRequest {
    public CcQpsMaxRequest() {
        super("cc_qps_max", "POST");
    }

    public CcQpsMaxRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CcQpsMaxRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CcQpsMaxRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CcQpsMaxRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
