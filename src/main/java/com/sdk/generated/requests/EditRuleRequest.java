package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class EditRuleRequest extends BaseRequest {
    public EditRuleRequest() {
        super("editRule", "POST");
    }

    public EditRuleRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public EditRuleRequest setPackageId(Object value) {
        putBody("package_id", value);
        return this;
    }

    public EditRuleRequest setProtocol(Object value) {
        putBody("protocol", value);
        return this;
    }

    public EditRuleRequest setDomain(Object value) {
        putBody("domain", value);
        return this;
    }

    public EditRuleRequest setPort(Object value) {
        putBody("port", value);
        return this;
    }

    public EditRuleRequest setLoading(Object value) {
        putBody("loading", value);
        return this;
    }

    public EditRuleRequest setSourceType(Object value) {
        putBody("source_type", value);
        return this;
    }

    public EditRuleRequest setSourceList(Object value) {
        putBody("source_list", value);
        return this;
    }

    public EditRuleRequest setChannelStatus(Object value) {
        putBody("channel_status", value);
        return this;
    }

    public EditRuleRequest setChannelLoading(Object value) {
        putBody("channel_loading", value);
        return this;
    }

    public EditRuleRequest setChannelSourceList(Object value) {
        putBody("channel_source_list", value);
        return this;
    }
}
