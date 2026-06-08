package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CaCertificateSelfSaveTextCaInfoRequest extends BaseRequest {
    public CaCertificateSelfSaveTextCaInfoRequest() {
        super("CaCertificateSelf_saveTextCaInfo", "POST");
    }

    public CaCertificateSelfSaveTextCaInfoRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public CaCertificateSelfSaveTextCaInfoRequest setCaName(Object value) {
        putBody("ca_name", value);
        return this;
    }

    public CaCertificateSelfSaveTextCaInfoRequest setProductFlag(Object value) {
        putBody("product_flag", value);
        return this;
    }

    public CaCertificateSelfSaveTextCaInfoRequest setCaCert(Object value) {
        putBody("ca_cert", value);
        return this;
    }

    public CaCertificateSelfSaveTextCaInfoRequest setCaKey(Object value) {
        putBody("ca_key", value);
        return this;
    }
}
