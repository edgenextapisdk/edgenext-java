package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DnsDomainRecordsImportRecordsRequest extends BaseRequest {
    public DnsDomainRecordsImportRecordsRequest() {
        super("DnsDomainRecords_importRecords", "POST");
    }

    public DnsDomainRecordsImportRecordsRequest setXlsFile(Object value) {
        putBody("xls_file", value);
        return this;
    }
}
