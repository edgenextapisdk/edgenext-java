package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainRecordsBatchDeleteRecordsRequest extends BaseRequest {
    public DnsDomainRecordsBatchDeleteRecordsRequest() {
        super("DnsDomainRecords_batchDeleteRecords", "POST");
    }

    public DnsDomainRecordsBatchDeleteRecordsRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public DnsDomainRecordsBatchDeleteRecordsRequest setRecordIds(Object value) {
        putBody("record_ids", value);
        return this;
    }
}
