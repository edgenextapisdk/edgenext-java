package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class AddDomainsRequest extends BaseRequest {
    public AddDomainsRequest() {
        super("AddDomains", "POST");
    }

    public AddDomainsRequest setDomain(Object value) {
        putBody("domain", value);
        return this;
    }

    public AddDomainsRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public AddDomainsRequest setExclusiveResourceId(Object value) {
        putBody("exclusive_resource_id", value);
        return this;
    }

    public AddDomainsRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public AddDomainsRequest setTplId(Object value) {
        putBody("tpl_id", value);
        return this;
    }

    public AddDomainsRequest setOrigins(Object value) {
        putBody("origins", value);
        return this;
    }

    public AddDomainsRequest setProtectStatus(Object value) {
        putBody("protect_status", value);
        return this;
    }

    public AddDomainsRequest setTplRecommend(Object value) {
        putBody("tpl_recommend", value);
        return this;
    }
}
