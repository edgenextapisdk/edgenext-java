package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainRecordsBatchPauseRecordsRequest extends BaseRequest {
    public DnsDomainRecordsBatchPauseRecordsRequest() {
        super("DnsDomainRecords_batchPauseRecords", "POST");
    }

    public DnsDomainRecordsBatchPauseRecordsRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public DnsDomainRecordsBatchPauseRecordsRequest setRecordIds(Object value) {
        putBody("record_ids", value);
        return this;
    }
}
