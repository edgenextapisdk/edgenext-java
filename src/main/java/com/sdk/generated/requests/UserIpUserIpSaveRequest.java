package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UserIpUserIpSaveRequest extends BaseRequest {
    public UserIpUserIpSaveRequest() {
        super("UserIp_userIpSave", "PUT");
    }

    public UserIpUserIpSaveRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public UserIpUserIpSaveRequest setName(Object value) {
        putBody("name", value);
        return this;
    }

    public UserIpUserIpSaveRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
