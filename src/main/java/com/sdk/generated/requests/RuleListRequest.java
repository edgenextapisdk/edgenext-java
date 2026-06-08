package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class RuleListRequest extends BaseRequest {
    public RuleListRequest() {
        super("ruleList", "GET");
    }

    public RuleListRequest setPage(Object value) {
        putQuery("page", value);
        return this;
    }

    public RuleListRequest setPrePage(Object value) {
        putQuery("pre_page", value);
        return this;
    }

    public RuleListRequest setOrder(Object value) {
        putQuery("order", value);
        return this;
    }

    public RuleListRequest setPackageId(Object value) {
        putQuery("package_id", value);
        return this;
    }
}
