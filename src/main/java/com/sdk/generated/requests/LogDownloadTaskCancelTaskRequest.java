package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class LogDownloadTaskCancelTaskRequest extends BaseRequest {
    public LogDownloadTaskCancelTaskRequest() {
        super("LogDownloadTask_cancelTask", "POST");
    }

    public LogDownloadTaskCancelTaskRequest setTaskId(Object value) {
        putBody("task_id", value);
        return this;
    }
}
