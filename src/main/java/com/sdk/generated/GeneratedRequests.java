package com.sdk.generated;

// Code generated from apidoc metadata. DO NOT EDIT.
public final class GeneratedRequests {
    private GeneratedRequests() {}

    public static BaseRequest cdnHighDefenseIpGetArticleIp() {
        return new BaseRequest("CdnHighDefenseIP_getArticleIP", "GET");
    }

    public static BaseRequest dnsDomainGetDomainList() {
        return new BaseRequest("DnsDomain_getDomainList", "GET");
    }

    public static BaseRequest dnsDomainAddDomain() {
        return new BaseRequest("DnsDomain_addDomain", "POST");
    }

    public static BaseRequest dnsDomainBatchAddDomains() {
        return new BaseRequest("DnsDomain_batchAddDomains", "POST");
    }

    public static BaseRequest dnsDomainBatchDeleteDomains() {
        return new BaseRequest("DnsDomain_batchDeleteDomains", "DELETE");
    }

    public static BaseRequest dnsDomainGetDomainStat() {
        return new BaseRequest("DnsDomain_getDomainStat", "GET");
    }

    public static BaseRequest dnsDomainGetDomainServers() {
        return new BaseRequest("DnsDomain_getDomainServers", "GET");
    }

    public static BaseRequest dnsDomainGetTasksList() {
        return new BaseRequest("DnsDomain_getTasksList", "GET");
    }

    public static BaseRequest dnsDomainGetTaskDetail() {
        return new BaseRequest("DnsDomain_getTaskDetail", "GET");
    }

    public static BaseRequest cloudDnsDomainGroupGetGroupList() {
        return new BaseRequest("CloudDns_DomainGroup_getGroupList", "GET");
    }

    public static BaseRequest cloudDnsDomainGroupAddGroup() {
        return new BaseRequest("CloudDns_DomainGroup_addGroup", "POST");
    }

    public static BaseRequest cloudDnsDomainGroupUpdateGroup() {
        return new BaseRequest("CloudDns_DomainGroup_updateGroup", "PUT");
    }

    public static BaseRequest cloudDnsDomainGroupDeleteGroup() {
        return new BaseRequest("CloudDns_DomainGroup_deleteGroup", "DELETE");
    }

    public static BaseRequest cloudDnsDomainGroupGetGroupRecordList() {
        return new BaseRequest("CloudDns_DomainGroup_getGroupRecordList", "GET");
    }

    public static BaseRequest cloudDnsDomainGroupSaveDomainToGroup() {
        return new BaseRequest("CloudDns_DomainGroup_saveDomainToGroup", "POST");
    }

    public static BaseRequest cloudDnsDomainGroupGetGroupDomainList() {
        return new BaseRequest("CloudDns_DomainGroup_getGroupDomainList", "POST");
    }

    public static BaseRequest cloudDnsDomainGroupGetGroupUndistributedDomainList() {
        return new BaseRequest("CloudDns_DomainGroup_getGroupUndistributedDomainList", "POST");
    }

    public static BaseRequest dnsDomainRecordsGetRecordTypes() {
        return new BaseRequest("DnsDomainRecords_getRecordTypes", "GET");
    }

    public static BaseRequest dnsDomainRecordsGetRecordList() {
        return new BaseRequest("DnsDomainRecords_getRecordList", "GET");
    }

    public static BaseRequest dnsDomainRecordsAddRecord() {
        return new BaseRequest("DnsDomainRecords_addRecord", "POST");
    }

    public static BaseRequest dnsDomainRecordsBatchAddRecords() {
        return new BaseRequest("DnsDomainRecords_batchAddRecords", "POST");
    }

    public static BaseRequest dnsDomainRecordsEditRecord() {
        return new BaseRequest("DnsDomainRecords_editRecord", "PUT");
    }

    public static BaseRequest dnsDomainRecordsBatchPauseRecords() {
        return new BaseRequest("DnsDomainRecords_batchPauseRecords", "POST");
    }

    public static BaseRequest dnsDomainRecordsBatchEnableRecords() {
        return new BaseRequest("DnsDomainRecords_batchEnableRecords", "POST");
    }

    public static BaseRequest dnsDomainRecordsDeleteRecord() {
        return new BaseRequest("DnsDomainRecords_deleteRecord", "DELETE");
    }

    public static BaseRequest dnsDomainRecordsImportRecords() {
        return new BaseRequest("DnsDomainRecords_importRecords", "POST");
    }

    public static BaseRequest dnsDomainRecordsExportRecords() {
        return new BaseRequest("DnsDomainRecords_exportRecords", "POST");
    }

    public static BaseRequest dnsDomainRecordsGetLines() {
        return new BaseRequest("DnsDomainRecords_getLines", "GET");
    }

