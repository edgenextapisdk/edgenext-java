package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainRecordsBatchAddRecordsRequest extends BaseRequest {
    public DnsDomainRecordsBatchAddRecordsRequest() {
        super("DnsDomainRecords_batchAddRecords", "POST");
    }

    public DnsDomainRecordsBatchAddRecordsRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }

    public DnsDomainRecordsBatchAddRecordsRequest setRecords(Object value) {
        putBody("records", value);
        return this;
    }
}
