package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainRefererTopRequest extends BaseRequest {
    public CdnDomainRefererTopRequest() {
        super("cdn_domain_referer_top", "POST");
    }

    public CdnDomainRefererTopRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainRefererTopRequest setTopSize(Object value) {
        putBody("top_size", value);
        return this;
    }

    public CdnDomainRefererTopRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainRefererTopRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainRefererTopRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
