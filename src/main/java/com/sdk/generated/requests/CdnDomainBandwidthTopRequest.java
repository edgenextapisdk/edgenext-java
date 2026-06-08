package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainBandwidthTopRequest extends BaseRequest {
    public CdnDomainBandwidthTopRequest() {
        super("cdn_domain_bandwidth_top", "POST");
    }

    public CdnDomainBandwidthTopRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainBandwidthTopRequest setTopSize(Object value) {
        putBody("top_size", value);
        return this;
    }

    public CdnDomainBandwidthTopRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainBandwidthTopRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainBandwidthTopRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
