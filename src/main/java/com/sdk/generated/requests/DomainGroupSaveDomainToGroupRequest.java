package com.sdk.generated.requests;

import com.sdk.generated.BaseRequest;

// Code generated from apidoc metadata. DO NOT EDIT.
public class DomainGroupSaveDomainToGroupRequest extends BaseRequest {
    public DomainGroupSaveDomainToGroupRequest() {
        super("DomainGroup_saveDomainToGroup", "POST");
    }

    public DomainGroupSaveDomainToGroupRequest setGroupId(Object value) {
        putBody("group_id", value);
        return this;
    }

    public DomainGroupSaveDomainToGroupRequest setDomainIds(Object value) {
        putBody("domain_ids", value);
        return this;
    }

    public DomainGroupSaveDomainToGroupRequest setDomains(Object value) {
        putBody("domains", value);
        return this;
    }

    public DomainGroupSaveDomainToGroupRequest setOnlyUnbindTplDomainGroup(Object value) {
        putBody("only_unbind_tpl_domain_group", value);
        return this;
    }

    public DomainGroupSaveDomainToGroupRequest setAction(Object value) {
        putBody("action", value);
        return this;
    }
}
