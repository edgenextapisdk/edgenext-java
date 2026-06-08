package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainTimesTopEsRequest extends BaseRequest {
    public CdnDomainTimesTopEsRequest() {
        super("cdn_domain_times_top_es", "POST");
    }

    public CdnDomainTimesTopEsRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainTimesTopEsRequest setTopSize(Object value) {
        putBody("top_size", value);
        return this;
    }

    public CdnDomainTimesTopEsRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainTimesTopEsRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainTimesTopEsRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public CdnDomainTimesTopEsRequest setHttpReferer(Object value) {
        putBody("http_referer", value);
        return this;
    }
}
