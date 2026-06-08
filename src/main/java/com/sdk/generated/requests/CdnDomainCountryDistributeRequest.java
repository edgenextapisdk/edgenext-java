package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainCountryDistributeRequest extends BaseRequest {
    public CdnDomainCountryDistributeRequest() {
        super("cdn_domain_country_distribute", "POST");
    }

    public CdnDomainCountryDistributeRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainCountryDistributeRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainCountryDistributeRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainCountryDistributeRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
