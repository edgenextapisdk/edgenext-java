package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CaCertificateSelfEditCaNameRequest extends BaseRequest {
    public CaCertificateSelfEditCaNameRequest() {
        super("CaCertificateSelf_editCaName", "POST");
    }

    public CaCertificateSelfEditCaNameRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public CaCertificateSelfEditCaNameRequest setCaName(Object value) {
        putBody("ca_name", value);
        return this;
    }

    public CaCertificateSelfEditCaNameRequest setProductFlag(Object value) {
        putBody("product_flag", value);
        return this;
    }
}
