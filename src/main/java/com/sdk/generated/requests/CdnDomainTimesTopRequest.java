package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainTimesTopRequest extends BaseRequest {
    public CdnDomainTimesTopRequest() {
        super("cdn_domain_times_top", "POST");
    }

    public CdnDomainTimesTopRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainTimesTopRequest setTopSize(Object value) {
        putBody("top_size", value);
        return this;
    }

    public CdnDomainTimesTopRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainTimesTopRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainTimesTopRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
