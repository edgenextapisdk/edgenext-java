package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainStatusTopDownloadRequest extends BaseRequest {
    public CdnDomainStatusTopDownloadRequest() {
        super("cdn_domain_status_top_download", "POST");
    }

    public CdnDomainStatusTopDownloadRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainStatusTopDownloadRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public CdnDomainStatusTopDownloadRequest setResourceIds(Object value) {
        putBody("resource_ids", value);
        return this;
    }

    public CdnDomainStatusTopDownloadRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainStatusTopDownloadRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public CdnDomainStatusTopDownloadRequest setTimeZone(Object value) {
        putBody("time_zone", value);
        return this;
    }
}
