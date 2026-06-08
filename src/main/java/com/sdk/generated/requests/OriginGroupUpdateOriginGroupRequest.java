package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class OriginGroupUpdateOriginGroupRequest extends BaseRequest {
    public OriginGroupUpdateOriginGroupRequest() {
        super("OriginGroup_updateOriginGroup", "PUT");
    }

    public OriginGroupUpdateOriginGroupRequest setId(Object value) {
        putBody("id", value);
        return this;
    }

    public OriginGroupUpdateOriginGroupRequest setName(Object value) {
        putBody("name", value);
        return this;
    }

    public OriginGroupUpdateOriginGroupRequest setRemark(Object value) {
        putBody("remark", value);
        return this;
    }

    public OriginGroupUpdateOriginGroupRequest setOrigins(Object value) {
        putBody("origins", value);
        return this;
    }
}
