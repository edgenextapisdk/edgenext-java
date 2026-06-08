package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainStatusDistributeRequest extends BaseRequest {
    public CdnDomainStatusDistributeRequest() {
        super("cdn_domain_status_distribute", "POST");
    }

    public CdnDomainStatusDistributeRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainStatusDistributeRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainStatusDistributeRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainStatusDistributeRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
