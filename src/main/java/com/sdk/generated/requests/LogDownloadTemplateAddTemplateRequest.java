package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class LogDownloadTemplateAddTemplateRequest extends BaseRequest {
    public LogDownloadTemplateAddTemplateRequest() {
        super("LogDownloadTemplate_addTemplate", "POST");
    }

    public LogDownloadTemplateAddTemplateRequest setTemplateName(Object value) {
        putBody("template_name", value);
        return this;
    }

    public LogDownloadTemplateAddTemplateRequest setGroupName(Object value) {
        putBody("group_name", value);
        return this;
    }

    public LogDownloadTemplateAddTemplateRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public LogDownloadTemplateAddTemplateRequest setDataSource(Object value) {
        putBody("data_source", value);
        return this;
    }

    public LogDownloadTemplateAddTemplateRequest setStatus(Object value) {
        putBody("status", value);
        return this;
    }

    public LogDownloadTemplateAddTemplateRequest setDownloadFields(Object value) {
        putBody("download_fields", value);
        return this;
    }

    public LogDownloadTemplateAddTemplateRequest setSearchTerms(Object value) {
        putBody("search_terms", value);
        return this;
    }

    public LogDownloadTemplateAddTemplateRequest setDomainSelectType(Object value) {
        putBody("domain_select_type", value);
        return this;
    }
}
