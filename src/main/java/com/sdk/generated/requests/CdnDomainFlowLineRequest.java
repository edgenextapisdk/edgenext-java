package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainFlowLineRequest extends BaseRequest {
    public CdnDomainFlowLineRequest() {
        super("cdn_domain_flow_line", "POST");
    }

    public CdnDomainFlowLineRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainFlowLineRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainFlowLineRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainFlowLineRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public CdnDomainFlowLineRequest setInterval(Object value) {
        putBody("interval", value);
        return this;
    }

    public CdnDomainFlowLineRequest setNodeType(Object value) {
        putBody("node_type", value);
        return this;
    }
}
