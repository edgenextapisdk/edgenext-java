package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class SwitchDomainTemplateRequest extends BaseRequest {
    public SwitchDomainTemplateRequest() {
        super("SwitchDomainTemplate", "PUT");
        putBody("app_type", "network_speed");
    }

    public SwitchDomainTemplateRequest setAppType(Object value) {
        putBody("app_type", value);
        return this;
    }

    public SwitchDomainTemplateRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }

    public SwitchDomainTemplateRequest setNewTplId(Object value) {
        putBody("new_tpl_id", value);
        return this;
    }

    public SwitchDomainTemplateRequest setNewTplType(Object value) {
        putBody("new_tpl_type", value);
        return this;
    }
}
