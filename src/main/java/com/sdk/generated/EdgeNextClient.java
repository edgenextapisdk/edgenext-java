package com.sdk.generated;

import com.alibaba.fastjson.JSONObject;
import com.sdk.Sdk;
import com.sdk.generated.requests.*;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Code generated from apidoc metadata. DO NOT EDIT.
public class EdgeNextClient {
    private final Sdk sdk;
    private final Map<String, String> defaultHeaders = new HashMap<>();

    public EdgeNextClient(Sdk sdk) {
        this.sdk = sdk;
    }

    public EdgeNextClient(Sdk sdk, Map<String, String> defaultHeaders) {
        this.sdk = sdk;
        if (defaultHeaders != null) {
            this.defaultHeaders.putAll(defaultHeaders);
        }
    }

    public EdgeNextClient setDefaultHeader(String key, String value) {
        this.defaultHeaders.put(key, value);
        return this;
    }

    public EdgeNextClient setLanguage(String lang) {
        return setDefaultHeader("X-Lang", lang);
    }

    public List<ApiDefinition> getApiDefinitions() { return ApiDefinitions.all(); }

    public JSONObject callApi(String apiName, BaseRequest request, Map<String, Object> query, Map<String, Object> body, Map<String, String> headers, String method) {
        ApiDefinition definition = ApiDefinitions.get(apiName);
        if (definition == null) {
            throw new IllegalArgumentException("unknown EdgeNext API: " + apiName);
        }
        return request(definition, request, query, body, headers, method);
    }

    private JSONObject request(ApiDefinition definition, BaseRequest request, Map<String, Object> query, Map<String, Object> body, Map<String, String> headers, String method) {
        String selected = method == null || method.isEmpty() ? definition.getMethods().get(0).toUpperCase() : method.toUpperCase();
        Map<String, Object> finalQuery = query == null ? new HashMap<>() : new HashMap<>(query);
        Map<String, Object> finalBody = body == null ? new HashMap<>() : new HashMap<>(body);
        Map<String, String> finalHeaders = mergeString(defaultHeaders, headers);

        if (request != null) {
            if (request.getApiName() != null && !request.getApiName().isEmpty() && !request.getApiName().equals(definition.getApiName())) {
                throw new IllegalArgumentException("request " + request.getApiName() + " cannot be used for API " + definition.getApiName());
            }
            finalQuery = merge(request.getQuery(), finalQuery);
            finalBody = merge(request.getBody(), finalBody);
            finalHeaders = mergeString(finalHeaders, request.getHeaders());
            if ((method == null || method.isEmpty()) && request.getMethod() != null && !request.getMethod().isEmpty()) {
                selected = request.getMethod().toUpperCase();
            }
        }
        if (!definition.supportsMethod(selected)) {
            throw new IllegalArgumentException(definition.getApiName() + " does not support " + selected);
        }
        if ("GET".equals(selected) && !finalBody.isEmpty()) {
            finalQuery = merge(finalBody, finalQuery);
            finalBody = new HashMap<>();
        }

        String api = apiPathToSdkApi(definition.getPath(), sdk.getApiUrlPre());
        JSONObject response;
        switch (selected) {
            case "GET":
                response = sdk.get(api, finalQuery, finalHeaders);
                break;
            case "POST":
                response = sdk.post(api, finalQuery, finalBody, finalHeaders);
                break;
            case "PUT":
                response = sdk.put(api, finalQuery, finalBody, finalHeaders);
                break;
            case "PATCH":
                response = sdk.patch(api, finalQuery, finalBody, finalHeaders);
                break;
            case "DELETE":
                response = sdk.delete(api, finalQuery, finalBody, finalHeaders);
                break;
            default:
                throw new IllegalArgumentException("unsupported HTTP method: " + selected);
        }
        return normalizeResponse(response);
    }

    private JSONObject normalizeResponse(JSONObject response) {
        if (response == null) {
            throw new ApiException("empty API response");
        }
        JSONObject status = response.getJSONObject("status");
        if (status == null) {
            return response;
        }
        Integer code = status.getInteger("code");
        String message = status.getString("message");
        if (code != null && code != 1) {
            throw new ApiException(code, message, response);
        }
        response.remove("code");
        response.remove("message");
        return response;
    }

    private static Map<String, Object> merge(Map<String, Object> base, Map<String, Object> override) {
        Map<String, Object> out = new HashMap<>();
        if (base != null) { out.putAll(base); }
        if (override != null) { out.putAll(override); }
        return out;
    }

    private static Map<String, String> mergeString(Map<String, String> base, Map<String, String> override) {
        Map<String, String> out = new HashMap<>();
        if (base != null) { out.putAll(base); }
        if (override != null) { out.putAll(override); }
        return out;
    }

    public static String apiPathToSdkApi(String path, String apiPre) {
        String route = path == null ? "" : path.trim().replaceFirst("^/+", "");
        String apiPrePath = "";
        try {
            apiPrePath = URI.create(apiPre == null ? "" : apiPre).getPath();
        } catch (IllegalArgumentException ignored) {
            apiPrePath = "";
        }
        apiPrePath = apiPrePath == null ? "" : apiPrePath.toLowerCase().replaceAll("^/+|/+$", "");
        String[] parts = apiPrePath.isEmpty() ? new String[0] : apiPrePath.split("/");
        if (parts.length >= 2 && "api".equals(parts[parts.length - 2]) && isVersionSegment(parts[parts.length - 1])) {
            String prefix = "api/" + parts[parts.length - 1] + "/";
            if (route.toLowerCase().startsWith(prefix)) {
                return route.substring(prefix.length());
            }
        }
        if (parts.length >= 1 && "api".equals(parts[parts.length - 1]) && route.toLowerCase().startsWith("api/")) {
            return route.substring("api/".length());
        }
        return route;
    }

