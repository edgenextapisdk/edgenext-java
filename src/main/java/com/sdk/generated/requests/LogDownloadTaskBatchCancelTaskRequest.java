package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class LogDownloadTaskBatchCancelTaskRequest extends BaseRequest {
    public LogDownloadTaskBatchCancelTaskRequest() {
        super("LogDownloadTask_batchCancelTask", "DELETE");
    }

    public LogDownloadTaskBatchCancelTaskRequest setTaskIds(Object value) {
        putBody("task_ids", value);
        return this;
    }
}