    public static BaseRequest dnsDomainRecordsBatchDeleteRecords() {
        return new BaseRequest("DnsDomainRecords_batchDeleteRecords", "POST");
    }

    public static BaseRequest dnsDomainRecordsGetRecordGroupsList() {
        return new BaseRequest("DnsDomainRecords_getRecordGroupsList", "GET");
    }

    public static BaseRequest dnsDomainRecordsAddRecordGroup() {
        return new BaseRequest("DnsDomainRecords_addRecordGroup", "POST");
    }

    public static BaseRequest dnsDomainRecordsAddRecordGroupRelations() {
        return new BaseRequest("DnsDomainRecords_addRecordGroupRelations", "POST");
    }

    public static BaseRequest dnsDomainRecordsDeleteRecordGroup() {
        return new BaseRequest("DnsDomainRecords_deleteRecordGroup", "DELETE");
    }

    public static BaseRequest userIpUserIpList() {
        return new BaseRequest("UserIp_userIpList", "GET");
    }

    public static BaseRequest userIpUserIpAdd() {
        return new BaseRequest("UserIp_userIpAdd", "POST");
    }

    public static BaseRequest userIpUserIpSave() {
        return new BaseRequest("UserIp_userIpSave", "PUT");
    }

    public static BaseRequest userIpUserIpDel() {
        return new BaseRequest("UserIp_userIpDel", "DELETE");
    }

    public static BaseRequest userIpListUserIpItem() {
        return new BaseRequest("UserIp_listUserIpItem", "GET");
    }

    public static BaseRequest userIpAddUserIpItem() {
        return new BaseRequest("UserIp_AddUserIpItem", "POST");
    }

    public static BaseRequest userIpUpdateUserIpItem() {
        return new BaseRequest("UserIp_UpdateUserIpItem", "PUT");
    }

    public static BaseRequest userIpBatchDeleteUserIpItem() {
        return new BaseRequest("UserIp_BatchDeleteUserIpItem", "DELETE");
    }

    public static BaseRequest userIpDeleteAllUserIpItem() {
        return new BaseRequest("UserIp_DeleteAllUserIpItem", "POST");
    }

    public static BaseRequest userIpCopyUserIp() {
        return new BaseRequest("UserIp_CopyUserIp", "POST");
    }

    public static BaseRequest userIpFileSaveIpItem() {
        return new BaseRequest("UserIp_FileSaveIpItem", "POST");
    }

    public static BaseRequest serviceBatchListTask() {
        return new BaseRequest("service_batch_ListTask", "GET");
    }

    public static BaseRequest serviceBatchListSubTask() {
        return new BaseRequest("service_batch_ListSubTask", "GET");
    }

    public static BaseRequest webCdnCleanCacheGetCacheList() {
        return new BaseRequest("WebCdnCleanCache_getCacheList", "GET");
    }

    public static BaseRequest webCdnCleanCacheSaveCache() {
        return new BaseRequest("WebCdnCleanCache_saveCache", "PUT");
    }

    public static BaseRequest webCdnCleanCacheGetTaskList() {
        return new BaseRequest("WebCdnCleanCache_getTaskList", "GET");
    }

    public static BaseRequest webCdnCleanCacheGetTaskDetail() {
        return new BaseRequest("WebCdnCleanCache_getTaskDetail", "GET");
    }

    public static BaseRequest webCdnPreheatCacheGetPreheatCacheQuota() {
        return new BaseRequest("WebCdnPreheatCache_getPreheatCacheQuota", "GET");
    }

    public static BaseRequest webCdnPreheatCacheGetPreheatCacheList() {
        return new BaseRequest("WebCdnPreheatCache_getPreheatCacheList", "GET");
    }

    public static BaseRequest webCdnPreheatCacheSavePreheatCache() {
        return new BaseRequest("WebCdnPreheatCache_savePreheatCache", "POST");
    }

    public static BaseRequest oplogInfo() {
        return new BaseRequest("Oplog_info", "GET");
    }

    public static BaseRequest oplogMap() {
        return new BaseRequest("Oplog_map", "GET");
    }

    public static BaseRequest oplogGetOplogs() {
        return new BaseRequest("Oplog_getOplogs", "GET");
    }

    public static BaseRequest caCertificateSelfAddCa() {
        return new BaseRequest("CaCertificateSelf_addCa", "POST");
    }

    public static BaseRequest batchCaList() {
        return new BaseRequest("Batch_caList", "POST");
    }

    public static BaseRequest caCertificateSelfSaveTextCaInfo() {
        return new BaseRequest("CaCertificateSelf_saveTextCaInfo", "POST");
    }

