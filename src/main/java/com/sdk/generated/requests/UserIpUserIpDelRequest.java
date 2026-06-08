package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UserIpUserIpDelRequest extends BaseRequest {
    public UserIpUserIpDelRequest() {
        super("UserIp_userIpDel", "DELETE");
    }

    public UserIpUserIpDelRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
