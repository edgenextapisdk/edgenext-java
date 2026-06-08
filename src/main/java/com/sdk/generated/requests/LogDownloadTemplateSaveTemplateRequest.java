package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class LogDownloadTemplateSaveTemplateRequest extends BaseRequest {
    public LogDownloadTemplateSaveTemplateRequest() {
        super("LogDownloadTemplate_saveTemplate", "POST");
        putBody("status", "1");
    }

    public LogDownloadTemplateSaveTemplateRequest setTemplateId(Object value) {
        putBody("template_id", value);
        return this;
    }

    public LogDownloadTemplateSaveTemplateRequest setTemplateName(Object value) {
        putBody("template_name", value);
        return this;
    }

    public LogDownloadTemplateSaveTemplateRequest setGroupName(Object value) {
        putBody("group_name", value);
        return this;
    }

    public LogDownloadTemplateSaveTemplateRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public LogDownloadTemplateSaveTemplateRequest setDataSource(Object value) {
        putBody("data_source", value);
        return this;
    }

    public LogDownloadTemplateSaveTemplateRequest setStatus(Object value) {
        putBody("status", value);
        return this;
    }

    public LogDownloadTemplateSaveTemplateRequest setDownloadFields(Object value) {
        putBody("download_fields", value);
        return this;
    }

    public LogDownloadTemplateSaveTemplateRequest setSearchTerms(Object value) {
        putBody("search_terms", value);
        return this;
    }
}
