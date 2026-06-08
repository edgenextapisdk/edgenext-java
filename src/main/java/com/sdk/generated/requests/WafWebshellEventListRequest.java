package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class WafWebshellEventListRequest extends BaseRequest {
    public WafWebshellEventListRequest() {
        super("waf_webshell_event_list", "POST");
    }

    public WafWebshellEventListRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public WafWebshellEventListRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public WafWebshellEventListRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public WafWebshellEventListRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public WafWebshellEventListRequest setPage(Object value) {
        putBody("page", value);
        return this;
    }

    public WafWebshellEventListRequest setPerPage(Object value) {
        putBody("per_page", value);
        return this;
    }
}
