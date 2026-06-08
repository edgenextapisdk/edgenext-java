package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class OriginGroupAddOriginGroupRequest extends BaseRequest {
    public OriginGroupAddOriginGroupRequest() {
        super("OriginGroup_addOriginGroup", "POST");
    }

    public OriginGroupAddOriginGroupRequest setName(Object value) {
        putBody("name", value);
        return this;
    }

    public OriginGroupAddOriginGroupRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public OriginGroupAddOriginGroupRequest setOrigins(Object value) {
        putBody("origins", value);
        return this;
    }
}
