package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainUrlTopRequest extends BaseRequest {
    public CdnDomainUrlTopRequest() {
        super("cdn_domain_url_top", "POST");
    }

    public CdnDomainUrlTopRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainUrlTopRequest setTopSize(Object value) {
        putBody("top_size", value);
        return this;
    }

    public CdnDomainUrlTopRequest setHttpReferer(Object value) {
        putBody("http_referer", value);
        return this;
    }

    public CdnDomainUrlTopRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainUrlTopRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainUrlTopRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
