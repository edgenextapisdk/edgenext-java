# edgenext.com api sdk for Java

### 说明

* 接口基地址，如： https://api.local.com/V4/ ，具体地址请咨询运营人员
* 接口遵循RESTful,默认请求体json,接口默认返回json
* app_id, app_secret 联系技术客服，先注册一个edgenext的账号，用于申请绑定api身份

### 签名算法

* 每次请求都签名，保证传输过程数据不被篡改
* 客户端：sha256签名算法，将参数base64编码+app_secret用sha256签名，每次请求带上签名
* 服务端：拿到参数用相同的算法签名，对比签名是否正确

### sdk 使用说明

* 环境：java >=1.8
* 支持get/post/patch/put/delete方法
* 参数说明
    * appId 分配的app_id
    * appSecert 分配的appSecert, 用于签名数据
    * apiUrlPre api地址前缀
    * userId 当前使用者的用户ID
* 每次调用会返回JSONObject, 如果执行过程中有异常，会直接抛出异常；
* 如果需要调试，可以调用debug方法
* 注意事项
    针对所有请求，uri与get参数是分离的，如 https://api.local.com/V4/version?v=1, 调用时v=1参数，须通过query传递
    JSONObject result = sdkObj.get(api, query, headers);


### 使用

#### 示例类
```
package com.sdk;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import okhttp3.OkHttpClient;

import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.slf4j.LoggerFactory;

public class Demo {

    public static void main(String[] args) {
        try {
            // 注意：业务实际使用时请将环境变量替换成具体的值
            //   参数分别是 apiUrlPre / appId / appSecret
            Sdk sdkObj = new Sdk(System.getenv("SDK_API_PRE"), System.getenv("SDK_APP_ID"), System.getenv("SDK_APP_SECERT"));
            //   参数分别是 apiUrlPre / appId / appSecret / userId， 其中 userId 在特殊场景下才会使用
            //Sdk sdkObj = new Sdk(System.getenv("SDK_API_PRE"), System.getenv("SDK_APP_ID"), System.getenv("SDK_APP_SECERT"), "88350");
            // 支持自定义OkHttpClient
            //OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(5, TimeUnit.SECONDS).build();
            //Sdk sdkObj = new Sdk(System.getenv("SDK_API_PRE"), System.getenv("SDK_APP_ID"), System.getenv("SDK_APP_SECERT"), "", okHttpClient);


            String api;
            JSONObject result;
            Map<String, Object> query = new HashMap<>();
            Map<String, String> headers = new HashMap<>();
            Map<String, Object> postData = new HashMap<>();

            api = "test.sdk.get";
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

            result = sdkObj.delete(api, postData);
            System.out.println(api + " delete<api, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.delete(api, query, postData);
            System.out.println(api + " delete<api, query, postData>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

            result = sdkObj.delete(api, query, postData, headers);
            System.out.println(api + " delete<api, query, postData, headers>: ");
            System.out.println(JSON.toJSONString(result) + "\n");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
```

#### 示例类执行输出
···
test.sdk.get get<api, query>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"85.517883300781ms","function_time_consuming":"0.50806999206543ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:17","dispatch_before_time_consuming":"50.884008407593ms"}}

test.sdk.get get<api, query>:
{"code":1,"data":{"domain_id":"1","extquery":{"bcd":"string","abc":"000000"},"name":"name名称","domain_idsDouble":["10.1","22.2","3.3","44.0","5.5","16.1","7.7"],"domain_idsString":["10","22","3","44","5","16","7"],"domain_idsInt":["10","22","3","44","5","16","7"],"status":"2"},"message":"操作成功","status":{"api_time_consuming":"91.135025024414ms","function_time_consuming":"0.51999092102051ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:18","dispatch_before_time_consuming":"58.54606628418ms"}}

test.sdk.get get<api, query, headers>:
{"code":1,"data":{"domain_id":"1","extquery":{"bcd":"string","abc":"000000"},"name":"name名称","domain_idsDouble":["10.1","22.2","3.3","44.0","5.5","16.1","7.7"],"domain_idsString":["10","22","3","44","5","16","7"],"domain_idsInt":["10","22","3","44","5","16","7"],"status":"2"},"message":"操作成功","status":{"api_time_consuming":"77.179908752441ms","function_time_consuming":"0.45490264892578ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:18","dispatch_before_time_consuming":"49.570798873901ms"}}

