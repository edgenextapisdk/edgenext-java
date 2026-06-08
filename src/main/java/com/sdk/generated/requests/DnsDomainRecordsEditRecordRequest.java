package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainRecordsEditRecordRequest extends BaseRequest {
    public DnsDomainRecordsEditRecordRequest() {
        super("DnsDomainRecords_editRecord", "PUT");
        putBody("record_mx", "0");
        putBody("record_ttl", "600");
    }

    public DnsDomainRecordsEditRecordRequest setRecordId(Object value) {
        putBody("record_id", value);
        return this;
    }

    public DnsDomainRecordsEditRecordRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public DnsDomainRecordsEditRecordRequest setRecordName(Object value) {
        putBody("record_name", value);
        return this;
    }

    public DnsDomainRecordsEditRecordRequest setRecordType(Object value) {
        putBody("record_type", value);
        return this;
    }

    public DnsDomainRecordsEditRecordRequest setRecordView(Object value) {
        putBody("record_view", value);
        return this;
    }

    public DnsDomainRecordsEditRecordRequest setRecordValue(Object value) {
        putBody("record_value", value);
        return this;
    }

    public DnsDomainRecordsEditRecordRequest setRecordMx(Object value) {
        putBody("record_mx", value);
        return this;
    }

    public DnsDomainRecordsEditRecordRequest setRecordTtl(Object value) {
        putBody("record_ttl", value);
        return this;
    }

    public DnsDomainRecordsEditRecordRequest setRecordRemark(Object value) {
        putBody("record_remark", value);
        return this;
    }
}
