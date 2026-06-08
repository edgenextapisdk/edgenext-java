package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainRecordsAddRecordGroupRequest extends BaseRequest {
    public DnsDomainRecordsAddRecordGroupRequest() {
        super("DnsDomainRecords_addRecordGroup", "POST");
    }

    public DnsDomainRecordsAddRecordGroupRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public DnsDomainRecordsAddRecordGroupRequest setGroupName(Object value) {
        putBody("group_name", value);
        return this;
    }
}
