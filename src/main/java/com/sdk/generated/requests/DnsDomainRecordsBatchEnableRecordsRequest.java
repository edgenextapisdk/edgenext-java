package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainRecordsBatchEnableRecordsRequest extends BaseRequest {
    public DnsDomainRecordsBatchEnableRecordsRequest() {
        super("DnsDomainRecords_batchEnableRecords", "POST");
    }

    public DnsDomainRecordsBatchEnableRecordsRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public DnsDomainRecordsBatchEnableRecordsRequest setRecordIds(Object value) {
        putBody("record_ids", value);
        return this;
    }
}
