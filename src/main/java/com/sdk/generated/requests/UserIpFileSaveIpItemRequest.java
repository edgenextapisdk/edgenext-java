package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UserIpFileSaveIpItemRequest extends BaseRequest {
    public UserIpFileSaveIpItemRequest() {
        super("UserIp_FileSaveIpItem", "POST");
    }

    public UserIpFileSaveIpItemRequest setContentType(String value) {
        putHeader("Content-Type", value);
        return this;
    }

    public UserIpFileSaveIpItemRequest setXToken(String value) {
        putHeader("x-token", value);
        return this;
    }

    public UserIpFileSaveIpItemRequest setAcceptLanguage(String value) {
        putHeader("Accept-Language", value);
        return this;
    }

    public UserIpFileSaveIpItemRequest setFile(Object value) {
        putBody("file", value);
        return this;
    }

    public UserIpFileSaveIpItemRequest setUserIpId(Object value) {
        putBody("user_ip_id", value);
        return this;
    }

    public UserIpFileSaveIpItemRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }
}