    public static BaseRequest caCertificateSelfEditCaInfo() {
        return new BaseRequest("CaCertificateSelf_editCaInfo", "POST");
    }

    public static BaseRequest caCertificateSelfListCa() {
        return new BaseRequest("CaCertificateSelf_listCa", "GET");
    }

    public static BaseRequest caCertificateSelfCaExport() {
        return new BaseRequest("CaCertificateSelf_caExport", "GET");
    }

    public static BaseRequest caCertificateSelfBatchOperatSsl() {
        return new BaseRequest("CaCertificateSelf_batchOperatSsl", "GET");
    }

    public static BaseRequest caCertificateSelfDelCa() {
        return new BaseRequest("CaCertificateSelf_delCa", "DELETE");
    }

    public static BaseRequest caCertificateSelfGetCaDetail() {
        return new BaseRequest("CaCertificateSelf_getCaDetail", "GET");
    }

    public static BaseRequest caCertificateSelfEditCaName() {
        return new BaseRequest("CaCertificateSelf_editCaName", "POST");
    }

    public static BaseRequest caCertificateApplyAddApplyCa() {
        return new BaseRequest("CaCertificateApply_addApplyCa", "POST");
    }

    public static BaseRequest caCertificateApplyGetAddByNsSetting() {
        return new BaseRequest("CaCertificateApply_getAddByNsSetting", "GET");
    }

    public static BaseRequest domainGroupSaveGroup() {
        return new BaseRequest("DomainGroup_saveGroup", "POST");
    }

    public static BaseRequest domainGroupGetGroupList() {
        return new BaseRequest("DomainGroup_getGroupList", "GET");
    }

    public static BaseRequest domainGroupDelGroup() {
        return new BaseRequest("DomainGroup_delGroup", "POST");
    }

    public static BaseRequest domainGroupGetGroupDomainList() {
        return new BaseRequest("DomainGroup_getGroupDomainList", "GET");
    }

    public static BaseRequest domainGroupGgtUndistributedDomainList() {
        return new BaseRequest("DomainGroup_ggtUndistributedDomainList", "GET");
    }

    public static BaseRequest domainGroupAddGroup() {
        return new BaseRequest("DomainGroup_addGroup", "POST");
    }

    public static BaseRequest domainGroupSaveDomainToGroup() {
        return new BaseRequest("DomainGroup_saveDomainToGroup", "POST");
    }

    public static BaseRequest domainGroupGetGroupInfo() {
        return new BaseRequest("DomainGroup_getGroupInfo", "GET");
    }

    public static BaseRequest domainGroupMoveDomain() {
        return new BaseRequest("DomainGroup_moveDomain", "POST");
    }

    public static BaseRequest listDomains() {
        return new BaseRequest("ListDomains", "GET");
    }

    public static BaseRequest addDomains() {
        return new BaseRequest("AddDomains", "POST");
    }

    public static BaseRequest updateDomains() {
        return new BaseRequest("UpdateDomains", "PUT");
    }

    public static BaseRequest bindDomainCert() {
        return new BaseRequest("BindDomainCert", "POST");
    }

    public static BaseRequest unBindDomainCert() {
        return new BaseRequest("UnBindDomainCert", "POST");
    }

    public static BaseRequest deleteDomains() {
        return new BaseRequest("DeleteDomains", "DELETE");
    }

    public static BaseRequest disableDomains() {
        return new BaseRequest("DisableDomains", "POST");
    }

    public static BaseRequest enableDomains() {
        return new BaseRequest("EnableDomains", "POST");
    }

    public static BaseRequest refreshDomainsAccess() {
        return new BaseRequest("RefreshDomainsAccess", "POST");
    }

    public static BaseRequest exportDomains() {
        return new BaseRequest("ExportDomains", "POST");
    }

    public static BaseRequest addOrigins() {
        return new BaseRequest("AddOrigins", "POST");
    }

    public static BaseRequest updateOrigins() {
        return new BaseRequest("UpdateOrigins", "PUT");
    }

    public static BaseRequest deleteOrigins() {
        return new BaseRequest("DeleteOrigins", "DELETE");
    }

    public static BaseRequest listOrigins() {
        return new BaseRequest("ListOrigins", "GET");
    }

    public static BaseRequest switchDomainNodes() {
        return new BaseRequest("SwitchDomainNodes", "POST");
    }

    public static BaseRequest switchDomainAccessMode() {
        return new BaseRequest("SwitchDomainAccessMode", "POST");
    }

    public static BaseRequest updateDomainBaseSettings() {
        return new BaseRequest("UpdateDomainBaseSettings", "PUT");
    }

    public static BaseRequest getDomainBaseSettings() {
        return new BaseRequest("GetDomainBaseSettings", "GET");
    }

