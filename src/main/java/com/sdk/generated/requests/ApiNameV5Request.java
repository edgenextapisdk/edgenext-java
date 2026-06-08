package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class ApiNameV5Request extends BaseRequest {
    public ApiNameV5Request() {
        super("api_name_v5", "POST");
        putHeader("x-lang", "zh");
    }

    public ApiNameV5Request setXLang(String value) {
        putHeader("x-lang", value);
        return this;
    }
}
