package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainRecordsAddRecordRequest extends BaseRequest {
    public DnsDomainRecordsAddRecordRequest() {
        super("DnsDomainRecords_addRecord", "POST");
        putBody("record_mx", "0");
        putBody("record_ttl", "600");
    }

    public DnsDomainRecordsAddRecordRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public DnsDomainRecordsAddRecordRequest setRecordName(Object value) {
        putBody("record_name", value);
        return this;
    }

    public DnsDomainRecordsAddRecordRequest setRecordType(Object value) {
        putBody("record_type", value);
        return this;
    }

    public DnsDomainRecordsAddRecordRequest setRecordView(Object value) {
        putBody("record_view", value);
        return this;
    }

    public DnsDomainRecordsAddRecordRequest setRecordValue(Object value) {
        putBody("record_value", value);
        return this;
    }

    public DnsDomainRecordsAddRecordRequest setRecordMx(Object value) {
        putBody("record_mx", value);
        return this;
    }

    public DnsDomainRecordsAddRecordRequest setRecordTtl(Object value) {
        putBody("record_ttl", value);
        return this;
    }

    public DnsDomainRecordsAddRecordRequest setRecordRemark(Object value) {
        putBody("record_remark", value);
        return this;
    }
}
