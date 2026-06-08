package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class ListDomainsRequest extends BaseRequest {
    public ListDomainsRequest() {
        super("ListDomains", "GET");
    }

    public ListDomainsRequest setPage(Object value) {
        putQuery("page", value);
        return this;
    }

    public ListDomainsRequest setPageSize(Object value) {
        putQuery("page_size", value);
        return this;
    }

    public ListDomainsRequest setAccessProgress(Object value) {
        putQuery("access_progress", value);
        return this;
    }

    public ListDomainsRequest setGroupId(Object value) {
        putQuery("group_id", value);
        return this;
    }

    public ListDomainsRequest setDomain(Object value) {
        putQuery("domain", value);
        return this;
    }

    public ListDomainsRequest setRemark(Object value) {
        putQuery("remark", value);
        return this;
    }

    public ListDomainsRequest setOriginIp(Object value) {
        putQuery("origin_ip", value);
        return this;
    }

    public ListDomainsRequest setCaStatus(Object value) {
        putQuery("ca_status", value);
        return this;
    }

    public ListDomainsRequest setAccessMode(Object value) {
        putQuery("access_mode", value);
        return this;
    }

    public ListDomainsRequest setProtectStatus(Object value) {
        putQuery("protect_status", value);
        return this;
    }

    public ListDomainsRequest setExclusiveResourceId(Object value) {
        putQuery("exclusive_resource_id", value);
        return this;
    }
}
