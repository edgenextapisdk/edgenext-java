package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainRecordsDeleteRecordRequest extends BaseRequest {
    public DnsDomainRecordsDeleteRecordRequest() {
        super("DnsDomainRecords_deleteRecord", "DELETE");
    }

    public DnsDomainRecordsDeleteRecordRequest setRecordId(Object value) {
        putBody("record_id", value);
        return this;
    }

    public DnsDomainRecordsDeleteRecordRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }
}
