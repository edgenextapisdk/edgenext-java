package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TcpBandwidthRequest extends BaseRequest {
    public TcpBandwidthRequest() {
        super("tcp_bandwidth", "POST");
    }

    public TcpBandwidthRequest setPackageIds(Object value) {
        putBody("package_ids", value);
        return this;
    }

    public TcpBandwidthRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public TcpBandwidthRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }
}
