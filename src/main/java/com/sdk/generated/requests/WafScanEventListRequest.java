package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class WafScanEventListRequest extends BaseRequest {
    public WafScanEventListRequest() {
        super("waf_scan_event_list", "POST");
    }

    public WafScanEventListRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public WafScanEventListRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public WafScanEventListRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public WafScanEventListRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public WafScanEventListRequest setPage(Object value) {
        putBody("page", value);
        return this;
    }

    public WafScanEventListRequest setPerPage(Object value) {
        putBody("per_page", value);
        return this;
    }
}
