package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainBandwidth95Request extends BaseRequest {
    public CdnDomainBandwidth95Request() {
        super("cdn_domain_bandwidth_95", "POST");
    }

    public CdnDomainBandwidth95Request setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainBandwidth95Request setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainBandwidth95Request setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainBandwidth95Request setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public CdnDomainBandwidth95Request setNodeType(Object value) {
        putBody("node_type", value);
        return this;
    }
}