    public static BaseRequest listBriefDomains() {
        return new BaseRequest("ListBriefDomains", "POST");
    }

    public static BaseRequest getDomainTemplates() {
        return new BaseRequest("GetDomainTemplates", "GET");
    }

    public static BaseRequest accessInfoDownload() {
        return new BaseRequest("AccessInfoDownload", "POST");
    }

    public static BaseRequest originGroupGetOriginGroupList() {
        return new BaseRequest("OriginGroup_getOriginGroupList", "GET");
    }

    public static BaseRequest originGroupGetOriginGroupInfo() {
        return new BaseRequest("OriginGroup_getOriginGroupInfo", "GET");
    }

    public static BaseRequest originGroupAddOriginGroup() {
        return new BaseRequest("OriginGroup_addOriginGroup", "POST");
    }

    public static BaseRequest originGroupUpdateOriginGroup() {
        return new BaseRequest("OriginGroup_updateOriginGroup", "PUT");
    }

    public static BaseRequest originGroupDelOriginGroup() {
        return new BaseRequest("OriginGroup_delOriginGroup", "DELETE");
    }

    public static BaseRequest originGroupBindOriginGroupToDomains() {
        return new BaseRequest("OriginGroup_bindOriginGroupToDomains", "POST");
    }

    public static BaseRequest originGroupGetAllOriginGroups() {
        return new BaseRequest("OriginGroup_getAllOriginGroups", "GET");
    }

    public static BaseRequest originGroupCopyOriginGroup() {
        return new BaseRequest("OriginGroup_copyOriginGroup", "POST");
    }

    public static BaseRequest fireWallReportGetBlockList() {
        return new BaseRequest("FireWallReport_getBlockList", "GET");
    }

    public static BaseRequest fireWallReportGetBlockDetails() {
        return new BaseRequest("FireWallReport_getBlockDetails", "GET");
    }

    public static BaseRequest fireWallReportGetPackageBlockList() {
        return new BaseRequest("FireWallReport_getPackageBlockList", "GET");
    }

    public static BaseRequest fireWallReportGetPackageBlockDetails() {
        return new BaseRequest("FireWallReport_getPackageBlockDetails", "GET");
    }

    public static BaseRequest ccQpsMax() {
        return new BaseRequest("cc_qps_max", "POST");
    }

    public static BaseRequest ccAttackTimes() {
        return new BaseRequest("cc_attack_times", "POST");
    }

    public static BaseRequest ccTimesLine() {
        return new BaseRequest("cc_times_line", "POST");
    }

    public static BaseRequest ccReportStats() {
        return new BaseRequest("cc_report_stats", "POST");
    }

    public static BaseRequest cdnDomainUaispDistribute() {
        return new BaseRequest("cdn_domain_uaisp_distribute", "POST");
    }

    public static BaseRequest cdnDomainCountryDistribute() {
        return new BaseRequest("cdn_domain_country_distribute", "POST");
    }

    public static BaseRequest cdnDomainProvinceDistribute() {
        return new BaseRequest("cdn_domain_province_distribute", "POST");
    }

    public static BaseRequest cdnDomainStatusDistribute() {
        return new BaseRequest("cdn_domain_status_distribute", "POST");
    }

    public static BaseRequest cdnDomainNodeFlowBandwidth() {
        return new BaseRequest("cdn_domain_node_flow_bandwidth", "POST");
    }

    public static BaseRequest cdnDomainNodeFlowBandwidthCn2() {
        return new BaseRequest("cdn_domain_node_flow_bandwidth_cn2", "POST");
    }

    public static BaseRequest cdnDomainNodeFlowBandwidthNode() {
        return new BaseRequest("cdn_domain_node_flow_bandwidth_node", "POST");
    }

    public static BaseRequest domainTimes() {
        return new BaseRequest("domainTimes", "POST");
    }

    public static BaseRequest domainQps() {
        return new BaseRequest("domainQps", "POST");
    }

    public static BaseRequest cdnDomainFlowLine() {
        return new BaseRequest("cdn_domain_flow_line", "POST");
    }

    public static BaseRequest cdnDomainBandwidthLine() {
        return new BaseRequest("cdn_domain_bandwidth_line", "POST");
    }

    public static BaseRequest cdnDomainBandwidth95() {
        return new BaseRequest("cdn_domain_bandwidth_95", "POST");
    }

    public static BaseRequest cdnDomainPvtimes() {
        return new BaseRequest("cdn_domain_pvtimes", "POST");
    }

    public static BaseRequest cdnDomainFlowTop() {
        return new BaseRequest("cdn_domain_flow_top", "POST");
    }

