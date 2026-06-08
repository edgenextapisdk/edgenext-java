package com.sdk.generated;

import com.alibaba.fastjson.JSONObject;

// Code generated from apidoc metadata. DO NOT EDIT.
public class ApiException extends RuntimeException {
    private final Integer code;
    private final JSONObject response;

    public ApiException(String message) {
        super(message);
        this.code = null;
        this.response = null;
    }

    public ApiException(Integer code, String message, JSONObject response) {
        super(message == null || message.isEmpty() ? "api error" : message);
        this.code = code;
        this.response = response;
    }

    public Integer getCode() { return code; }
    public JSONObject getResponse() { return response; }
}
