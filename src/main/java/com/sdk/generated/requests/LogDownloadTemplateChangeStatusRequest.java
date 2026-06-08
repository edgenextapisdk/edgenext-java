package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class LogDownloadTemplateChangeStatusRequest extends BaseRequest {
    public LogDownloadTemplateChangeStatusRequest() {
        super("LogDownloadTemplate_changeStatus", "POST");
    }

    public LogDownloadTemplateChangeStatusRequest setTemplateId(Object value) {
        putBody("template_id", value);
        return this;
    }

    public LogDownloadTemplateChangeStatusRequest setStatus(Object value) {
        putBody("status", value);
        return this;
    }
}
