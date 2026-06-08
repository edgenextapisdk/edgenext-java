package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class LogDownloadTemplateDelTemplateRequest extends BaseRequest {
    public LogDownloadTemplateDelTemplateRequest() {
        super("LogDownloadTemplate_delTemplate", "DELETE");
    }

    public LogDownloadTemplateDelTemplateRequest setTemplateId(Object value) {
        putBody("template_id", value);
        return this;
    }
}
