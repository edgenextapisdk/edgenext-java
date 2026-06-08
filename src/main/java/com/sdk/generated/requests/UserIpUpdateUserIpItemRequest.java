package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UserIpUpdateUserIpItemRequest extends BaseRequest {
    public UserIpUpdateUserIpItemRequest() {
        super("UserIp_UpdateUserIpItem", "PUT");
    }

    public UserIpUpdateUserIpItemRequest setId(Object value) {
        putBody("_id", value);
        return this;
    }

    public UserIpUpdateUserIpItemRequest setUserIpId(Object value) {
        putBody("user_ip_id", value);
        return this;
    }

    public UserIpUpdateUserIpItemRequest setIp(Object value) {
        putBody("ip", value);
        return this;
    }

    public UserIpUpdateUserIpItemRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
