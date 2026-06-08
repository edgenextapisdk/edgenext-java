package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UpdateWafRuleConfigRequest extends BaseRequest {
    public UpdateWafRuleConfigRequest() {
        super("UpdateWafRuleConfig", "PUT");
    }

    public UpdateWafRuleConfigRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public UpdateWafRuleConfigRequest setWafRuleConfig(Object value) {
        putBody("waf_rule_config", value);
        return this;
    }

    public UpdateWafRuleConfigRequest setWafInterceptPage(Object value) {
        putBody("waf_intercept_page", value);
        return this;
    }

    public UpdateWafRuleConfigRequest setReplayAttackProtection(Object value) {
        putBody("replay_attack_protection", value);
        return this;
    }

    public UpdateWafRuleConfigRequest setCsrfProtection(Object value) {
        putBody("csrf_protection", value);
        return this;
    }

    public UpdateWafRuleConfigRequest setWebShellProtection(Object value) {
        putBody("web_shell_protection", value);
        return this;
    }
}
