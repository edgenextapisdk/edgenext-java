package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UserIpCopyUserIpRequest extends BaseRequest {
    public UserIpCopyUserIpRequest() {
        super("UserIp_CopyUserIp", "POST");
    }

    public UserIpCopyUserIpRequest setUserIpId(Object value) {
        putBody("user_ip_id", value);
        return this;
    }

    public UserIpCopyUserIpRequest setName(Object value) {
        putBody("name", value);
        return this;
    }

    public UserIpCopyUserIpRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
