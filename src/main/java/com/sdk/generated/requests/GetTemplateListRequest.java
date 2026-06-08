package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class GetTemplateListRequest extends BaseRequest {
    public GetTemplateListRequest() {
        super("GetTemplateList", "POST");
    }

    public GetTemplateListRequest setTplType(Object value) {
        putBody("tpl_type", value);
        return this;
    }

    public GetTemplateListRequest setSearchType(Object value) {
        putBody("search_type", value);
        return this;
    }

    public GetTemplateListRequest setSearchKey(Object value) {
        putBody("search_key", value);
        return this;
    }

    public GetTemplateListRequest setPage(Object value) {
        putBody("page", value);
        return this;
    }

    public GetTemplateListRequest setPageSize(Object value) {
        putBody("page_size", value);
        return this;
    }
}