    private static boolean isVersionSegment(String segment) {
        if (segment == null || segment.length() < 2 || segment.charAt(0) != 'v') {
            return false;
        }
        for (int i = 1; i < segment.length(); i++) {
            if (!Character.isDigit(segment.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public JSONObject cdnHighDefenseIpGetArticleIp(CdnHighDefenseIpGetArticleIpRequest request) {
        return callApi("CdnHighDefenseIP_getArticleIP", request, null, null, null, null);
    }

    public JSONObject dnsDomainGetDomainList(DnsDomainGetDomainListRequest request) {
        return callApi("DnsDomain_getDomainList", request, null, null, null, null);
    }

    public JSONObject dnsDomainAddDomain(DnsDomainAddDomainRequest request) {
        return callApi("DnsDomain_addDomain", request, null, null, null, null);
    }

    public JSONObject dnsDomainBatchAddDomains(DnsDomainBatchAddDomainsRequest request) {
        return callApi("DnsDomain_batchAddDomains", request, null, null, null, null);
    }

    public JSONObject dnsDomainBatchDeleteDomains(DnsDomainBatchDeleteDomainsRequest request) {
        return callApi("DnsDomain_batchDeleteDomains", request, null, null, null, null);
    }

    public JSONObject dnsDomainGetDomainStat(DnsDomainGetDomainStatRequest request) {
        return callApi("DnsDomain_getDomainStat", request, null, null, null, null);
    }

    public JSONObject dnsDomainGetDomainServers(DnsDomainGetDomainServersRequest request) {
        return callApi("DnsDomain_getDomainServers", request, null, null, null, null);
    }

    public JSONObject dnsDomainGetTasksList(DnsDomainGetTasksListRequest request) {
        return callApi("DnsDomain_getTasksList", request, null, null, null, null);
    }

    public JSONObject dnsDomainGetTaskDetail(DnsDomainGetTaskDetailRequest request) {
        return callApi("DnsDomain_getTaskDetail", request, null, null, null, null);
    }

    public JSONObject cloudDnsDomainGroupGetGroupList(CloudDnsDomainGroupGetGroupListRequest request) {
        return callApi("CloudDns_DomainGroup_getGroupList", request, null, null, null, null);
    }

    public JSONObject cloudDnsDomainGroupAddGroup(CloudDnsDomainGroupAddGroupRequest request) {
        return callApi("CloudDns_DomainGroup_addGroup", request, null, null, null, null);
    }

    public JSONObject cloudDnsDomainGroupUpdateGroup(CloudDnsDomainGroupUpdateGroupRequest request) {
        return callApi("CloudDns_DomainGroup_updateGroup", request, null, null, null, null);
    }

    public JSONObject cloudDnsDomainGroupDeleteGroup(CloudDnsDomainGroupDeleteGroupRequest request) {
        return callApi("CloudDns_DomainGroup_deleteGroup", request, null, null, null, null);
    }

    public JSONObject cloudDnsDomainGroupGetGroupRecordList(CloudDnsDomainGroupGetGroupRecordListRequest request) {
        return callApi("CloudDns_DomainGroup_getGroupRecordList", request, null, null, null, null);
    }

    public JSONObject cloudDnsDomainGroupSaveDomainToGroup(CloudDnsDomainGroupSaveDomainToGroupRequest request) {
        return callApi("CloudDns_DomainGroup_saveDomainToGroup", request, null, null, null, null);
    }

    public JSONObject cloudDnsDomainGroupGetGroupDomainList(CloudDnsDomainGroupGetGroupDomainListRequest request) {
        return callApi("CloudDns_DomainGroup_getGroupDomainList", request, null, null, null, null);
    }

    public JSONObject cloudDnsDomainGroupGetGroupUndistributedDomainList(CloudDnsDomainGroupGetGroupUndistributedDomainListRequest request) {
        return callApi("CloudDns_DomainGroup_getGroupUndistributedDomainList", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsGetRecordTypes(DnsDomainRecordsGetRecordTypesRequest request) {
        return callApi("DnsDomainRecords_getRecordTypes", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsGetRecordList(DnsDomainRecordsGetRecordListRequest request) {
        return callApi("DnsDomainRecords_getRecordList", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsAddRecord(DnsDomainRecordsAddRecordRequest request) {
        return callApi("DnsDomainRecords_addRecord", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsBatchAddRecords(DnsDomainRecordsBatchAddRecordsRequest request) {
        return callApi("DnsDomainRecords_batchAddRecords", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsEditRecord(DnsDomainRecordsEditRecordRequest request) {
        return callApi("DnsDomainRecords_editRecord", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsBatchPauseRecords(DnsDomainRecordsBatchPauseRecordsRequest request) {
        return callApi("DnsDomainRecords_batchPauseRecords", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsBatchEnableRecords(DnsDomainRecordsBatchEnableRecordsRequest request) {
        return callApi("DnsDomainRecords_batchEnableRecords", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsDeleteRecord(DnsDomainRecordsDeleteRecordRequest request) {
        return callApi("DnsDomainRecords_deleteRecord", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsImportRecords(DnsDomainRecordsImportRecordsRequest request) {
        return callApi("DnsDomainRecords_importRecords", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsExportRecords(DnsDomainRecordsExportRecordsRequest request) {
        return callApi("DnsDomainRecords_exportRecords", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsGetLines(DnsDomainRecordsGetLinesRequest request) {
        return callApi("DnsDomainRecords_getLines", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsBatchDeleteRecords(DnsDomainRecordsBatchDeleteRecordsRequest request) {
        return callApi("DnsDomainRecords_batchDeleteRecords", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsGetRecordGroupsList(DnsDomainRecordsGetRecordGroupsListRequest request) {
        return callApi("DnsDomainRecords_getRecordGroupsList", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsAddRecordGroup(DnsDomainRecordsAddRecordGroupRequest request) {
        return callApi("DnsDomainRecords_addRecordGroup", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsAddRecordGroupRelations(DnsDomainRecordsAddRecordGroupRelationsRequest request) {
        return callApi("DnsDomainRecords_addRecordGroupRelations", request, null, null, null, null);
    }

    public JSONObject dnsDomainRecordsDeleteRecordGroup(DnsDomainRecordsDeleteRecordGroupRequest request) {
        return callApi("DnsDomainRecords_deleteRecordGroup", request, null, null, null, null);
    }

    public JSONObject userIpUserIpList(UserIpUserIpListRequest request) {
        return callApi("UserIp_userIpList", request, null, null, null, null);
    }

    public JSONObject userIpUserIpAdd(UserIpUserIpAddRequest request) {
        return callApi("UserIp_userIpAdd", request, null, null, null, null);
    }

    public JSONObject userIpUserIpSave(UserIpUserIpSaveRequest request) {
        return callApi("UserIp_userIpSave", request, null, null, null, null);
    }

    public JSONObject userIpUserIpDel(UserIpUserIpDelRequest request) {
        return callApi("UserIp_userIpDel", request, null, null, null, null);
    }

    public JSONObject userIpListUserIpItem(UserIpListUserIpItemRequest request) {
        return callApi("UserIp_listUserIpItem", request, null, null, null, null);
    }

    public JSONObject userIpAddUserIpItem(UserIpAddUserIpItemRequest request) {
        return callApi("UserIp_AddUserIpItem", request, null, null, null, null);
    }

    public JSONObject userIpUpdateUserIpItem(UserIpUpdateUserIpItemRequest request) {
        return callApi("UserIp_UpdateUserIpItem", request, null, null, null, null);
    }

    public JSONObject userIpBatchDeleteUserIpItem(UserIpBatchDeleteUserIpItemRequest request) {
        return callApi("UserIp_BatchDeleteUserIpItem", request, null, null, null, null);
    }

    public JSONObject userIpDeleteAllUserIpItem(UserIpDeleteAllUserIpItemRequest request) {
        return callApi("UserIp_DeleteAllUserIpItem", request, null, null, null, null);
    }

    public JSONObject userIpCopyUserIp(UserIpCopyUserIpRequest request) {
        return callApi("UserIp_CopyUserIp", request, null, null, null, null);
    }

    public JSONObject userIpFileSaveIpItem(UserIpFileSaveIpItemRequest request) {
        return callApi("UserIp_FileSaveIpItem", request, null, null, null, null);
    }

    public JSONObject serviceBatchListTask(ServiceBatchListTaskRequest request) {
        return callApi("service_batch_ListTask", request, null, null, null, null);
    }

    public JSONObject serviceBatchListSubTask(ServiceBatchListSubTaskRequest request) {
        return callApi("service_batch_ListSubTask", request, null, null, null, null);
    }

    public JSONObject webCdnCleanCacheGetCacheList(WebCdnCleanCacheGetCacheListRequest request) {
        return callApi("WebCdnCleanCache_getCacheList", request, null, null, null, null);
    }

    public JSONObject webCdnCleanCacheSaveCache(WebCdnCleanCacheSaveCacheRequest request) {
        return callApi("WebCdnCleanCache_saveCache", request, null, null, null, null);
    }

    public JSONObject webCdnCleanCacheGetTaskList(WebCdnCleanCacheGetTaskListRequest request) {
        return callApi("WebCdnCleanCache_getTaskList", request, null, null, null, null);
    }

    public JSONObject webCdnCleanCacheGetTaskDetail(WebCdnCleanCacheGetTaskDetailRequest request) {
        return callApi("WebCdnCleanCache_getTaskDetail", request, null, null, null, null);
    }

    public JSONObject webCdnPreheatCacheGetPreheatCacheQuota(WebCdnPreheatCacheGetPreheatCacheQuotaRequest request) {
        return callApi("WebCdnPreheatCache_getPreheatCacheQuota", request, null, null, null, null);
    }

    public JSONObject webCdnPreheatCacheGetPreheatCacheList(WebCdnPreheatCacheGetPreheatCacheListRequest request) {
        return callApi("WebCdnPreheatCache_getPreheatCacheList", request, null, null, null, null);
    }

    public JSONObject webCdnPreheatCacheSavePreheatCache(WebCdnPreheatCacheSavePreheatCacheRequest request) {
        return callApi("WebCdnPreheatCache_savePreheatCache", request, null, null, null, null);
    }

    public JSONObject oplogInfo(OplogInfoRequest request) {
        return callApi("Oplog_info", request, null, null, null, null);
    }

    public JSONObject oplogMap(OplogMapRequest request) {
        return callApi("Oplog_map", request, null, null, null, null);
    }

    public JSONObject oplogGetOplogs(OplogGetOplogsRequest request) {
        return callApi("Oplog_getOplogs", request, null, null, null, null);
    }

    public JSONObject caCertificateSelfAddCa(CaCertificateSelfAddCaRequest request) {
        return callApi("CaCertificateSelf_addCa", request, null, null, null, null);
    }

    public JSONObject batchCaList(BatchCaListRequest request) {
        return callApi("Batch_caList", request, null, null, null, null);
    }

    public JSONObject caCertificateSelfSaveTextCaInfo(CaCertificateSelfSaveTextCaInfoRequest request) {
        return callApi("CaCertificateSelf_saveTextCaInfo", request, null, null, null, null);
    }

    public JSONObject caCertificateSelfEditCaInfo(CaCertificateSelfEditCaInfoRequest request) {
        return callApi("CaCertificateSelf_editCaInfo", request, null, null, null, null);
    }

    public JSONObject caCertificateSelfListCa(CaCertificateSelfListCaRequest request) {
        return callApi("CaCertificateSelf_listCa", request, null, null, null, null);
    }

    public JSONObject caCertificateSelfCaExport(CaCertificateSelfCaExportRequest request) {
        return callApi("CaCertificateSelf_caExport", request, null, null, null, null);
    }

    public JSONObject caCertificateSelfBatchOperatSsl(CaCertificateSelfBatchOperatSslRequest request) {
        return callApi("CaCertificateSelf_batchOperatSsl", request, null, null, null, null);
    }

    public JSONObject caCertificateSelfDelCa(CaCertificateSelfDelCaRequest request) {
        return callApi("CaCertificateSelf_delCa", request, null, null, null, null);
    }

    public JSONObject caCertificateSelfGetCaDetail(CaCertificateSelfGetCaDetailRequest request) {
        return callApi("CaCertificateSelf_getCaDetail", request, null, null, null, null);
    }

    public JSONObject caCertificateSelfEditCaName(CaCertificateSelfEditCaNameRequest request) {
        return callApi("CaCertificateSelf_editCaName", request, null, null, null, null);
    }

    public JSONObject caCertificateApplyAddApplyCa(CaCertificateApplyAddApplyCaRequest request) {
        return callApi("CaCertificateApply_addApplyCa", request, null, null, null, null);
    }

    public JSONObject caCertificateApplyGetAddByNsSetting(CaCertificateApplyGetAddByNsSettingRequest request) {
        return callApi("CaCertificateApply_getAddByNsSetting", request, null, null, null, null);
    }

    public JSONObject domainGroupSaveGroup(DomainGroupSaveGroupRequest request) {
        return callApi("DomainGroup_saveGroup", request, null, null, null, null);
    }

    public JSONObject domainGroupGetGroupList(DomainGroupGetGroupListRequest request) {
        return callApi("DomainGroup_getGroupList", request, null, null, null, null);
    }

    public JSONObject domainGroupDelGroup(DomainGroupDelGroupRequest request) {
        return callApi("DomainGroup_delGroup", request, null, null, null, null);
    }

    public JSONObject domainGroupGetGroupDomainList(DomainGroupGetGroupDomainListRequest request) {
        return callApi("DomainGroup_getGroupDomainList", request, null, null, null, null);
    }

    public JSONObject domainGroupGgtUndistributedDomainList(DomainGroupGgtUndistributedDomainListRequest request) {
        return callApi("DomainGroup_ggtUndistributedDomainList", request, null, null, null, null);
    }

    public JSONObject domainGroupAddGroup(DomainGroupAddGroupRequest request) {
        return callApi("DomainGroup_addGroup", request, null, null, null, null);
    }

    public JSONObject domainGroupSaveDomainToGroup(DomainGroupSaveDomainToGroupRequest request) {
        return callApi("DomainGroup_saveDomainToGroup", request, null, null, null, null);
    }

    public JSONObject domainGroupGetGroupInfo(DomainGroupGetGroupInfoRequest request) {
        return callApi("DomainGroup_getGroupInfo", request, null, null, null, null);
    }

    public JSONObject domainGroupMoveDomain(DomainGroupMoveDomainRequest request) {
        return callApi("DomainGroup_moveDomain", request, null, null, null, null);
    }

    public JSONObject listDomains(ListDomainsRequest request) {
        return callApi("ListDomains", request, null, null, null, null);
    }

    public JSONObject addDomains(AddDomainsRequest request) {
        return callApi("AddDomains", request, null, null, null, null);
    }

    public JSONObject updateDomains(UpdateDomainsRequest request) {
        return callApi("UpdateDomains", request, null, null, null, null);
    }

    public JSONObject bindDomainCert(BindDomainCertRequest request) {
        return callApi("BindDomainCert", request, null, null, null, null);
    }

    public JSONObject unBindDomainCert(UnBindDomainCertRequest request) {
        return callApi("UnBindDomainCert", request, null, null, null, null);
    }

    public JSONObject deleteDomains(DeleteDomainsRequest request) {
        return callApi("DeleteDomains", request, null, null, null, null);
    }

    public JSONObject disableDomains(DisableDomainsRequest request) {
        return callApi("DisableDomains", request, null, null, null, null);
    }

    public JSONObject enableDomains(EnableDomainsRequest request) {
        return callApi("EnableDomains", request, null, null, null, null);
    }

    public JSONObject refreshDomainsAccess(RefreshDomainsAccessRequest request) {
        return callApi("RefreshDomainsAccess", request, null, null, null, null);
    }

    public JSONObject exportDomains(ExportDomainsRequest request) {
        return callApi("ExportDomains", request, null, null, null, null);
    }

    public JSONObject addOrigins(AddOriginsRequest request) {
        return callApi("AddOrigins", request, null, null, null, null);
    }

    public JSONObject updateOrigins(UpdateOriginsRequest request) {
        return callApi("UpdateOrigins", request, null, null, null, null);
    }

    public JSONObject deleteOrigins(DeleteOriginsRequest request) {
        return callApi("DeleteOrigins", request, null, null, null, null);
    }

    public JSONObject listOrigins(ListOriginsRequest request) {
        return callApi("ListOrigins", request, null, null, null, null);
    }

    public JSONObject switchDomainNodes(SwitchDomainNodesRequest request) {
        return callApi("SwitchDomainNodes", request, null, null, null, null);
    }

    public JSONObject switchDomainAccessMode(SwitchDomainAccessModeRequest request) {
        return callApi("SwitchDomainAccessMode", request, null, null, null, null);
    }

    public JSONObject updateDomainBaseSettings(UpdateDomainBaseSettingsRequest request) {
        return callApi("UpdateDomainBaseSettings", request, null, null, null, null);
    }

    public JSONObject getDomainBaseSettings(GetDomainBaseSettingsRequest request) {
        return callApi("GetDomainBaseSettings", request, null, null, null, null);
    }

    public JSONObject listBriefDomains(ListBriefDomainsRequest request) {
        return callApi("ListBriefDomains", request, null, null, null, null);
    }

    public JSONObject getDomainTemplates(GetDomainTemplatesRequest request) {
        return callApi("GetDomainTemplates", request, null, null, null, null);
    }

    public JSONObject accessInfoDownload(AccessInfoDownloadRequest request) {
        return callApi("AccessInfoDownload", request, null, null, null, null);
    }

    public JSONObject originGroupGetOriginGroupList(OriginGroupGetOriginGroupListRequest request) {
        return callApi("OriginGroup_getOriginGroupList", request, null, null, null, null);
    }

    public JSONObject originGroupGetOriginGroupInfo(OriginGroupGetOriginGroupInfoRequest request) {
        return callApi("OriginGroup_getOriginGroupInfo", request, null, null, null, null);
    }

    public JSONObject originGroupAddOriginGroup(OriginGroupAddOriginGroupRequest request) {
        return callApi("OriginGroup_addOriginGroup", request, null, null, null, null);
    }

    public JSONObject originGroupUpdateOriginGroup(OriginGroupUpdateOriginGroupRequest request) {
        return callApi("OriginGroup_updateOriginGroup", request, null, null, null, null);
    }

    public JSONObject originGroupDelOriginGroup(OriginGroupDelOriginGroupRequest request) {
        return callApi("OriginGroup_delOriginGroup", request, null, null, null, null);
    }

    public JSONObject originGroupBindOriginGroupToDomains(OriginGroupBindOriginGroupToDomainsRequest request) {
        return callApi("OriginGroup_bindOriginGroupToDomains", request, null, null, null, null);
    }

    public JSONObject originGroupGetAllOriginGroups(OriginGroupGetAllOriginGroupsRequest request) {
        return callApi("OriginGroup_getAllOriginGroups", request, null, null, null, null);
    }

    public JSONObject originGroupCopyOriginGroup(OriginGroupCopyOriginGroupRequest request) {
        return callApi("OriginGroup_copyOriginGroup", request, null, null, null, null);
    }

    public JSONObject fireWallReportGetBlockList(FireWallReportGetBlockListRequest request) {
        return callApi("FireWallReport_getBlockList", request, null, null, null, null);
    }

    public JSONObject fireWallReportGetBlockDetails(FireWallReportGetBlockDetailsRequest request) {
        return callApi("FireWallReport_getBlockDetails", request, null, null, null, null);
    }

    public JSONObject fireWallReportGetPackageBlockList(FireWallReportGetPackageBlockListRequest request) {
        return callApi("FireWallReport_getPackageBlockList", request, null, null, null, null);
    }

    public JSONObject fireWallReportGetPackageBlockDetails(FireWallReportGetPackageBlockDetailsRequest request) {
        return callApi("FireWallReport_getPackageBlockDetails", request, null, null, null, null);
    }

    public JSONObject ccQpsMax(CcQpsMaxRequest request) {
        return callApi("cc_qps_max", request, null, null, null, null);
    }

    public JSONObject ccAttackTimes(CcAttackTimesRequest request) {
        return callApi("cc_attack_times", request, null, null, null, null);
    }

    public JSONObject ccTimesLine(CcTimesLineRequest request) {
        return callApi("cc_times_line", request, null, null, null, null);
    }

    public JSONObject ccReportStats(CcReportStatsRequest request) {
        return callApi("cc_report_stats", request, null, null, null, null);
    }

    public JSONObject cdnDomainUaispDistribute(CdnDomainUaispDistributeRequest request) {
        return callApi("cdn_domain_uaisp_distribute", request, null, null, null, null);
    }

    public JSONObject cdnDomainCountryDistribute(CdnDomainCountryDistributeRequest request) {
        return callApi("cdn_domain_country_distribute", request, null, null, null, null);
    }

    public JSONObject cdnDomainProvinceDistribute(CdnDomainProvinceDistributeRequest request) {
        return callApi("cdn_domain_province_distribute", request, null, null, null, null);
    }

    public JSONObject cdnDomainStatusDistribute(CdnDomainStatusDistributeRequest request) {
        return callApi("cdn_domain_status_distribute", request, null, null, null, null);
    }

    public JSONObject cdnDomainNodeFlowBandwidth(CdnDomainNodeFlowBandwidthRequest request) {
        return callApi("cdn_domain_node_flow_bandwidth", request, null, null, null, null);
    }

    public JSONObject cdnDomainNodeFlowBandwidthCn2(CdnDomainNodeFlowBandwidthCn2Request request) {
        return callApi("cdn_domain_node_flow_bandwidth_cn2", request, null, null, null, null);
    }

    public JSONObject cdnDomainNodeFlowBandwidthNode(CdnDomainNodeFlowBandwidthNodeRequest request) {
        return callApi("cdn_domain_node_flow_bandwidth_node", request, null, null, null, null);
    }

    public JSONObject domainTimes(DomainTimesRequest request) {
        return callApi("domainTimes", request, null, null, null, null);
    }

    public JSONObject domainQps(DomainQpsRequest request) {
        return callApi("domainQps", request, null, null, null, null);
    }

    public JSONObject cdnDomainFlowLine(CdnDomainFlowLineRequest request) {
        return callApi("cdn_domain_flow_line", request, null, null, null, null);
    }

    public JSONObject cdnDomainBandwidthLine(CdnDomainBandwidthLineRequest request) {
        return callApi("cdn_domain_bandwidth_line", request, null, null, null, null);
    }

    public JSONObject cdnDomainBandwidth95(CdnDomainBandwidth95Request request) {
        return callApi("cdn_domain_bandwidth_95", request, null, null, null, null);
    }

    public JSONObject cdnDomainPvtimes(CdnDomainPvtimesRequest request) {
        return callApi("cdn_domain_pvtimes", request, null, null, null, null);
    }

    public JSONObject cdnDomainFlowTop(CdnDomainFlowTopRequest request) {
        return callApi("cdn_domain_flow_top", request, null, null, null, null);
    }

    public JSONObject cdnDomainBandwidthTop(CdnDomainBandwidthTopRequest request) {
        return callApi("cdn_domain_bandwidth_top", request, null, null, null, null);
    }

    public JSONObject cdnDomainTimesTop(CdnDomainTimesTopRequest request) {
        return callApi("cdn_domain_times_top", request, null, null, null, null);
    }

    public JSONObject cdnDomainTimesTopEs(CdnDomainTimesTopEsRequest request) {
        return callApi("cdn_domain_times_top_es", request, null, null, null, null);
    }

    public JSONObject cdnDomainUrlTop(CdnDomainUrlTopRequest request) {
        return callApi("cdn_domain_url_top", request, null, null, null, null);
    }

    public JSONObject cdnDomainRefererTop(CdnDomainRefererTopRequest request) {
        return callApi("cdn_domain_referer_top", request, null, null, null, null);
    }

    public JSONObject cdnDomainStatusTopDownload(CdnDomainStatusTopDownloadRequest request) {
        return callApi("cdn_domain_status_top_download", request, null, null, null, null);
    }

    public JSONObject cdnDomainBandwidthDownload(CdnDomainBandwidthDownloadRequest request) {
        return callApi("cdn_domain_bandwidth_download", request, null, null, null, null);
    }

    public JSONObject cdnDomainFlowDownload(CdnDomainFlowDownloadRequest request) {
        return callApi("cdn_domain_flow_download", request, null, null, null, null);
    }

    public JSONObject tcpBandwidth(TcpBandwidthRequest request) {
        return callApi("tcp_bandwidth", request, null, null, null, null);
    }

    public JSONObject tcpCcFlaw(TcpCcFlawRequest request) {
        return callApi("tcp_cc_flaw", request, null, null, null, null);
    }

    public JSONObject wafAttackTimes(WafAttackTimesRequest request) {
        return callApi("waf_attack_times", request, null, null, null, null);
    }

    public JSONObject wafReportStats(WafReportStatsRequest request) {
        return callApi("waf_report_stats", request, null, null, null, null);
    }

    public JSONObject wafWebshellEventList(WafWebshellEventListRequest request) {
        return callApi("waf_webshell_event_list", request, null, null, null, null);
    }

    public JSONObject wafWebshellEventDetail(WafWebshellEventDetailRequest request) {
        return callApi("waf_webshell_event_detail", request, null, null, null, null);
    }

    public JSONObject wafAttackEventList(WafAttackEventListRequest request) {
        return callApi("waf_attack_event_list", request, null, null, null, null);
    }

    public JSONObject wafAttackEventDetail(WafAttackEventDetailRequest request) {
        return callApi("waf_attack_event_detail", request, null, null, null, null);
    }

    public JSONObject wafScanEventList(WafScanEventListRequest request) {
        return callApi("waf_scan_event_list", request, null, null, null, null);
    }

    public JSONObject wafScanEventDetail(WafScanEventDetailRequest request) {
        return callApi("waf_scan_event_detail", request, null, null, null, null);
    }

    public JSONObject wafTypeLine(WafTypeLineRequest request) {
        return callApi("waf_type_line", request, null, null, null, null);
    }

    public JSONObject logDownloadTaskTaskList(LogDownloadTaskTaskListRequest request) {
        return callApi("LogDownloadTask_taskList", request, null, null, null, null);
    }

    public JSONObject logDownloadTaskAddTask(LogDownloadTaskAddTaskRequest request) {
        return callApi("LogDownloadTask_addTask", request, null, null, null, null);
    }

    public JSONObject logDownloadTaskCancelTask(LogDownloadTaskCancelTaskRequest request) {
        return callApi("LogDownloadTask_cancelTask", request, null, null, null, null);
    }

    public JSONObject logDownloadTaskBatchCancelTask(LogDownloadTaskBatchCancelTaskRequest request) {
        return callApi("LogDownloadTask_batchCancelTask", request, null, null, null, null);
    }

    public JSONObject logDownloadTaskDeleteTask(LogDownloadTaskDeleteTaskRequest request) {
        return callApi("LogDownloadTask_deleteTask", request, null, null, null, null);
    }

    public JSONObject logDownloadTaskBatchDeleteTask(LogDownloadTaskBatchDeleteTaskRequest request) {
        return callApi("LogDownloadTask_batchDeleteTask", request, null, null, null, null);
    }

    public JSONObject logDownloadTaskRegenerateTask(LogDownloadTaskRegenerateTaskRequest request) {
        return callApi("LogDownloadTask_regenerateTask", request, null, null, null, null);
    }

    public JSONObject logDownloadFieldConfDownloadFields(LogDownloadFieldConfDownloadFieldsRequest request) {
        return callApi("LogDownloadFieldConf_downloadFields", request, null, null, null, null);
    }

    public JSONObject logDownloadTemplateTemplateList(LogDownloadTemplateTemplateListRequest request) {
        return callApi("LogDownloadTemplate_templateList", request, null, null, null, null);
    }

    public JSONObject logDownloadTemplateGetTemplateDomainList(LogDownloadTemplateGetTemplateDomainListRequest request) {
        return callApi("LogDownloadTemplate_getTemplateDomainList", request, null, null, null, null);
    }

    public JSONObject logDownloadTemplateAddTemplate(LogDownloadTemplateAddTemplateRequest request) {
        return callApi("LogDownloadTemplate_addTemplate", request, null, null, null, null);
    }

    public JSONObject logDownloadTemplateSaveTemplate(LogDownloadTemplateSaveTemplateRequest request) {
        return callApi("LogDownloadTemplate_saveTemplate", request, null, null, null, null);
    }

    public JSONObject logDownloadTemplateDelTemplate(LogDownloadTemplateDelTemplateRequest request) {
        return callApi("LogDownloadTemplate_delTemplate", request, null, null, null, null);
    }

    public JSONObject logDownloadTemplateBatchDelTemplate(LogDownloadTemplateBatchDelTemplateRequest request) {
        return callApi("LogDownloadTemplate_batchDelTemplate", request, null, null, null, null);
    }

    public JSONObject logDownloadTemplateChangeStatus(LogDownloadTemplateChangeStatusRequest request) {
        return callApi("LogDownloadTemplate_changeStatus", request, null, null, null, null);
    }

    public JSONObject logDownloadTemplateBatchChangeStatus(LogDownloadTemplateBatchChangeStatusRequest request) {
        return callApi("LogDownloadTemplate_batchChangeStatus", request, null, null, null, null);
    }

    public JSONObject logDownloadTemplateAllTemplate(LogDownloadTemplateAllTemplateRequest request) {
        return callApi("LogDownloadTemplate_allTemplate", request, null, null, null, null);
    }

    public JSONObject logDownloadTemplateAllTemplateGroup(LogDownloadTemplateAllTemplateGroupRequest request) {
        return callApi("LogDownloadTemplate_allTemplateGroup", request, null, null, null, null);
    }

    public JSONObject tjkdPlusPackageGetMemberPackageList(TjkdPlusPackageGetMemberPackageListRequest request) {
        return callApi("TjkdPlusPackage_getMemberPackageList", request, null, null, null, null);
    }

    public JSONObject tjkdPlusPackageGetAllPackage(TjkdPlusPackageGetAllPackageRequest request) {
        return callApi("TjkdPlusPackage_getAllPackage", request, null, null, null, null);
    }

    public JSONObject tjkdPlusPackageGetPackageInfo(TjkdPlusPackageGetPackageInfoRequest request) {
        return callApi("TjkdPlusPackage_getPackageInfo", request, null, null, null, null);
    }

    public JSONObject tjkdPlusPackageGetPackageIpList(TjkdPlusPackageGetPackageIpListRequest request) {
        return callApi("TjkdPlusPackage_getPackageIpList", request, null, null, null, null);
    }

    public JSONObject tjkdPlusPackageGetPackageOverview(TjkdPlusPackageGetPackageOverviewRequest request) {
        return callApi("TjkdPlusPackage_getPackageOverview", request, null, null, null, null);
    }

    public JSONObject tjkdPlusPackageGetPackagePortList(TjkdPlusPackageGetPackagePortListRequest request) {
        return callApi("TjkdPlusPackage_getPackagePortList", request, null, null, null, null);
    }

    public JSONObject tjkdPlusPackageSavePackage(TjkdPlusPackageSavePackageRequest request) {
        return callApi("TjkdPlusPackage_savePackage", request, null, null, null, null);
    }

    public JSONObject tjkdPlusPackageSavePackageHealthyConf(TjkdPlusPackageSavePackageHealthyConfRequest request) {
        return callApi("TjkdPlusPackage_savePackageHealthyConf", request, null, null, null, null);
    }

    public JSONObject tjkdPlusForwardRuleSavePlusForwardRule(TjkdPlusForwardRuleSavePlusForwardRuleRequest request) {
        return callApi("TjkdPlusForwardRule_savePlusForwardRule", request, null, null, null, null);
    }

    public JSONObject tjkdPlusForwardRuleBatchAddPlusForwardRule(TjkdPlusForwardRuleBatchAddPlusForwardRuleRequest request) {
        return callApi("TjkdPlusForwardRule_batchAddPlusForwardRule", request, null, null, null, null);
    }

    public JSONObject tjkdPlusForwardRuleBatchSavePlusForwardRule(TjkdPlusForwardRuleBatchSavePlusForwardRuleRequest request) {
        return callApi("TjkdPlusForwardRule_batchSavePlusForwardRule", request, null, null, null, null);
    }

    public JSONObject tjkdPlusForwardRuleDelPlusForwardRule(TjkdPlusForwardRuleDelPlusForwardRuleRequest request) {
        return callApi("TjkdPlusForwardRule_delPlusForwardRule", request, null, null, null, null);
    }

    public JSONObject tjkdPlusForwardRuleGetPlusForwardRuleList(TjkdPlusForwardRuleGetPlusForwardRuleListRequest request) {
        return callApi("TjkdPlusForwardRule_getPlusForwardRuleList", request, null, null, null, null);
    }

    public JSONObject tjkdPlusForwardRuleGetBatchPlusForwardRuleInfo(TjkdPlusForwardRuleGetBatchPlusForwardRuleInfoRequest request) {
        return callApi("TjkdPlusForwardRule_getBatchPlusForwardRuleInfo", request, null, null, null, null);
    }

    public JSONObject tjkdPlusPackageGetPackageDomainList(TjkdPlusPackageGetPackageDomainListRequest request) {
        return callApi("TjkdPlusPackage_getPackageDomainList", request, null, null, null, null);
    }

    public JSONObject tjkdPlusDomainGetTjkdPlusDomainList(TjkdPlusDomainGetTjkdPlusDomainListRequest request) {
        return callApi("TjkdPlusDomain_getTjkdPlusDomainList", request, null, null, null, null);
    }

    public JSONObject tjkdPlusDomainAddTjkdPlusDomain(TjkdPlusDomainAddTjkdPlusDomainRequest request) {
        return callApi("TjkdPlusDomain_addTjkdPlusDomain", request, null, null, null, null);
    }

    public JSONObject tjkdPlusDomainDelTjkdPlusDomain(TjkdPlusDomainDelTjkdPlusDomainRequest request) {
        return callApi("TjkdPlusDomain_delTjkdPlusDomain", request, null, null, null, null);
    }

    public JSONObject networkSpeedGetCacheRuleList(NetworkSpeedGetCacheRuleListRequest request) {
        return callApi("NetworkSpeedGetCacheRuleList", request, null, null, null, null);
    }

    public JSONObject networkSpeedCreateCacheRule(NetworkSpeedCreateCacheRuleRequest request) {
        return callApi("NetworkSpeedCreateCacheRule", request, null, null, null, null);
    }

    public JSONObject networkSpeedUpdateCacheRule(NetworkSpeedUpdateCacheRuleRequest request) {
        return callApi("NetworkSpeedUpdateCacheRule", request, null, null, null, null);
    }

    public JSONObject networkSpeedUpdateCacheRuleConfig(NetworkSpeedUpdateCacheRuleConfigRequest request) {
        return callApi("NetworkSpeedUpdateCacheRuleConfig", request, null, null, null, null);
    }

    public JSONObject networkSpeedUpdateCacheRuleStatus(NetworkSpeedUpdateCacheRuleStatusRequest request) {
        return callApi("NetworkSpeedUpdateCacheRuleStatus", request, null, null, null, null);
    }

    public JSONObject networkSpeedSortCacheRules(NetworkSpeedSortCacheRulesRequest request) {
        return callApi("NetworkSpeedSortCacheRules", request, null, null, null, null);
    }

    public JSONObject networkSpeedGetGlobalCacheConfig(NetworkSpeedGetGlobalCacheConfigRequest request) {
        return callApi("NetworkSpeedGetGlobalCacheConfig", request, null, null, null, null);
    }

    public JSONObject networkSpeedDeleteCacheRule(NetworkSpeedDeleteCacheRuleRequest request) {
        return callApi("NetworkSpeedDeleteCacheRule", request, null, null, null, null);
    }

    public JSONObject networkSpeedGetTemplateConfig(NetworkSpeedGetTemplateConfigRequest request) {
        return callApi("NetworkSpeedGetTemplateConfig", request, null, null, null, null);
    }

    public JSONObject networkSpeedUpdateTemplateConfig(NetworkSpeedUpdateTemplateConfigRequest request) {
        return callApi("NetworkSpeedUpdateTemplateConfig", request, null, null, null, null);
    }

    public JSONObject networkSpeedGetRules(NetworkSpeedGetRulesRequest request) {
        return callApi("NetworkSpeedGetRules", request, null, null, null, null);
    }

    public JSONObject networkSpeedCreateRule(NetworkSpeedCreateRuleRequest request) {
        return callApi("NetworkSpeedCreateRule", request, null, null, null, null);
    }

    public JSONObject networkSpeedDeleteRule(NetworkSpeedDeleteRuleRequest request) {
        return callApi("NetworkSpeedDeleteRule", request, null, null, null, null);
    }

    public JSONObject networkSpeedSortRules(NetworkSpeedSortRulesRequest request) {
        return callApi("NetworkSpeedSortRules", request, null, null, null, null);
    }

    public JSONObject networkSpeedUpdateRule(NetworkSpeedUpdateRuleRequest request) {
        return callApi("NetworkSpeedUpdateRule", request, null, null, null, null);
    }

    public JSONObject updateRuleTemplate(UpdateRuleTemplateRequest request) {
        return callApi("UpdateRuleTemplate", request, null, null, null, null);
    }

    public JSONObject deleteRuleTemplate(DeleteRuleTemplateRequest request) {
        return callApi("DeleteRuleTemplate", request, null, null, null, null);
    }

    public JSONObject getRuleTemplateList(GetRuleTemplateListRequest request) {
        return callApi("GetRuleTemplateList", request, null, null, null, null);
    }

    public JSONObject unbindRuleTemplate(UnbindRuleTemplateRequest request) {
        return callApi("UnbindRuleTemplate", request, null, null, null, null);
    }

    public JSONObject bindRuleTemplate(BindRuleTemplateRequest request) {
        return callApi("BindRuleTemplate", request, null, null, null, null);
    }

    public JSONObject listRuleTpsDomains(ListRuleTpsDomainsRequest request) {
        return callApi("ListRuleTpsDomains", request, null, null, null, null);
    }

    public JSONObject createRuleTemplate(CreateRuleTemplateRequest request) {
        return callApi("CreateRuleTemplate", request, null, null, null, null);
    }

    public JSONObject switchDomainTemplate(SwitchDomainTemplateRequest request) {
        return callApi("SwitchDomainTemplate", request, null, null, null, null);
    }

    public JSONObject firewallPageCfg(FirewallPageCfgRequest request) {
        return callApi("Firewall_pageCfg", request, null, null, null, null);
    }

    public JSONObject firewallPageCfgHwws(FirewallPageCfgHwwsRequest request) {
        return callApi("Firewall_pageCfgHwws", request, null, null, null, null);
    }

    public JSONObject firewallSavePolicy(FirewallSavePolicyRequest request) {
        return callApi("Firewall_savePolicy", request, null, null, null, null);
    }

    public JSONObject firewallGetPolicy(FirewallGetPolicyRequest request) {
        return callApi("Firewall_getPolicy", request, null, null, null, null);
    }

    public JSONObject firewallGetPolicyByCode(FirewallGetPolicyByCodeRequest request) {
        return callApi("Firewall_getPolicyByCode", request, null, null, null, null);
    }

    public JSONObject firewallStatsPolicy(FirewallStatsPolicyRequest request) {
        return callApi("Firewall_statsPolicy", request, null, null, null, null);
    }

    public JSONObject firewallOpen(FirewallOpenRequest request) {
        return callApi("Firewall_open", request, null, null, null, null);
    }

    public JSONObject firewallStop(FirewallStopRequest request) {
        return callApi("Firewall_stop", request, null, null, null, null);
    }

    public JSONObject firewallDelete(FirewallDeleteRequest request) {
        return callApi("Firewall_delete", request, null, null, null, null);
    }

    public JSONObject firewallSort(FirewallSortRequest request) {
        return callApi("Firewall_sort", request, null, null, null, null);
    }

    public JSONObject firewallGetsPolicyByMainid(FirewallGetsPolicyByMainidRequest request) {
        return callApi("Firewall_getsPolicyByMainid", request, null, null, null, null);
    }

    public JSONObject firewallGetsPolicyByPackageid(FirewallGetsPolicyByPackageidRequest request) {
        return callApi("Firewall_getsPolicyByPackageid", request, null, null, null, null);
    }

    public JSONObject firewallSavePolicyGroup(FirewallSavePolicyGroupRequest request) {
        return callApi("Firewall_savePolicyGroup", request, null, null, null, null);
    }

    public JSONObject firewallGetsPolicyGroupByDomainid(FirewallGetsPolicyGroupByDomainidRequest request) {
        return callApi("Firewall_getsPolicyGroupByDomainid", request, null, null, null, null);
    }

    public JSONObject firewallStopGroup(FirewallStopGroupRequest request) {
        return callApi("Firewall_stopGroup", request, null, null, null, null);
    }

    public JSONObject firewallOpenGroup(FirewallOpenGroupRequest request) {
        return callApi("Firewall_openGroup", request, null, null, null, null);
    }

    public JSONObject firewallDeleteGroup(FirewallDeleteGroupRequest request) {
        return callApi("Firewall_deleteGroup", request, null, null, null, null);
    }

    public JSONObject firewallSortGroup(FirewallSortGroupRequest request) {
        return callApi("Firewall_sortGroup", request, null, null, null, null);
    }

    public JSONObject firewallGetsPolicyByGroupId(FirewallGetsPolicyByGroupIdRequest request) {
        return callApi("Firewall_getsPolicyByGroupId", request, null, null, null, null);
    }

    public JSONObject getPolicyGroupTpl(GetPolicyGroupTplRequest request) {
        return callApi("getPolicyGroupTPL", request, null, null, null, null);
    }

    public JSONObject getDdosProtectionConfig(GetDdosProtectionConfigRequest request) {
        return callApi("GetDdosProtectionConfig", request, null, null, null, null);
    }

    public JSONObject updateDdosProtectionConfig(UpdateDdosProtectionConfigRequest request) {
        return callApi("UpdateDdosProtectionConfig", request, null, null, null, null);
    }

    public JSONObject getWafRuleConfig(GetWafRuleConfigRequest request) {
        return callApi("GetWafRuleConfig", request, null, null, null, null);
    }

    public JSONObject updateWafRuleConfig(UpdateWafRuleConfigRequest request) {
        return callApi("UpdateWafRuleConfig", request, null, null, null, null);
    }

    public JSONObject getMemberGlobalTemplate(GetMemberGlobalTemplateRequest request) {
        return callApi("GetMemberGlobalTemplate", request, null, null, null, null);
    }

    public JSONObject createTemplate(CreateTemplateRequest request) {
        return callApi("CreateTemplate", request, null, null, null, null);
    }

    public JSONObject createDomainTemplate(CreateDomainTemplateRequest request) {
        return callApi("CreateDomainTemplate", request, null, null, null, null);
    }

    public JSONObject getTemplateList(GetTemplateListRequest request) {
        return callApi("GetTemplateList", request, null, null, null, null);
    }

    public JSONObject getTemplateBindDomainList(GetTemplateBindDomainListRequest request) {
        return callApi("GetTemplateBindDomainList", request, null, null, null, null);
    }

    public JSONObject bindTemplateDomain(BindTemplateDomainRequest request) {
        return callApi("BindTemplateDomain", request, null, null, null, null);
    }

    public JSONObject deleteTemplate(DeleteTemplateRequest request) {
        return callApi("DeleteTemplate", request, null, null, null, null);
    }

    public JSONObject batchConfigTemplate(BatchConfigTemplateRequest request) {
        return callApi("BatchConfigTemplate", request, null, null, null, null);
    }

    public JSONObject iota(IotaRequest request) {
        return callApi("Iota", request, null, null, null, null);
    }

    public JSONObject getUnboundTemplateDomainList(GetUnboundTemplateDomainListRequest request) {
        return callApi("GetUnboundTemplateDomainList", request, null, null, null, null);
    }

    public JSONObject editTemplate(EditTemplateRequest request) {
        return callApi("EditTemplate", request, null, null, null, null);
    }

    public JSONObject firewallSavePolicyGroupRegionalShielding(FirewallSavePolicyGroupRegionalShieldingRequest request) {
        return callApi("Firewall_savePolicyGroupRegionalShielding", request, null, null, null, null);
    }

    public JSONObject firewallSavePolicyGroupAntiLeech(FirewallSavePolicyGroupAntiLeechRequest request) {
        return callApi("Firewall_savePolicyGroupAntiLeech", request, null, null, null, null);
    }

    public JSONObject tjkdappsaveFirewallPolicy(TjkdappsaveFirewallPolicyRequest request) {
        return callApi("TjkdappsaveFirewallPolicy", request, null, null, null, null);
    }

    public JSONObject tjkdappsortFirewallPolicy(TjkdappsortFirewallPolicyRequest request) {
        return callApi("TjkdappsortFirewallPolicy", request, null, null, null, null);
    }

    public JSONObject tjkdappopenFirewallPolicy(TjkdappopenFirewallPolicyRequest request) {
        return callApi("TjkdappopenFirewallPolicy", request, null, null, null, null);
    }

    public JSONObject tjkdappstopFirewallPolicy(TjkdappstopFirewallPolicyRequest request) {
        return callApi("TjkdappstopFirewallPolicy", request, null, null, null, null);
    }

    public JSONObject tjkdappgetFirewallPolicy(TjkdappgetFirewallPolicyRequest request) {
        return callApi("TjkdappgetFirewallPolicy", request, null, null, null, null);
    }

    public JSONObject tjkdappdeleteFirewallPolicy(TjkdappdeleteFirewallPolicyRequest request) {
        return callApi("TjkdappdeleteFirewallPolicy", request, null, null, null, null);
    }

    public JSONObject addForwardRule(AddForwardRuleRequest request) {
        return callApi("addForwardRule", request, null, null, null, null);
    }

    public JSONObject deleteForwardRule(DeleteForwardRuleRequest request) {
        return callApi("deleteForwardRule", request, null, null, null, null);
    }

    public JSONObject editRule(EditRuleRequest request) {
        return callApi("editRule", request, null, null, null, null);
    }

    public JSONObject ruleList(RuleListRequest request) {
        return callApi("ruleList", request, null, null, null, null);
    }

    public JSONObject getRuleInfo(GetRuleInfoRequest request) {
        return callApi("getRuleInfo", request, null, null, null, null);
    }

    public JSONObject tijkdappListPackage(TijkdappListPackageRequest request) {
        return callApi("TIJKDAPP_ListPackage", request, null, null, null, null);
    }

    public JSONObject tijkdappSavePackage(TijkdappSavePackageRequest request) {
        return callApi("TIJKDAPP_SavePackage", request, null, null, null, null);
    }

    public JSONObject getChannelList(GetChannelListRequest request) {
        return callApi("getChannelList", request, null, null, null, null);
    }

    public JSONObject apiNameV5(ApiNameV5Request request) {
        return callApi("api_name_v5", request, null, null, null, null);
    }
}