test.sdk.post post<api, postData>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"74.137926101685ms","function_time_consuming":"0.5640983581543ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:18","dispatch_before_time_consuming":"47.46413230896ms"}}

test.sdk.post post<api, query, postData>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"74.384927749634ms","function_time_consuming":"0.46300888061523ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:18","dispatch_before_time_consuming":"47.341108322144ms"}}

test.sdk.post post<api, query, postData, headers>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"77.226161956787ms","function_time_consuming":"0.50997734069824ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:18","dispatch_before_time_consuming":"50.033092498779ms"}}

test.sdk.post post<api, postData>:
{"code":1,"data":{"extdata":{"acb":100,"bcd":"string","abc":"000000","bac":1},"domain_ids":[10,22,3,44,5,16,7],"status":"2"},"message":"操作成功","status":{"api_time_consuming":"78.505992889404ms","function_time_consuming":"0.53811073303223ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:18","dispatch_before_time_consuming":"50.987005233765ms"}}

test.sdk.post post<api, query, postData>:
{"code":1,"data":{"extdata":{"acb":100,"bcd":"string","abc":"000000","bac":1},"domain_ids":[10,22,3,44,5,16,7],"status":"2"},"message":"操作成功","status":{"api_time_consuming":"75.796127319336ms","function_time_consuming":"0.49400329589844ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:18","dispatch_before_time_consuming":"46.789169311523ms"}}

test.sdk.post post<api, query, postData, headers>:
{"code":1,"data":{"extdata":{"acb":100,"bcd":"string","abc":"000000","bac":1},"domain_ids":[10,22,3,44,5,16,7],"status":"2"},"message":"操作成功","status":{"api_time_consuming":"76.227903366089ms","function_time_consuming":"0.52404403686523ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:18","dispatch_before_time_consuming":"48.527956008911ms"}}

test.sdk.patch patch<api, postData>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"74.251890182495ms","function_time_consuming":"0.53310394287109ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:18","dispatch_before_time_consuming":"47.650098800659ms"}}

test.sdk.patch patch<api, query, postData>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"73.770046234131ms","function_time_consuming":"0.46992301940918ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:18","dispatch_before_time_consuming":"47.549962997437ms"}}

test.sdk.patch patch<api, query, postData, headers>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"74.141025543213ms","function_time_consuming":"0.49591064453125ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:18","dispatch_before_time_consuming":"46.6148853302ms"}}

test.sdk.put put<api, postData>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"75.473785400391ms","function_time_consuming":"0.44894218444824ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:18","dispatch_before_time_consuming":"48.551797866821ms"}}

test.sdk.put put<api, query, postData>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"73.918104171753ms","function_time_consuming":"0.6101131439209ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:19","dispatch_before_time_consuming":"47.573089599609ms"}}

test.sdk.put put<api, query, postData, headers>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"75.822830200195ms","function_time_consuming":"0.48494338989258ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:19","dispatch_before_time_consuming":"48.758983612061ms"}}

test.sdk.delete delete<api, postData>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"76.253890991211ms","function_time_consuming":"0.45514106750488ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:19","dispatch_before_time_consuming":"49.100875854492ms"}}

test.sdk.delete delete<api, query, postData>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"77.368974685669ms","function_time_consuming":"0.47492980957031ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:19","dispatch_before_time_consuming":"50.501108169556ms"}}

test.sdk.delete delete<api, query, postData, headers>:
{"code":1,"data":{"domain_id":"1","name":"name名称","status":"2"},"message":"操作成功","status":{"api_time_consuming":"76.547861099243ms","function_time_consuming":"0.5030632019043ms","code":1,"message":"操作成功","create_at":"2022-11-08 14:38:19","dispatch_before_time_consuming":"48.920869827271ms"}}
···

### 更新日志

* 2022.11.08

java版SDK

* 2022.11.11

1. 单元测试增加特殊字符
2. GET请求修正参数乱序导致的签名失败问题
