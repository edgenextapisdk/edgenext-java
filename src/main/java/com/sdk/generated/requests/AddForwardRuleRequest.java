package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class AddForwardRuleRequest extends BaseRequest {
    public AddForwardRuleRequest() {
        super("addForwardRule", "POST");
    }

    public AddForwardRuleRequest setPackageId(Object value) {
        putBody("package_id", value);
        return this;
    }

    public AddForwardRuleRequest setDomain(Object value) {
        putBody("domain", value);
        return this;
    }

    public AddForwardRuleRequest setProtocol(Object value) {
        putBody("protocol", value);
        return this;
    }

    public AddForwardRuleRequest setPort(Object value) {
        putBody("port", value);
        return this;
    }

    public AddForwardRuleRequest setLoading(Object value) {
        putBody("loading", value);
        return this;
    }

    public AddForwardRuleRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public AddForwardRuleRequest setSourceType(Object value) {
        putBody("source_type", value);
        return this;
    }

    public AddForwardRuleRequest setSourceList(Object value) {
        putBody("source_list", value);
        return this;
    }

    public AddForwardRuleRequest setChannelStatus(Object value) {
        putBody("channel_status", value);
        return this;
    }

    public AddForwardRuleRequest setChannelLoading(Object value) {
        putBody("channel_loading", value);
        return this;
    }

    public AddForwardRuleRequest setChannelSourceList(Object value) {
        putBody("channel_source_list", value);
        return this;
    }
}
