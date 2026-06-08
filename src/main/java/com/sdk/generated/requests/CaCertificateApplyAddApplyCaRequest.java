package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CaCertificateApplyAddApplyCaRequest extends BaseRequest {
    public CaCertificateApplyAddApplyCaRequest() {
        super("CaCertificateApply_addApplyCa", "POST");
        putBody("type", "1");
        putBody("ca_type", "2");
    }

    public CaCertificateApplyAddApplyCaRequest setDomain(Object value) {
        putBody("domain", value);
        return this;
    }

    public CaCertificateApplyAddApplyCaRequest setType(Object value) {
        putBody("type", value);
        return this;
    }

    public CaCertificateApplyAddApplyCaRequest setCaType(Object value) {
        putBody("ca_type", value);
        return this;
    }
}
