package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class NetworkSpeedUpdateTemplateConfigRequest extends BaseRequest {
    public NetworkSpeedUpdateTemplateConfigRequest() {
        super("NetworkSpeedUpdateTemplateConfig", "PUT");
    }

    public NetworkSpeedUpdateTemplateConfigRequest setBusinessId(Object value) {
        putBody("business_id", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setBusinessType(Object value) {
        putBody("business_type", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setDomainProxyConf(Object value) {
        putBody("domain_proxy_conf", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setUpstreamRedirect(Object value) {
        putBody("upstream_redirect", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setCustomizedReqHeaders(Object value) {
        putBody("customized_req_headers", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setSourceSiteProtect(Object value) {
        putBody("source_site_protect", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setSlice(Object value) {
        putBody("slice", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setHttps(Object value) {
        putBody("https", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setPageGzip(Object value) {
        putBody("page_gzip", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setWebp(Object value) {
        putBody("webp", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setUploadFile(Object value) {
        putBody("upload_file", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setWebsocket(Object value) {
        putBody("websocket", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setMobileJump(Object value) {
        putBody("mobile_jump", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setCustomPage(Object value) {
        putBody("custom_page", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setUpstreamUriChange(Object value) {
        putBody("upstream_uri_change", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setRespHeaders(Object value) {
        putBody("resp_headers", value);
        return this;
    }

    public NetworkSpeedUpdateTemplateConfigRequest setUpstreamCheck(Object value) {
        putBody("upstream_check", value);
        return this;
    }
}
