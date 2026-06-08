package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdPlusForwardRuleBatchAddPlusForwardRuleRequest extends BaseRequest {
    public TjkdPlusForwardRuleBatchAddPlusForwardRuleRequest() {
        super("TjkdPlusForwardRule_batchAddPlusForwardRule", "POST");
    }

    public TjkdPlusForwardRuleBatchAddPlusForwardRuleRequest setPackageId(Object value) {
        putBody("package_id", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchAddPlusForwardRuleRequest setProtocol(Object value) {
        putBody("protocol", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchAddPlusForwardRuleRequest setSourceType(Object value) {
        putBody("source_type", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchAddPlusForwardRuleRequest setProtocolPort(Object value) {
        putBody("protocol_port", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchAddPlusForwardRuleRequest setLoading(Object value) {
        putBody("loading", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchAddPlusForwardRuleRequest setSourceIp(Object value) {
        putBody("source_ip", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchAddPlusForwardRuleRequest setBackup(Object value) {
        putBody("backup", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchAddPlusForwardRuleRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
