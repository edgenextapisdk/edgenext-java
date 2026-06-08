package com.sdk.generated;

import java.util.HashMap;
import java.util.Map;

// Code generated from apidoc metadata. DO NOT EDIT.
public class BaseRequest {
    private final String apiName;
    private final String method;
    private final Map<String, Object> query = new HashMap<>();
    private final Map<String, Object> body = new HashMap<>();
    private final Map<String, String> headers = new HashMap<>();

    public BaseRequest(String apiName, String method) {
        this.apiName = apiName;
        this.method = method == null ? "" : method.toUpperCase();
    }

    public String getApiName() { return apiName; }
    public String getMethod() { return method; }
    public Map<String, Object> getQuery() { return new HashMap<>(query); }
    public Map<String, Object> getBody() { return new HashMap<>(body); }
    public Map<String, String> getHeaders() { return new HashMap<>(headers); }

    protected BaseRequest putQuery(String key, Object value) {
        query.put(key, value);
        return this;
    }

    protected BaseRequest putBody(String key, Object value) {
        body.put(key, value);
        return this;
    }

    public BaseRequest putHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }
}
