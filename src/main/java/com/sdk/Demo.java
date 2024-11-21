package com.sdk;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.*;
import okhttp3.OkHttpClient;

public class Demo {

    public static Sdk getsdk(){
        // 注意：业务实际使用时请将环境变量替换成具体的值++
        //   参数分别是 apiUrlPre / appId / appSecret
        //Sdk sdkObj = new Sdk(System.getenv("SDK_API_PRE"), System.getenv("SDK_APP_ID"), System.getenv("SDK_APP_SECERT"));
        //   参数分别是 apiUrlPre / appId / appSecret / userId， 其中 userId 在特殊场景下才会使用
        //Sdk sdkObj = new Sdk(System.getenv("SDK_API_PRE"), System.getenv("SDK_APP_ID"), System.getenv("SDK_APP_SECERT"), "88350");
        // 支持自定义OkHttpClient
        //OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(5, TimeUnit.SECONDS).build();
        //Sdk sdkObj = new Sdk(System.getenv("SDK_API_PRE"), System.getenv("SDK_APP_ID"), System.getenv("SDK_APP_SECERT"), "", okHttpClient);
        return new Sdk(
                "http://127.0.0.1:60041/api/V4/",
                "ENAK195892d9c30371985983",
                "57dbcb07eb4e1d5aa531afee2c4d8f26"
        );
    }
    public static void testGet(){
        Sdk sdkObj = getsdk();

        String api;
        JSONObject result;
        Map<String, Object> query = new HashMap<>();
        Map<String, String> headers = new HashMap<>();
        Map<String, Object> postData = new HashMap<>();

        api = "Web.Domain.Info";
        query.put("domain", 101153);
        result = sdkObj.get(api, query);
        System.out.println(api + " get<api, query>: ");
        System.out.println(JSON.toJSONString(result) + "\n");
    }

    public static void testPost(){
        Sdk sdkObj = getsdk();

        String api;
        JSONObject result;
        Map<String, Object> query = new HashMap<>();
        Map<String, String> headers = new HashMap<>();
        Map<String, Object> postData = new HashMap<>();
        api = "Web.Domain.batch.domain.add";
        postData.put("domains", new String[]{"tes2ss.com","tttt2t.com"});
        postData.put("group_id", 0);
        postData.put("biz_type", 1);
        Map<String,Object> Sets = new HashMap<>();
        Sets.put("protocol",0);
        Sets.put("listen_port",80);
        Sets.put("get_source_protocol",0);
        Sets.put("load_balance",0);
        Sets.put("back_source_type",0);
        ArrayList<Map<String,Object>> ipList =new ArrayList<>();
        Map<String,Object> ips = new HashMap<>();
        ips.put("value","www.google.com");
        ips.put("port","80");
        ips.put("view","primary");
        ips.put("priority",1);
        ips.put("type","cname");
        ipList.add(ips);
        Sets.put("source_ips",ipList);
        result = sdkObj.post(api, query,postData);
        System.out.println(api + " get<api, query>: ");
        System.out.println(JSON.toJSONString(result) + "\n");
    }

    public static void main(String[] args) {
        try {

            testGet();
            testPost();
            /*

            Map<String, Object> extQuery = new HashMap<>();
            extQuery.put("bcd", "string");
            extQuery.put("abc", "000000");
            query.put("extquery", extQuery);
            query.put("domain_idsString", new String[]{"10", "22", "3", "44", "5", "16", "7"});
            query.put("domain_idsInt", new int[]{10, 22, 3, 44, 5, 16, 7});
            query.put("domain_idsDouble", new double[]{10.1, 22.2, 3.3, 44.0, 5.5, 16.1, 7.7});
            result = sdkObj.get(api, query);
            System.out.println(api + " get<api, query>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.get(api, query, headers);
            System.out.println(api + " get<api, query, headers>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            postData.clear();

            api = "test.sdk.post";
            postData.put("domain_id", "1");
            postData.put("status", "2");
            postData.put("name", "name名称~!@#$%^&*()_+{}|:\"?><`1234567890-=[]\\';.,/");

            result = sdkObj.post(api, postData);
            System.out.println(api + " post<api, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.post(api, query, postData);
            System.out.println(api + " post<api, query, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.post(api, query, postData, headers);
            System.out.println(api + " post<api, query, postData, headers>: ");
            System.out.println(JSON.toJSONString(result) + "\n");


            postData.clear();

            api = "test.sdk.post";
            postData.put("domain_ids", new int[]{10, 22, 3, 44, 5, 16, 7});
            postData.put("status", "2");
            Map<String, Object> extData = new HashMap<>();
            extData.put("bcd", "string");
            extData.put("abc", "000000");
            extData.put("bac", 1);
            extData.put("acb", 100.0);
            postData.put("extdata", extData);

            result = sdkObj.post(api, postData);
            System.out.println(api + " post<api, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.post(api, query, postData);
            System.out.println(api + " post<api, query, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.post(api, query, postData, headers);
            System.out.println(api + " post<api, query, postData, headers>: ");
            System.out.println(JSON.toJSONString(result) + "\n");


            postData.clear();

            api = "test.sdk.patch";
            postData.put("domain_id", "1");
            postData.put("status", "2");
            postData.put("name", "name名称~!@#$%^&*()_+{}|:\"?><`1234567890-=[]\\';.,/");

            result = sdkObj.patch(api, postData);
            System.out.println(api + " patch<api, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.patch(api, query, postData);
            System.out.println(api + " patch<api, query, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.patch(api, query, postData, headers);
            System.out.println(api + " patch<api, query, postData, headers>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            postData.clear();

            api = "test.sdk.put";
            postData.put("domain_id", "1");
            postData.put("status", "2");
            postData.put("name", "name名称~!@#$%^&*()_+{}|:\"?><`1234567890-=[]\\';.,/");

            result = sdkObj.put(api, postData);
            System.out.println(api + " put<api, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.put(api, query, postData);
            System.out.println(api + " put<api, query, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.put(api, query, postData, headers);
            System.out.println(api + " put<api, query, postData, headers>: ");
            System.out.println(JSON.toJSONString(result) + "\n");


            postData.clear();

            api = "test.sdk.delete";
            postData.put("domain_id", "1");
            postData.put("status", "2");
            postData.put("name", "name名称~!@#$%^&*()_+{}|:\"?><`1234567890-=[]\\';.,/");

            result = sdkObj.delete(api, postData);
            System.out.println(api + " delete<api, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.delete(api, query, postData);
            System.out.println(api + " delete<api, query, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.delete(api, query, postData, headers);
            System.out.println(api + " delete<api, query, postData, headers>: ");
            System.out.println(JSON.toJSONString(result) + "\n");*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
