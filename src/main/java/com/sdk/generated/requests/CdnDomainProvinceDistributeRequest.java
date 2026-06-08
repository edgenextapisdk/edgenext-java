package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainProvinceDistributeRequest extends BaseRequest {
    public CdnDomainProvinceDistributeRequest() {
        super("cdn_domain_province_distribute", "POST");
    }

    public CdnDomainProvinceDistributeRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CdnDomainProvinceDistributeRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainProvinceDistributeRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainProvinceDistributeRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
