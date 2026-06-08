package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CcReportStatsRequest extends BaseRequest {
    public CcReportStatsRequest() {
        super("cc_report_stats", "POST");
    }

    public CcReportStatsRequest setAcctId(Object value) {
        putBody("acct_id", value);
        return this;
    }

    public CcReportStatsRequest setSubDomains(Object value) {
        putBody("sub_domains", value);
        return this;
    }

    public CcReportStatsRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public CcReportStatsRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
