package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class OriginGroupDelOriginGroupRequest extends BaseRequest {
    public OriginGroupDelOriginGroupRequest() {
        super("OriginGroup_delOriginGroup", "DELETE");
    }

    public OriginGroupDelOriginGroupRequest setIds(Object value) {
        putBody("ids", value);
        return this;
    }
}
