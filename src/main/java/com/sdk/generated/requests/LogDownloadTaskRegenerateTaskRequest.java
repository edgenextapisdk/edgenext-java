package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class LogDownloadTaskRegenerateTaskRequest extends BaseRequest {
    public LogDownloadTaskRegenerateTaskRequest() {
        super("LogDownloadTask_regenerateTask", "POST");
    }

    public LogDownloadTaskRegenerateTaskRequest setTaskId(Object value) {
        putBody("task_id", value);
        return this;
    }
}
