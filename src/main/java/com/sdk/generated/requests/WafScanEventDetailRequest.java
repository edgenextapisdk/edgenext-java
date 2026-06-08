package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class WafScanEventDetailRequest extends BaseRequest {
    public WafScanEventDetailRequest() {
        super("waf_scan_event_detail", "POST");
    }

    public WafScanEventDetailRequest setRemoteAddr(Object value) {
        putBody("remote_addr", value);
        return this;
    }

    public WafScanEventDetailRequest setHttpHost(Object value) {
        putBody("http_host", value);
        return this;
    }

    public WafScanEventDetailRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public WafScanEventDetailRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public WafScanEventDetailRequest setPage(Object value) {
        putBody("page", value);
        return this;
    }

    public WafScanEventDetailRequest setPerPage(Object value) {
        putBody("per_page", value);
        return this;
    }
}