    public static BaseRequest cdnDomainBandwidthTop() {
        return new BaseRequest("cdn_domain_bandwidth_top", "POST");
    }

    public static BaseRequest cdnDomainTimesTop() {
        return new BaseRequest("cdn_domain_times_top", "POST");
    }

    public static BaseRequest cdnDomainTimesTopEs() {
        return new BaseRequest("cdn_domain_times_top_es", "POST");
    }

    public static BaseRequest cdnDomainUrlTop() {
        return new BaseRequest("cdn_domain_url_top", "POST");
    }

    public static BaseRequest cdnDomainRefererTop() {
        return new BaseRequest("cdn_domain_referer_top", "POST");
    }

    public static BaseRequest cdnDomainStatusTopDownload() {
        return new BaseRequest("cdn_domain_status_top_download", "POST");
    }

    public static BaseRequest cdnDomainBandwidthDownload() {
        return new BaseRequest("cdn_domain_bandwidth_download", "POST");
    }

    public static BaseRequest cdnDomainFlowDownload() {
        return new BaseRequest("cdn_domain_flow_download", "POST");
    }

    public static BaseRequest tcpBandwidth() {
        return new BaseRequest("tcp_bandwidth", "POST");
    }

    public static BaseRequest tcpCcFlaw() {
        return new BaseRequest("tcp_cc_flaw", "POST");
    }

    public static BaseRequest wafAttackTimes() {
        return new BaseRequest("waf_attack_times", "POST");
    }

    public static BaseRequest wafReportStats() {
        return new BaseRequest("waf_report_stats", "POST");
    }

    public static BaseRequest wafWebshellEventList() {
        return new BaseRequest("waf_webshell_event_list", "POST");
    }

    public static BaseRequest wafWebshellEventDetail() {
        return new BaseRequest("waf_webshell_event_detail", "POST");
    }

    public static BaseRequest wafAttackEventList() {
        return new BaseRequest("waf_attack_event_list", "POST");
    }

    public static BaseRequest wafAttackEventDetail() {
        return new BaseRequest("waf_attack_event_detail", "POST");
    }

    public static BaseRequest wafScanEventList() {
        return new BaseRequest("waf_scan_event_list", "POST");
    }

    public static BaseRequest wafScanEventDetail() {
        return new BaseRequest("waf_scan_event_detail", "POST");
    }

    public static BaseRequest wafTypeLine() {
        return new BaseRequest("waf_type_line", "POST");
    }

    public static BaseRequest logDownloadTaskTaskList() {
        return new BaseRequest("LogDownloadTask_taskList", "POST");
    }

    public static BaseRequest logDownloadTaskAddTask() {
        return new BaseRequest("LogDownloadTask_addTask", "POST");
    }

    public static BaseRequest logDownloadTaskCancelTask() {
        return new BaseRequest("LogDownloadTask_cancelTask", "POST");
    }

    public static BaseRequest logDownloadTaskBatchCancelTask() {
        return new BaseRequest("LogDownloadTask_batchCancelTask", "DELETE");
    }

    public static BaseRequest logDownloadTaskDeleteTask() {
        return new BaseRequest("LogDownloadTask_deleteTask", "DELETE");
    }

    public static BaseRequest logDownloadTaskBatchDeleteTask() {
        return new BaseRequest("LogDownloadTask_batchDeleteTask", "DELETE");
    }

    public static BaseRequest logDownloadTaskRegenerateTask() {
        return new BaseRequest("LogDownloadTask_regenerateTask", "POST");
    }

    public static BaseRequest logDownloadFieldConfDownloadFields() {
        return new BaseRequest("LogDownloadFieldConf_downloadFields", "GET");
    }

    public static BaseRequest logDownloadTemplateTemplateList() {
        return new BaseRequest("LogDownloadTemplate_templateList", "POST");
    }

    public static BaseRequest logDownloadTemplateGetTemplateDomainList() {
        return new BaseRequest("LogDownloadTemplate_getTemplateDomainList", "GET");
    }

    public static BaseRequest logDownloadTemplateAddTemplate() {
        return new BaseRequest("LogDownloadTemplate_addTemplate", "POST");
    }

    public static BaseRequest logDownloadTemplateSaveTemplate() {
        return new BaseRequest("LogDownloadTemplate_saveTemplate", "POST");
    }

    public static BaseRequest logDownloadTemplateDelTemplate() {
        return new BaseRequest("LogDownloadTemplate_delTemplate", "DELETE");
    }

    public static BaseRequest logDownloadTemplateBatchDelTemplate() {
        return new BaseRequest("LogDownloadTemplate_batchDelTemplate", "DELETE");
    }

    public static BaseRequest logDownloadTemplateChangeStatus() {
        return new BaseRequest("LogDownloadTemplate_changeStatus", "POST");
    }

