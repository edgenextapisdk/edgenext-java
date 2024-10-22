package com.sdk;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.*;
import okhttp3.OkHttpClient;

public class DemoFirewall {

public static void main(String[] args) {
        try {
            // 注意：业务实际使用时请将环境变量替换成具体的值
            Sdk sdkObj = new Sdk(System.getenv("SDK_API_PRE"), System.getenv("SDK_APP_ID"), System.getenv("SDK_APP_SECRET"));
            // 支持自定义OkHttpClient
            // OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(5, TimeUnit.SECONDS).build();
            // Sdk sdkObj = new Sdk(System.getenv("SDK_API_PRE"), System.getenv("SDK_APP_ID"), System.getenv("SDK_APP_SECRET"), "", okHttpClient);

            String api;
            JSONObject result;
            Map<String, Object> query = new HashMap<>();
            Map<String, Object> postData = new HashMap<>();

            // 增加精准访问控制规则集
            api = "firewall.policyGroup.save";
            postData.put("name", "example");
            postData.put("remark", "example");
            postData.put("from", "diy");
            postData.put("domain_id", System.getenv("SDK_DOMAIN_ID"));
            result = sdkObj.post(api, postData);
            System.out.println(api + " post<api, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            if (result.getIntValue("BizCode") == 1) {
                System.out.println(api + " 添加精准访问控制规则集成功");
            } else {
                System.out.println(api + " 添加精准访问控制规则集失败错误: ");
                System.out.println(api + " http_code: " + result.getIntValue("HttpCode"));
                System.out.println(api + " body: " + result.getString("RespBody"));
                System.out.println(api + " biz_code: " + result.getIntValue("BizCode"));
                System.out.println(api + " biz_msg: " + result.getString("BizMsg"));
                return;
            }

            String fwPolicyGroupID = result.getJSONObject("BizData").getString("id");
            System.out.println("添加精准访问控制规则集成功: " + fwPolicyGroupID);

            // 为规则集 example 增加 请求类型 和 单IP单URL请求频率 规则
            api = "firewall.policy.save";
            postData.clear();
            postData.put("group_id", fwPolicyGroupID);
            postData.put("domain_id", System.getenv("SDK_DOMAIN_ID"));
            postData.put("remark", "");
            postData.put("type", "plus");
            postData.put("action", "block");
            postData.put("action_data", Map.of("time_unit", "minute", "interval", 10));
            postData.put("rules", new Object[]{
                    Map.of("rule_type", "url_type", "logic", "belongs", "data", new String[]{"dynamic"}),
                    Map.of("rule_type", "ip_url_rate_limit", "logic", "greater_than", "data", Map.of("interval", 10, "reqs", 100))
            });
            result = sdkObj.post(api, postData);
            System.out.println(api + " post<api, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            if (result.getIntValue("BizCode") == 1) {
                System.out.println(api + " 为规则集 " + fwPolicyGroupID + " 添加 请求类型 和 单IP单URL请求频率 规则成功");
            } else {
                System.out.println(api + " 为规则集 " + fwPolicyGroupID + " 添加 请求类型 和 单IP单URL请求频率 规则错误: ");
                System.out.println(api + " http_code: " + result.getIntValue("HttpCode"));
                System.out.println(api + " body: " + result.getString("RespBody"));
                System.out.println(api + " biz_code: " + result.getIntValue("BizCode"));
                System.out.println(api + " biz_msg: " + result.getString("BizMsg"));
                return;
            }

            String fwPolicyId = result.getJSONObject("BizData").getString("id");
            System.out.println("为规则集 " + fwPolicyGroupID + " 添加 请求类型 和 单IP单URL请求频率 规则成功: " + fwPolicyId);

            // 为规则集 example 增加 IP类型 和 IP请求频率 规则
            api = "firewall.policy.save";
            postData.clear();
            postData.put("group_id", fwPolicyGroupID);
            postData.put("domain_id", System.getenv("SDK_DOMAIN_ID"));
            postData.put("remark", "");
            postData.put("type", "plus");
            postData.put("action", "verification");
            postData.put("action_data", Map.of("next_rules", 1, "cc", 1, "waf", 0, "type", "cookie"));
            postData.put("rules", new Object[]{
                    Map.of("rule_type", "ip_type", "logic", "equals", "data", new String[]{"botnet", "Tor", "Proxy", "IpBlackList", "FakeUA"}),
                    Map.of("rule_type", "ip_rate_limit", "logic", "greater_than", "data", Map.of("interval", 20, "reqs", 3))
            });
            result = sdkObj.post(api, postData);
            System.out.println(api + " post<api, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            if (result.getIntValue("BizCode") == 1) {
                System.out.println(api + " 为规则集 " + fwPolicyGroupID + " 添加 IP类型 和 IP请求频率 规则成功");
            } else {
                System.out.println(api + " 为规则集 " + fwPolicyGroupID + " 添加 IP类型 和 IP请求频率 规则错误: ");
                System.out.println(api + " http_code: " + result.getIntValue("HttpCode"));
                System.out.println(api + " body: " + result.getString("RespBody"));
                System.out.println(api + " biz_code: " + result.getIntValue("BizCode"));
                System.out.println(api + " biz_msg: " + result.getString("BizMsg"));
                return;
            }

            fwPolicyId = result.getJSONObject("BizData").getString("id");
            System.out.println("为规则集 " + fwPolicyGroupID + " 添加 IP类型 和 IP请求频率 规则成功: " + fwPolicyId);

            // 为规则集 example 增加 URL 和 单IP单URL请求频率 规则
            api = "firewall.policy.save";
            postData.clear();
            postData.put("group_id", fwPolicyGroupID);
            postData.put("domain_id", System.getenv("SDK_DOMAIN_ID"));
            postData.put("remark", "");
            postData.put("type", "plus");
            postData.put("action", "block");
            postData.put("action_data", Map.of("time_unit", "minute", "interval", 10));
            postData.put("rules", new Object[]{
                    Map.of("rule_type", "url", "logic", "contains", "data", new String[]{"/login", "/register"}),
                    Map.of("rule_type", "ip_url_rate_limit", "logic", "greater_than", "data", Map.of("interval", 10, "reqs", 25))
            });
            result = sdkObj.post(api, postData);
            System.out.println(api + " post<api, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            if (result.getIntValue("BizCode") == 1) {
                System.out.println(api + " 为规则集 " + fwPolicyGroupID + " 添加 URL 和 单IP单URL请求频率 规则成功");
            } else {
                System.out.println(api + " 为规则集 " + fwPolicyGroupID + " 添加 URL 和 单IP单URL请求频率 规则错误: ");
                System.out.println(api + " http_code: " + result.getIntValue("HttpCode"));
                System.out.println(api + " body: " + result.getString("RespBody"));
                System.out.println(api + " biz_code: " + result.getIntValue("BizCode"));
                System.out.println(api + " biz_msg: " + result.getString("BizMsg"));
                return;
            }

            System.out.println("为规则集 " + fwPolicyGroupID + " 添加 URL 和 单IP单URL请求频率 规则成功: " + fwPolicyId);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
