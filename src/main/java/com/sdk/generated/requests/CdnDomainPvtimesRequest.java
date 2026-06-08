package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainPvtimesRequest extends BaseRequest {
    public CdnDomainPvtimesRequest() {
        super("cdn_domain_pvtimes", "POST");
    }

    public CdnDomainPvtimesRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainPvtimesRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainPvtimesRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainPvtimesRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
