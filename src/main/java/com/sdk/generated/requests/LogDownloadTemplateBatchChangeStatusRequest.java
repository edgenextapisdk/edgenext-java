package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class LogDownloadTemplateBatchChangeStatusRequest extends BaseRequest {
    public LogDownloadTemplateBatchChangeStatusRequest() {
        super("LogDownloadTemplate_batchChangeStatus", "POST");
    }

    public LogDownloadTemplateBatchChangeStatusRequest setTemplateIds(Object value) {
        putBody("template_ids", value);
        return this;
    }

    public LogDownloadTemplateBatchChangeStatusRequest setStatus(Object value) {
        putBody("status", value);
        return this;
    }
}
