package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class GetTemplateBindDomainListRequest extends BaseRequest {
    public GetTemplateBindDomainListRequest() {
        super("GetTemplateBindDomainList", "POST");
    }

    public GetTemplateBindDomainListRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public GetTemplateBindDomainListRequest setPage(Object value) {
        putBody("page", value);
        return this;
    }

    public GetTemplateBindDomainListRequest setPageSize(Object value) {
        putBody("page_size", value);
        return this;
    }

    public GetTemplateBindDomainListRequest setDomain(Object value) {
        putBody("domain", value);
        return this;
    }

    public GetTemplateBindDomainListRequest setTplType(Object value) {
        putBody("tpl_type", value);
        return this;
    }
}
