package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainRecordsExportRecordsRequest extends BaseRequest {
    public DnsDomainRecordsExportRecordsRequest() {
        super("DnsDomainRecords_exportRecords", "POST");
    }

    public DnsDomainRecordsExportRecordsRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }
}