    public static BaseRequest logDownloadTemplateBatchChangeStatus() {
        return new BaseRequest("LogDownloadTemplate_batchChangeStatus", "POST");
    }

    public static BaseRequest logDownloadTemplateAllTemplate() {
        return new BaseRequest("LogDownloadTemplate_allTemplate", "POST");
    }

    public static BaseRequest logDownloadTemplateAllTemplateGroup() {
        return new BaseRequest("LogDownloadTemplate_allTemplateGroup", "POST");
    }

    public static BaseRequest tjkdPlusPackageGetMemberPackageList() {
        return new BaseRequest("TjkdPlusPackage_getMemberPackageList", "GET");
    }

    public static BaseRequest tjkdPlusPackageGetAllPackage() {
        return new BaseRequest("TjkdPlusPackage_getAllPackage", "GET");
    }

    public static BaseRequest tjkdPlusPackageGetPackageInfo() {
        return new BaseRequest("TjkdPlusPackage_getPackageInfo", "GET");
    }

    public static BaseRequest tjkdPlusPackageGetPackageIpList() {
        return new BaseRequest("TjkdPlusPackage_getPackageIpList", "GET");
    }

    public static BaseRequest tjkdPlusPackageGetPackageOverview() {
        return new BaseRequest("TjkdPlusPackage_getPackageOverview", "GET");
    }

    public static BaseRequest tjkdPlusPackageGetPackagePortList() {
        return new BaseRequest("TjkdPlusPackage_getPackagePortList", "GET");
    }

    public static BaseRequest tjkdPlusPackageSavePackage() {
        return new BaseRequest("TjkdPlusPackage_savePackage", "POST");
    }

    public static BaseRequest tjkdPlusPackageSavePackageHealthyConf() {
        return new BaseRequest("TjkdPlusPackage_savePackageHealthyConf", "POST");
    }

    public static BaseRequest tjkdPlusForwardRuleSavePlusForwardRule() {
        return new BaseRequest("TjkdPlusForwardRule_savePlusForwardRule", "POST");
    }

    public static BaseRequest tjkdPlusForwardRuleBatchAddPlusForwardRule() {
        return new BaseRequest("TjkdPlusForwardRule_batchAddPlusForwardRule", "POST");
    }

    public static BaseRequest tjkdPlusForwardRuleBatchSavePlusForwardRule() {
        return new BaseRequest("TjkdPlusForwardRule_batchSavePlusForwardRule", "POST");
    }

    public static BaseRequest tjkdPlusForwardRuleDelPlusForwardRule() {
        return new BaseRequest("TjkdPlusForwardRule_delPlusForwardRule", "DELETE");
    }

    public static BaseRequest tjkdPlusForwardRuleGetPlusForwardRuleList() {
        return new BaseRequest("TjkdPlusForwardRule_getPlusForwardRuleList", "GET");
    }

    public static BaseRequest tjkdPlusForwardRuleGetBatchPlusForwardRuleInfo() {
        return new BaseRequest("TjkdPlusForwardRule_getBatchPlusForwardRuleInfo", "POST");
    }

    public static BaseRequest tjkdPlusPackageGetPackageDomainList() {
        return new BaseRequest("TjkdPlusPackage_getPackageDomainList", "GET");
    }

    public static BaseRequest tjkdPlusDomainGetTjkdPlusDomainList() {
        return new BaseRequest("TjkdPlusDomain_getTjkdPlusDomainList", "GET");
    }

    public static BaseRequest tjkdPlusDomainAddTjkdPlusDomain() {
        return new BaseRequest("TjkdPlusDomain_addTjkdPlusDomain", "POST");
    }

    public static BaseRequest tjkdPlusDomainDelTjkdPlusDomain() {
        return new BaseRequest("TjkdPlusDomain_delTjkdPlusDomain", "DELETE");
    }

    public static BaseRequest networkSpeedGetCacheRuleList() {
        return new BaseRequest("NetworkSpeedGetCacheRuleList", "GET");
    }

    public static BaseRequest networkSpeedCreateCacheRule() {
        return new BaseRequest("NetworkSpeedCreateCacheRule", "POST");
    }

    public static BaseRequest networkSpeedUpdateCacheRule() {
        return new BaseRequest("NetworkSpeedUpdateCacheRule", "PUT");
    }

    public static BaseRequest networkSpeedUpdateCacheRuleConfig() {
        return new BaseRequest("NetworkSpeedUpdateCacheRuleConfig", "PUT");
    }

    public static BaseRequest networkSpeedUpdateCacheRuleStatus() {
        return new BaseRequest("NetworkSpeedUpdateCacheRuleStatus", "PUT");
    }

