package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class WafAttackEventListRequest extends BaseRequest {
    public WafAttackEventListRequest() {
        super("waf_attack_event_list", "POST");
    }

    public WafAttackEventListRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public WafAttackEventListRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public WafAttackEventListRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public WafAttackEventListRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public WafAttackEventListRequest setPage(Object value) {
        putBody("page", value);
        return this;
    }

    public WafAttackEventListRequest setPerPage(Object value) {
        putBody("per_page", value);
        return this;
    }
}
