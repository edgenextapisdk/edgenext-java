package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainNodeFlowBandwidthNodeRequest extends BaseRequest {
    public CdnDomainNodeFlowBandwidthNodeRequest() {
        super("cdn_domain_node_flow_bandwidth_node", "POST");
    }

    public CdnDomainNodeFlowBandwidthNodeRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainNodeFlowBandwidthNodeRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainNodeFlowBandwidthNodeRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainNodeFlowBandwidthNodeRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public CdnDomainNodeFlowBandwidthNodeRequest setInterval(Object value) {
        putBody("interval", value);
        return this;
    }
}