    public static BaseRequest networkSpeedSortCacheRules() {
        return new BaseRequest("NetworkSpeedSortCacheRules", "PUT");
    }

    public static BaseRequest networkSpeedGetGlobalCacheConfig() {
        return new BaseRequest("NetworkSpeedGetGlobalCacheConfig", "GET");
    }

    public static BaseRequest networkSpeedDeleteCacheRule() {
        return new BaseRequest("NetworkSpeedDeleteCacheRule", "DELETE");
    }

    public static BaseRequest networkSpeedGetTemplateConfig() {
        return new BaseRequest("NetworkSpeedGetTemplateConfig", "POST");
    }

    public static BaseRequest networkSpeedUpdateTemplateConfig() {
        return new BaseRequest("NetworkSpeedUpdateTemplateConfig", "PUT");
    }

    public static BaseRequest networkSpeedGetRules() {
        return new BaseRequest("NetworkSpeedGetRules", "GET");
    }

    public static BaseRequest networkSpeedCreateRule() {
        return new BaseRequest("NetworkSpeedCreateRule", "POST");
    }

    public static BaseRequest networkSpeedDeleteRule() {
        return new BaseRequest("NetworkSpeedDeleteRule", "DELETE");
    }

    public static BaseRequest networkSpeedSortRules() {
        return new BaseRequest("NetworkSpeedSortRules", "PUT");
    }

    public static BaseRequest networkSpeedUpdateRule() {
        return new BaseRequest("NetworkSpeedUpdateRule", "PUT");
    }

    public static BaseRequest updateRuleTemplate() {
        return new BaseRequest("UpdateRuleTemplate", "PUT");
    }

    public static BaseRequest deleteRuleTemplate() {
        return new BaseRequest("DeleteRuleTemplate", "DELETE");
    }

    public static BaseRequest getRuleTemplateList() {
        return new BaseRequest("GetRuleTemplateList", "GET");
    }

    public static BaseRequest unbindRuleTemplate() {
        return new BaseRequest("UnbindRuleTemplate", "PUT");
    }

    public static BaseRequest bindRuleTemplate() {
        return new BaseRequest("BindRuleTemplate", "PUT");
    }

    public static BaseRequest listRuleTpsDomains() {
        return new BaseRequest("ListRuleTpsDomains", "GET");
    }

    public static BaseRequest createRuleTemplate() {
        return new BaseRequest("CreateRuleTemplate", "POST");
    }

    public static BaseRequest switchDomainTemplate() {
        return new BaseRequest("SwitchDomainTemplate", "PUT");
    }

    public static BaseRequest firewallPageCfg() {
        return new BaseRequest("Firewall_pageCfg", "GET");
    }

    public static BaseRequest firewallPageCfgHwws() {
        return new BaseRequest("Firewall_pageCfgHwws", "GET");
    }

    public static BaseRequest firewallSavePolicy() {
        return new BaseRequest("Firewall_savePolicy", "POST");
    }

    public static BaseRequest firewallGetPolicy() {
        return new BaseRequest("Firewall_getPolicy", "GET");
    }

    public static BaseRequest firewallGetPolicyByCode() {
        return new BaseRequest("Firewall_getPolicyByCode", "GET");
    }

    public static BaseRequest firewallStatsPolicy() {
        return new BaseRequest("Firewall_statsPolicy", "GET");
    }

    public static BaseRequest firewallOpen() {
        return new BaseRequest("Firewall_open", "POST");
    }

    public static BaseRequest firewallStop() {
        return new BaseRequest("Firewall_stop", "POST");
    }

    public static BaseRequest firewallDelete() {
        return new BaseRequest("Firewall_delete", "POST");
    }

    public static BaseRequest firewallSort() {
        return new BaseRequest("Firewall_sort", "POST");
    }

    public static BaseRequest firewallGetsPolicyByMainid() {
        return new BaseRequest("Firewall_getsPolicyByMainid", "GET");
    }

    public static BaseRequest firewallGetsPolicyByPackageid() {
        return new BaseRequest("Firewall_getsPolicyByPackageid", "GET");
    }

    public static BaseRequest firewallSavePolicyGroup() {
        return new BaseRequest("Firewall_savePolicyGroup", "POST");
    }

    public static BaseRequest firewallGetsPolicyGroupByDomainid() {
        return new BaseRequest("Firewall_getsPolicyGroupByDomainid", "GET");
    }

    public static BaseRequest firewallStopGroup() {
        return new BaseRequest("Firewall_stopGroup", "POST");
    }

    public static BaseRequest firewallOpenGroup() {
        return new BaseRequest("Firewall_openGroup", "POST");
    }

