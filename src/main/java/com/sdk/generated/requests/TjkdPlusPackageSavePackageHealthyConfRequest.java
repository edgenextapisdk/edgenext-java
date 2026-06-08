package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class TjkdPlusPackageSavePackageHealthyConfRequest extends BaseRequest {
    public TjkdPlusPackageSavePackageHealthyConfRequest() {
        super("TjkdPlusPackage_savePackageHealthyConf", "POST");
    }

    public TjkdPlusPackageSavePackageHealthyConfRequest setPackageId(Object value) {
        putBody("package_id", value);
        return this;
    }

    public TjkdPlusPackageSavePackageHealthyConfRequest setFailsTimeout(Object value) {
        putBody("fails_timeout", value);
        return this;
    }

    public TjkdPlusPackageSavePackageHealthyConfRequest setMaxFails(Object value) {
        putBody("max_fails", value);
        return this;
    }

    public TjkdPlusPackageSavePackageHealthyConfRequest setKeepNewSrcTime(Object value) {
        putBody("keep_new_src_time", value);
        return this;
    }
}
