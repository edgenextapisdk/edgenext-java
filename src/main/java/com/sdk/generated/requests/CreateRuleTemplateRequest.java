package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CreateRuleTemplateRequest extends BaseRequest {
    public CreateRuleTemplateRequest() {
        super("CreateRuleTemplate", "POST");
        putBody("app_type", "network_speed");
    }

    public CreateRuleTemplateRequest setName(Object value) {
        putBody("name", value);
        return this;
    }

    public CreateRuleTemplateRequest setDescription(Object value) {
        putBody("description", value);
        return this;
    }

    public CreateRuleTemplateRequest setAppType(Object value) {
        putBody("app_type", value);
        return this;
    }

    public CreateRuleTemplateRequest setTplType(Object value) {
        putBody("tpl_type", value);
        return this;
    }

    public CreateRuleTemplateRequest setDomainId(Object value) {
        putBody("domain_id", value);
        return this;
    }

    public CreateRuleTemplateRequest setFromTplId(Object value) {
        putBody("from_tpl_id", value);
        return this;
    }

    public CreateRuleTemplateRequest setFromTplType(Object value) {
        putBody("from_tpl_type", value);
        return this;
    }

    public CreateRuleTemplateRequest setBindDomain(Object value) {
        putBody("bind_domain", value);
        return this;
    }
}
