package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class LogDownloadTaskBatchDeleteTaskRequest extends BaseRequest {
    public LogDownloadTaskBatchDeleteTaskRequest() {
        super("LogDownloadTask_batchDeleteTask", "DELETE");
    }

    public LogDownloadTaskBatchDeleteTaskRequest setTaskIds(Object value) {
        putBody("task_ids", value);
        return this;
    }
}
