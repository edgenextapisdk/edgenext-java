package com.sdk.generated;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Code generated from apidoc metadata. DO NOT EDIT.
public class ApiDefinition {
    private final String apiName;
    private final String methodName;
    private final String requestClass;
    private final List<String> methods;
    private final String path;
    private final String title;
    private final String source;

    public ApiDefinition(String apiName, String methodName, String requestClass, String[] methods, String path, String title, String source) {
        this.apiName = apiName;
        this.methodName = methodName;
        this.requestClass = requestClass;
        this.methods = Collections.unmodifiableList(Arrays.asList(methods));
        this.path = path;
        this.title = title;
        this.source = source;
    }

    public String getApiName() { return apiName; }
    public String getMethodName() { return methodName; }
    public String getRequestClass() { return requestClass; }
    public List<String> getMethods() { return methods; }
    public String getPath() { return path; }
    public String getTitle() { return title; }
    public String getSource() { return source; }

    public boolean supportsMethod(String method) {
        for (String candidate : methods) {
            if (candidate.equalsIgnoreCase(method)) {
                return true;
            }
        }
        return false;
    }
}