    public static BaseRequest firewallDeleteGroup() {
        return new BaseRequest("Firewall_deleteGroup", "POST");
    }

    public static BaseRequest firewallSortGroup() {
        return new BaseRequest("Firewall_sortGroup", "POST");
    }

    public static BaseRequest firewallGetsPolicyByGroupId() {
        return new BaseRequest("Firewall_getsPolicyByGroupId", "GET");
    }

    public static BaseRequest getPolicyGroupTpl() {
        return new BaseRequest("getPolicyGroupTPL", "GET");
    }

    public static BaseRequest getDdosProtectionConfig() {
        return new BaseRequest("GetDdosProtectionConfig", "GET");
    }

    public static BaseRequest updateDdosProtectionConfig() {
        return new BaseRequest("UpdateDdosProtectionConfig", "PUT");
    }

    public static BaseRequest getWafRuleConfig() {
        return new BaseRequest("GetWafRuleConfig", "GET");
    }

    public static BaseRequest updateWafRuleConfig() {
        return new BaseRequest("UpdateWafRuleConfig", "PUT");
    }

    public static BaseRequest getMemberGlobalTemplate() {
        return new BaseRequest("GetMemberGlobalTemplate", "GET");
    }

    public static BaseRequest createTemplate() {
        return new BaseRequest("CreateTemplate", "POST");
    }

    public static BaseRequest createDomainTemplate() {
        return new BaseRequest("CreateDomainTemplate", "POST");
    }

    public static BaseRequest getTemplateList() {
        return new BaseRequest("GetTemplateList", "POST");
    }

    public static BaseRequest getTemplateBindDomainList() {
        return new BaseRequest("GetTemplateBindDomainList", "POST");
    }

    public static BaseRequest bindTemplateDomain() {
        return new BaseRequest("BindTemplateDomain", "POST");
    }

    public static BaseRequest deleteTemplate() {
        return new BaseRequest("DeleteTemplate", "DELETE");
    }

    public static BaseRequest batchConfigTemplate() {
        return new BaseRequest("BatchConfigTemplate", "POST");
    }

    public static BaseRequest iota() {
        return new BaseRequest("Iota", "GET");
    }

    public static BaseRequest getUnboundTemplateDomainList() {
        return new BaseRequest("GetUnboundTemplateDomainList", "POST");
    }

    public static BaseRequest editTemplate() {
        return new BaseRequest("EditTemplate", "PUT");
    }

    public static BaseRequest firewallSavePolicyGroupRegionalShielding() {
        return new BaseRequest("Firewall_savePolicyGroupRegionalShielding", "POST");
    }

    public static BaseRequest firewallSavePolicyGroupAntiLeech() {
        return new BaseRequest("Firewall_savePolicyGroupAntiLeech", "POST");
    }

    public static BaseRequest tjkdappsaveFirewallPolicy() {
        return new BaseRequest("TjkdappsaveFirewallPolicy", "POST");
    }

    public static BaseRequest tjkdappsortFirewallPolicy() {
        return new BaseRequest("TjkdappsortFirewallPolicy", "POST");
    }

    public static BaseRequest tjkdappopenFirewallPolicy() {
        return new BaseRequest("TjkdappopenFirewallPolicy", "POST");
    }

    public static BaseRequest tjkdappstopFirewallPolicy() {
        return new BaseRequest("TjkdappstopFirewallPolicy", "POST");
    }

    public static BaseRequest tjkdappgetFirewallPolicy() {
        return new BaseRequest("TjkdappgetFirewallPolicy", "GET");
    }

    public static BaseRequest tjkdappdeleteFirewallPolicy() {
        return new BaseRequest("TjkdappdeleteFirewallPolicy", "POST");
    }

    public static BaseRequest addForwardRule() {
        return new BaseRequest("addForwardRule", "POST");
    }

    public static BaseRequest deleteForwardRule() {
        return new BaseRequest("deleteForwardRule", "DELETE");
    }

    public static BaseRequest editRule() {
        return new BaseRequest("editRule", "POST");
    }

    public static BaseRequest ruleList() {
        return new BaseRequest("ruleList", "GET");
    }

    public static BaseRequest getRuleInfo() {
        return new BaseRequest("getRuleInfo", "GET");
    }

    public static BaseRequest tijkdappListPackage() {
        return new BaseRequest("TIJKDAPP_ListPackage", "GET");
    }

    public static BaseRequest tijkdappSavePackage() {
        return new BaseRequest("TIJKDAPP_SavePackage", "PUT");
    }

    public static BaseRequest getChannelList() {
        return new BaseRequest("getChannelList", "GET");
    }

    public static BaseRequest apiNameV5() {
        return new BaseRequest("api_name_v5", "POST");
    }
}
