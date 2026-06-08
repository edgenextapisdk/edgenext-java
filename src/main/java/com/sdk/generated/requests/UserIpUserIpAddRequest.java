package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UserIpUserIpAddRequest extends BaseRequest {
    public UserIpUserIpAddRequest() {
        super("UserIp_userIpAdd", "POST");
    }

    public UserIpUserIpAddRequest setName(Object value) {
        putBody("name", value);
        return this;
    }

    public UserIpUserIpAddRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
