package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainUaispDistributeRequest extends BaseRequest {
    public CdnDomainUaispDistributeRequest() {
        super("cdn_domain_uaisp_distribute", "POST");
    }

    public CdnDomainUaispDistributeRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainUaispDistributeRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainUaispDistributeRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainUaispDistributeRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
