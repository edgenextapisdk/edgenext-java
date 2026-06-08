package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CaCertificateSelfEditCaInfoRequest extends BaseRequest {
    public CaCertificateSelfEditCaInfoRequest() {
        super("CaCertificateSelf_editCaInfo", "POST");
    }

    public CaCertificateSelfEditCaInfoRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public CaCertificateSelfEditCaInfoRequest setCaName(Object value) {
        putBody("ca_name", value);
        return this;
    }

    public CaCertificateSelfEditCaInfoRequest setProductFlag(Object value) {
        putBody("product_flag", value);
        return this;
    }

    public CaCertificateSelfEditCaInfoRequest setCaCert(Object value) {
        putBody("ca_cert", value);
        return this;
    }

    public CaCertificateSelfEditCaInfoRequest setCaKey(Object value) {
        putBody("ca_key", value);
        return this;
    }
}
