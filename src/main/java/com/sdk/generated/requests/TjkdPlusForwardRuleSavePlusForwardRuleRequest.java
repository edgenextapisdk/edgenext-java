package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdPlusForwardRuleSavePlusForwardRuleRequest extends BaseRequest {
    public TjkdPlusForwardRuleSavePlusForwardRuleRequest() {
        super("TjkdPlusForwardRule_savePlusForwardRule", "POST");
    }

    public TjkdPlusForwardRuleSavePlusForwardRuleRequest setPackageId(Object value) {
        putBody("package_id", value);
        return this;
    }

    public TjkdPlusForwardRuleSavePlusForwardRuleRequest setProtocol(Object value) {
        putBody("protocol", value);
        return this;
    }

    public TjkdPlusForwardRuleSavePlusForwardRuleRequest setProtocolPort(Object value) {
        putBody("protocol_port", value);
        return this;
    }

    public TjkdPlusForwardRuleSavePlusForwardRuleRequest setLoading(Object value) {
        putBody("loading", value);
        return this;
    }

    public TjkdPlusForwardRuleSavePlusForwardRuleRequest setSourceIp(Object value) {
        putBody("source_ip", value);
        return this;
    }

    public TjkdPlusForwardRuleSavePlusForwardRuleRequest setSourcePort(Object value) {
        putBody("source_port", value);
        return this;
    }

    public TjkdPlusForwardRuleSavePlusForwardRuleRequest setBackup(Object value) {
        putBody("backup", value);
        return this;
    }

    public TjkdPlusForwardRuleSavePlusForwardRuleRequest setSourceType(Object value) {
        putBody("source_type", value);
        return this;
    }

    public TjkdPlusForwardRuleSavePlusForwardRuleRequest setActions(Object value) {
        putBody("actions", value);
        return this;
    }

    public TjkdPlusForwardRuleSavePlusForwardRuleRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public TjkdPlusForwardRuleSavePlusForwardRuleRequest setProtocolPortOld(Object value) {
        putBody("protocol_port_old", value);
        return this;
    }
}
