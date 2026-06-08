package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class BatchConfigTemplateRequest extends BaseRequest {
    public BatchConfigTemplateRequest() {
        super("BatchConfigTemplate", "POST");
    }

    public BatchConfigTemplateRequest setTemplateIds(Object value) {
        putBody("template_ids", value);
        return this;
    }

    public BatchConfigTemplateRequest setDdosConfig(Object value) {
        putBody("ddos_config", value);
        return this;
    }

    public BatchConfigTemplateRequest setPreciseAccessControlConfig(Object value) {
        putBody("precise_access_control_config", value);
        return this;
    }

    public BatchConfigTemplateRequest setWafRuleConfig(Object value) {
        putBody("waf_rule_config", value);
        return this;
    }

    public BatchConfigTemplateRequest setBotManagementConfig(Object value) {
        putBody("bot_management_config", value);
        return this;
    }
}
