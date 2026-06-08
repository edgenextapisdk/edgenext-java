package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class LogDownloadTaskAddTaskRequest extends BaseRequest {
    public LogDownloadTaskAddTaskRequest() {
        super("LogDownloadTask_addTask", "POST");
        putBody("lang", "zh_CN");
    }

    public LogDownloadTaskAddTaskRequest setTaskName(Object value) {
        putBody("task_name", value);
        return this;
    }

    public LogDownloadTaskAddTaskRequest setIsUseTemplate(Object value) {
        putBody("is_use_template", value);
        return this;
    }

    public LogDownloadTaskAddTaskRequest setTemplateId(Object value) {
        putBody("template_id", value);
        return this;
    }

    public LogDownloadTaskAddTaskRequest setDataSource(Object value) {
        putBody("data_source", value);
        return this;
    }

    public LogDownloadTaskAddTaskRequest setDownloadFields(Object value) {
        putBody("download_fields", value);
        return this;
    }

    public LogDownloadTaskAddTaskRequest setSearchTerms(Object value) {
        putBody("search_terms", value);
        return this;
    }

    public LogDownloadTaskAddTaskRequest setFileType(Object value) {
        putBody("file_type", value);
        return this;
    }

    public LogDownloadTaskAddTaskRequest setStartTime(Object value) {
        putBody("start_time", value);
        return this;
    }

    public LogDownloadTaskAddTaskRequest setEndTime(Object value) {
        putBody("end_time", value);
        return this;
    }

    public LogDownloadTaskAddTaskRequest setLang(Object value) {
        putBody("lang", value);
        return this;
    }
}
