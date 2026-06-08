package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TcpCcFlawRequest extends BaseRequest {
    public TcpCcFlawRequest() {
        super("tcp_cc_flaw", "POST");
    }

    public TcpCcFlawRequest setPackageId(Object value) {
        putBody("package_id", value);
        return this;
    }

    public TcpCcFlawRequest setIp(Object value) {
        putBody("ip", value);
        return this;
    }

    public TcpCcFlawRequest setPort(Object value) {
        putBody("port", value);
        return this;
    }

    public TcpCcFlawRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public TcpCcFlawRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public TcpCcFlawRequest setInterval(Object value) {
        putBody("interval", value);
        return this;
    }
}
