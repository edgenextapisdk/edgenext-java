package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class LogDownloadTemplateBatchDelTemplateRequest extends BaseRequest {
    public LogDownloadTemplateBatchDelTemplateRequest() {
        super("LogDownloadTemplate_batchDelTemplate", "DELETE");
    }

    public LogDownloadTemplateBatchDelTemplateRequest setTemplateIds(Object value) {
        putBody("template_ids", value);
        return this;
    }
}
