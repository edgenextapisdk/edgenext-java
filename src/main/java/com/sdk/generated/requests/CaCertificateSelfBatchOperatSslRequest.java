package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class CaCertificateSelfBatchOperatSslRequest extends BaseRequest {
    public CaCertificateSelfBatchOperatSslRequest() {
        super("CaCertificateSelf_batchOperatSsl", "GET");
        putQuery("is_confirm", "1");
    }

    public CaCertificateSelfBatchOperatSslRequest setId(Object value) {
        putQuery("id", value);
        return this;
    }

    public CaCertificateSelfBatchOperatSslRequest setType(Object value) {
        putQuery("type", value);
        return this;
    }

    public CaCertificateSelfBatchOperatSslRequest setProductFlag(Object value) {
        putQuery("product_flag", value);
        return this;
    }

    public CaCertificateSelfBatchOperatSslRequest setIsConfirm(Object value) {
        putQuery("is_confirm", value);
        return this;
    }

    public CaCertificateSelfBatchOperatSslRequest setDelId(Object value) {
        putQuery("del_id", value);
        return this;
    }
}
