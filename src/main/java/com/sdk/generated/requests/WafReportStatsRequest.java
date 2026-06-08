package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class WafReportStatsRequest extends BaseRequest {
    public WafReportStatsRequest() {
        super("waf_report_stats", "POST");
    }

    public WafReportStatsRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public WafReportStatsRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public WafReportStatsRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public WafReportStatsRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
