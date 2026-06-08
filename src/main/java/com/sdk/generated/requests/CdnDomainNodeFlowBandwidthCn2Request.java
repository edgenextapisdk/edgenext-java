package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainNodeFlowBandwidthCn2Request extends BaseRequest {
    public CdnDomainNodeFlowBandwidthCn2Request() {
        super("cdn_domain_node_flow_bandwidth_cn2", "POST");
    }

    public CdnDomainNodeFlowBandwidthCn2Request setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainNodeFlowBandwidthCn2Request setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainNodeFlowBandwidthCn2Request setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainNodeFlowBandwidthCn2Request setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public CdnDomainNodeFlowBandwidthCn2Request setInterval(Object value) {
        putBody("interval", value);
        return this;
    }
}
