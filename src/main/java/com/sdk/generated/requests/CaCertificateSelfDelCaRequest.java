package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CaCertificateSelfDelCaRequest extends BaseRequest {
    public CaCertificateSelfDelCaRequest() {
        super("CaCertificateSelf_delCa", "DELETE");
    }

    public CaCertificateSelfDelCaRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }

    public CaCertificateSelfDelCaRequest setProductFlag(Object value) {
        putBody("product_flag", value);
        return this;
    }
}
