package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class WebCdnCleanCacheSaveCacheRequest extends BaseRequest {
    public WebCdnCleanCacheSaveCacheRequest() {
        super("WebCdnCleanCache_saveCache", "PUT");
    }

    public WebCdnCleanCacheSaveCacheRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public WebCdnCleanCacheSaveCacheRequest setProtocol(Object value) {
        putBody("protocol", value);
        return this;
    }

    public WebCdnCleanCacheSaveCacheRequest setPort(Object value) {
        putBody("port", value);
        return this;
    }

    public WebCdnCleanCacheSaveCacheRequest setWholesite(Object value) {
        putBody("wholesite", value);
        return this;
    }

    public WebCdnCleanCacheSaveCacheRequest setSpecialurl(Object value) {
        putBody("specialurl", value);
        return this;
    }

    public WebCdnCleanCacheSaveCacheRequest setSpecialdir(Object value) {
        putBody("specialdir", value);
        return this;
    }
}
