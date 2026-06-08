package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainNodeFlowBandwidthRequest extends BaseRequest {
    public CdnDomainNodeFlowBandwidthRequest() {
        super("cdn_domain_node_flow_bandwidth", "POST");
    }

    public CdnDomainNodeFlowBandwidthRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainNodeFlowBandwidthRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainNodeFlowBandwidthRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainNodeFlowBandwidthRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public CdnDomainNodeFlowBandwidthRequest setInterval(Object value) {
        putBody("interval", value);
        return this;
    }
}
