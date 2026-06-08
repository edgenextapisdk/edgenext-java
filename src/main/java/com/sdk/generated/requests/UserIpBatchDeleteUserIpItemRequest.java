package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class UserIpBatchDeleteUserIpItemRequest extends BaseRequest {
    public UserIpBatchDeleteUserIpItemRequest() {
        super("UserIp_BatchDeleteUserIpItem", "DELETE");
    }

    public UserIpBatchDeleteUserIpItemRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }

    public UserIpBatchDeleteUserIpItemRequest setUserIpId(Object value) {
        putBody("user_ip_id", value);
        return this;
    }
}
