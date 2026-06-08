package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UserIpAddUserIpItemRequest extends BaseRequest {
    public UserIpAddUserIpItemRequest() {
        super("UserIp_AddUserIpItem", "POST");
    }

    public UserIpAddUserIpItemRequest setUserIpId(Object value) {
        putBody("user_ip_id", value);
        return this;
    }

    public UserIpAddUserIpItemRequest setIp(Object value) {
        putBody("ip", value);
        return this;
    }

    public UserIpAddUserIpItemRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
