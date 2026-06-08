package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainFlowDownloadRequest extends BaseRequest {
    public CdnDomainFlowDownloadRequest() {
        super("cdn_domain_flow_download", "POST");
    }

    public CdnDomainFlowDownloadRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainFlowDownloadRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public CdnDomainFlowDownloadRequest setResourceIds(Object value) {
        putBody("resource_ids", value);
        return this;
    }

    public CdnDomainFlowDownloadRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainFlowDownloadRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public CdnDomainFlowDownloadRequest setTimeZone(Object value) {
        putBody("time_zone", value);
        return this;
    }
}
