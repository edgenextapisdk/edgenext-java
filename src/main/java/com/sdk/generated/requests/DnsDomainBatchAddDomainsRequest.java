package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainBatchAddDomainsRequest extends BaseRequest {
    public DnsDomainBatchAddDomainsRequest() {
        super("DnsDomain_batchAddDomains", "POST");
        putBody("add_record", "0");
    }

    public DnsDomainBatchAddDomainsRequest setDomains(Object value) {
        putBody("domains", value);
        return this;
    }

    public DnsDomainBatchAddDomainsRequest setAddRecord(Object value) {
        putBody("add_record", value);
        return this;
    }

    public DnsDomainBatchAddDomainsRequest setRecordValue(Object value) {
        putBody("record_value", value);
        return this;
    }

    public DnsDomainBatchAddDomainsRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }
}
