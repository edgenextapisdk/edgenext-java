package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class ExportDomainsRequest extends BaseRequest {
    public ExportDomainsRequest() {
        super("ExportDomains", "POST");
    }

    public ExportDomainsRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }

    public ExportDomainsRequest setAccessProgress(Object value) {
        putBody("access_progress", value);
        return this;
    }

    public ExportDomainsRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public ExportDomainsRequest setDomain(Object value) {
        putBody("domain", value);
        return this;
    }

    public ExportDomainsRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public ExportDomainsRequest setOriginIp(Object value) {
        putBody("origin_ip", value);
        return this;
    }

    public ExportDomainsRequest setCaStatus(Object value) {
        putBody("ca_status", value);
        return this;
    }

    public ExportDomainsRequest setAccessMode(Object value) {
        putBody("access_mode", value);
        return this;
    }

    public ExportDomainsRequest setProtectStatus(Object value) {
        putBody("protect_status", value);
        return this;
    }

    public ExportDomainsRequest setExclusiveResourceId(Object value) {
        putBody("exclusive_resource_id", value);
        return this;
    }
}
