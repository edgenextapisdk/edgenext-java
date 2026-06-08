package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainFlowTopRequest extends BaseRequest {
    public CdnDomainFlowTopRequest() {
        super("cdn_domain_flow_top", "POST");
    }

    public CdnDomainFlowTopRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainFlowTopRequest setTopSize(Object value) {
        putBody("top_size", value);
        return this;
    }

    public CdnDomainFlowTopRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainFlowTopRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainFlowTopRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
