package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class WebCdnPreheatCacheSavePreheatCacheRequest extends BaseRequest {
    public WebCdnPreheatCacheSavePreheatCacheRequest() {
        super("WebCdnPreheatCache_savePreheatCache", "POST");
    }

    public WebCdnPreheatCacheSavePreheatCacheRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public WebCdnPreheatCacheSavePreheatCacheRequest setProtocol(Object value) {
        putBody("protocol", value);
        return this;
    }

    public WebCdnPreheatCacheSavePreheatCacheRequest setPort(Object value) {
        putBody("port", value);
        return this;
    }

    public WebCdnPreheatCacheSavePreheatCacheRequest setPreheatUrl(Object value) {
        putBody("preheat_url", value);
        return this;
    }
}
