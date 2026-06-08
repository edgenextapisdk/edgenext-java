package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CcTimesLineRequest extends BaseRequest {
    public CcTimesLineRequest() {
        super("cc_times_line", "POST");
    }

    public CcTimesLineRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CcTimesLineRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CcTimesLineRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CcTimesLineRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public CcTimesLineRequest setInterval(Object value) {
        putBody("interval", value);
        return this;
    }
}
