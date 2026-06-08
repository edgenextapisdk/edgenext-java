package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainRecordsDeleteRecordGroupRequest extends BaseRequest {
    public DnsDomainRecordsDeleteRecordGroupRequest() {
        super("DnsDomainRecords_deleteRecordGroup", "DELETE");
    }

    public DnsDomainRecordsDeleteRecordGroupRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }
}
