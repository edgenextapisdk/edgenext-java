package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TijkdappSavePackageRequest extends BaseRequest {
    public TijkdappSavePackageRequest() {
        super("TIJKDAPP_SavePackage", "PUT");
    }

    public TijkdappSavePackageRequest setPackageId(Object value) {
        putBody("package_id", value);
        return this;
    }

    public TijkdappSavePackageRequest setPackageName(Object value) {
        putBody("package_name", value);
        return this;
    }
}
