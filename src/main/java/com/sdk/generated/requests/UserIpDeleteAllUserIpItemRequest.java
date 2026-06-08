package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UserIpDeleteAllUserIpItemRequest extends BaseRequest {
    public UserIpDeleteAllUserIpItemRequest() {
        super("UserIp_DeleteAllUserIpItem", "POST");
    }

    public UserIpDeleteAllUserIpItemRequest setUserIpId(Object value) {
        putBody("user_ip_id", value);
        return this;
    }
}
