package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CdnDomainBandwidthDownloadRequest extends BaseRequest {
    public CdnDomainBandwidthDownloadRequest() {
        super("cdn_domain_bandwidth_download", "POST");
    }

    public CdnDomainBandwidthDownloadRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CdnDomainBandwidthDownloadRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public CdnDomainBandwidthDownloadRequest setResourceIds(Object value) {
        putBody("resource_ids", value);
        return this;
    }

    public CdnDomainBandwidthDownloadRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CdnDomainBandwidthDownloadRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public CdnDomainBandwidthDownloadRequest setTimeZone(Object value) {
        putBody("time_zone", value);
        return this;
    }
}
