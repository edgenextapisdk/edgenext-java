package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainRecordsAddRecordGroupRelationsRequest extends BaseRequest {
    public DnsDomainRecordsAddRecordGroupRelationsRequest() {
        super("DnsDomainRecords_addRecordGroupRelations", "POST");
    }

    public DnsDomainRecordsAddRecordGroupRelationsRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public DnsDomainRecordsAddRecordGroupRelationsRequest setRecordIds(Object value) {
        putBody("record_ids", value);
        return this;
    }
}
