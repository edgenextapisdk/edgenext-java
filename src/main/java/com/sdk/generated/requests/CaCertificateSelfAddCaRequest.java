package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CaCertificateSelfAddCaRequest extends BaseRequest {
    public CaCertificateSelfAddCaRequest() {
        super("CaCertificateSelf_addCa", "POST");
    }

    public CaCertificateSelfAddCaRequest setCaName(Object value) {
        putBody("ca_name", value);
        return this;
    }

    public CaCertificateSelfAddCaRequest setProductFlag(Object value) {
        putBody("product_flag", value);
        return this;
    }

    public CaCertificateSelfAddCaRequest setCaCrt(Object value) {
        putBody("ca_crt", value);
        return this;
    }

    public CaCertificateSelfAddCaRequest setCaKey(Object value) {
        putBody("ca_key", value);
        return this;
    }
}
