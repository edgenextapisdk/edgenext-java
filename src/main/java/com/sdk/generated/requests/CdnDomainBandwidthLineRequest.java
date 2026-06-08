package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainBandwidthLineRequest extends BaseRequest {
    public CdnDomainBandwidthLineRequest() {
        super("cdn_domain_bandwidth_line", "POST");
    }

    public CdnDomainBandwidthLineRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainBandwidthLineRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainBandwidthLineRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainBandwidthLineRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public CdnDomainBandwidthLineRequest setInterval(Object value) {
        putBody("interval", value);
        return this;
    }

    public CdnDomainBandwidthLineRequest setNodeType(Object value) {
        putBody("node_type", value);
        return this;
    }
}
