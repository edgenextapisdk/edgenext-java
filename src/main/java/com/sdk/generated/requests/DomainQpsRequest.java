package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DomainQpsRequest extends BaseRequest {
    public DomainQpsRequest() {
        super("domainQps", "POST");
    }

    public DomainQpsRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public DomainQpsRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public DomainQpsRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public DomainQpsRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public DomainQpsRequest setInterval(Object value) {
        putBody("interval", value);
        return this;
    }
}
