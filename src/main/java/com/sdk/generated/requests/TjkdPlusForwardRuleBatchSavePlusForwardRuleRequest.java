package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdPlusForwardRuleBatchSavePlusForwardRuleRequest extends BaseRequest {
    public TjkdPlusForwardRuleBatchSavePlusForwardRuleRequest() {
        super("TjkdPlusForwardRule_batchSavePlusForwardRule", "POST");
    }

    public TjkdPlusForwardRuleBatchSavePlusForwardRuleRequest setPackageId(Object value) {
        putBody("package_id", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchSavePlusForwardRuleRequest setProtocol(Object value) {
        putBody("protocol", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchSavePlusForwardRuleRequest setSourceType(Object value) {
        putBody("source_type", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchSavePlusForwardRuleRequest setProtocolPort(Object value) {
        putBody("protocol_port", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchSavePlusForwardRuleRequest setLoading(Object value) {
        putBody("loading", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchSavePlusForwardRuleRequest setSourceIp(Object value) {
        putBody("source_ip", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchSavePlusForwardRuleRequest setBackup(Object value) {
        putBody("backup", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchSavePlusForwardRuleRequest setProtocolPortOld(Object value) {
        putBody("protocol_port_old", value);
        return this;
    }

    public TjkdPlusForwardRuleBatchSavePlusForwardRuleRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
