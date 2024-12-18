package com.sdk;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sdk.http.SignRequest;
import com.sdk.http.Signer;
import okhttp3.*;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static com.sdk.http.Signer.AUTHORIZATION;
import static com.sdk.http.Signer.X_SDK_DATE;

public class Sdk {
    private static Logger logger = LoggerFactory.getLogger(Sdk.class);
    private MediaType mediaType = MediaType.parse("application/json; charset=utf-8");

    private String apiUrlPre;
    private String appId;
    private String appSecret;
    private String userId;
    private String clientUserAgent;
    private OkHttpClient okHttpClient;

    public Sdk(String apiUrlPre, String appId, String appSecret) {
        this(apiUrlPre, appId, appSecret, "", new OkHttpClient());
    }

    public Sdk(String apiUrlPre, String appId, String appSecret, String userId) {
        this(apiUrlPre, appId, appSecret, userId, new OkHttpClient());
    }

    public Sdk(String apiUrlPre, String appId, String appSecret, String userId, OkHttpClient client) {
        this.okHttpClient = client;
        if (apiUrlPre.lastIndexOf('/') == (apiUrlPre.length() - 1)) {
            this.apiUrlPre = apiUrlPre.substring(0, apiUrlPre.length() - 1);
        } else {
            this.apiUrlPre = apiUrlPre;
        }
        this.appId = appId;
        this.appSecret = appSecret;
        this.userId = userId;
        this.clientUserAgent = "Sdk 2.0.0; java/"
                + System.getProperty("java.version")
                + "; "
                + System.getProperty("os.name")
                + " "
                + System.getProperty("os.version");
    }

    public Map<String, Object> typeConvertAndOrdered(Map<String, Object> query) {
        Map<String, Object> orderQuery = new TreeMap<>();
        query.forEach((k, v) -> {
            if (v instanceof Boolean[]) {
                Boolean[] vv = (Boolean[]) v;
                String[] strings = new String[vv.length];
                for (int i = 0; i < vv.length; i++) {
                    strings[i] = vv[i] ? "1" : "0";
                }
                orderQuery.put(k, strings);
            } else if (v instanceof boolean[]) {
                boolean[] vv = (boolean[]) v;
                String[] strings = new String[vv.length];
                for (int i = 0; i < vv.length; i++) {
                    strings[i] = vv[i] ? "1" : "0";
                }
                orderQuery.put(k, strings);
            } else if (v instanceof short[] || v instanceof int[] || v instanceof long[] || v instanceof float[]
                    || v instanceof double[] || v instanceof Number[]) {
                List<String> l = new ArrayList<>();
                JSONArray ja = JSON.parseArray(JSON.toJSONString(v));
                for (Object o : ja) {
                    l.add(JSON.toJSONString(o));
                }
                orderQuery.put(k, l.toArray(new String[0]));
            } else if (v instanceof Collection) {
                String[] strings = ((Collection<?>) v)
                        .stream()
                        .map(vv -> vv.toString())
                        .collect(Collectors.toList()).toArray(new String[0]);
                orderQuery.put(k, strings);
            } else if (v instanceof Map) {
                Map<String, String> map = ((Map<String, Object>) v).entrySet()
                        .stream()
                        .map(e -> new AbstractMap.SimpleImmutableEntry<>(e.getKey(), e.getValue().toString()))
                        .collect(Collectors.toMap(kv -> kv.getKey(), kv -> kv.getValue()));
                orderQuery.put(k, map);
            } else if (v instanceof Boolean) {
                Boolean vv = (Boolean) v;
                orderQuery.put(k, vv ? "1" : "0");
            } else if (v instanceof Number) {
                orderQuery.put(k, String.valueOf(v));
            } else {
                orderQuery.put(k, v);
            }
        });
        return orderQuery;
    }

    public void testTypeConvert() {
        Map<String, Object> query = new HashMap<>();

        query.put("string", "string");
        query.put("string[]", new String[]{"a", "bl"});
        query.put("short", (short) 1);
        query.put("int", 1);
        query.put("int[]", new int[]{1, 2});
        query.put("integer[]", new Integer[]{1, 2});
        query.put("long", 10L);
        query.put("long[]", new long[]{1L, 2L});
        query.put("Long[]", new Long[]{1L, 2L});
        query.put("float", 1.1f);
        query.put("float[]", new float[]{1f, 2f});
        query.put("Float[]", new Float[]{1f, 2f});
        query.put("double", 1.1d);
        query.put("double[]", new double[]{1d, 2d});
        query.put("Double[]", new Double[]{1d, 2d});
        query.put("boolean", true);
        query.put("boolean[]", new boolean[]{true, false});
        query.put("Boolean[]", new Boolean[]{Boolean.TRUE, Boolean.FALSE});
        query.put("list-int", Arrays.asList(1, 2, 3));
        query.put("list-str", Arrays.asList("a", "b", "c"));
        query.put("set", new HashSet<>(Arrays.asList(1, 2, 3)));
        query.put("map", Collections.singletonMap("k", 1));
        query.put("map2", Collections.singletonMap("k", "string"));

        System.out.println(JSON.toJSONString(this.typeConvertAndOrdered(query), true));
    }

    private SignRequest _payload(
            Map<String, Object> query,
            Map<String, Object> postData,
            Map<String, String> headers,String api,String httpMethod) throws UnsupportedEncodingException {
        headers.put("X-Auth-App-Id", this.appId);
        headers.put("X-Auth-Sdk-Version", "2.0.0");
        headers.put("Content-Type", "application/json; charset=utf-8");
        headers.put("User-Agent", this.clientUserAgent);
        headers.put("user_id", this.userId);
        headers.put("client_ip", "");                //当项目内代理转发调用时，此参数用作将外部的IP传递给内部的系统，这里默认空
        headers.put("client_userAgent", this.clientUserAgent);
        headers.put("algorithm", "HMAC-SHA256");
        headers.put("issued_at", String.valueOf(System.currentTimeMillis() / 1000));
        // 签名时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'", Locale.ENGLISH);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        headers.put(X_SDK_DATE, sdf.format(new Date()));
        // 开始签名
        SignRequest signReq = new SignRequest();
        if (api.indexOf('/') == 0) api = api.substring(2);
        String uri = this.urlEncodeForMap(query);
        String url = this.apiUrlPre + "/" + api + (uri == "" ? "" : ("?" + uri));
        signReq.setUrl(url);
        signReq.setBody("");
        // 如果存在postdata 且不为空
        if (postData != null && !postData.isEmpty()) {
            signReq.setBody(JSON.toJSONString(postData));
        }
        signReq.setKey(this.appId);
        signReq.setSecret(this.appSecret);
        signReq.setMethod(httpMethod);
        String authSign = this.sign(signReq);
        headers.put(AUTHORIZATION, authSign);
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            signReq.addHeader(entry.getKey(), entry.getValue());
        }
        return signReq;
    }

    private String sign(SignRequest signReq) throws UnsupportedEncodingException {
        Signer signer = new Signer("SDK-HMAC-SHA256");
        return signer.sign(signReq);
    }

    private String base64UrlEncode(byte[] bs) {
        return new String(Base64.encodeBase64(bs)).replace("+", "-").replace("/", "_");
    }

    private byte[] hashSignature(String encodedData, String appSecret) {
        if (appSecret == null) {
            return null;
        }
        Mac mac = null;
        try {
            mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret = new SecretKeySpec(appSecret.getBytes(), "HmacSHA256");
            mac.init(secret);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }

        return mac.doFinal(encodedData.getBytes());
    }

    private String urlEncodeForMap(Map<String, Object> query) {
        return query.entrySet().stream().map(e -> {
            if (e.getValue() instanceof Map) {
                Map<String, Object> query0 = (Map<String, Object>) e.getValue();
                return query0.entrySet().stream().map(e0 -> {
                    return URLEncoder.encode(e.getKey() + "[" + e0.getKey() + "]") + "=" + URLEncoder.encode(e0.getValue().toString());
                }).collect(Collectors.joining("&"));
            } else if (e.getValue() instanceof String[]) {
                String[] objs = (String[]) e.getValue();
                String[] tmps = new String[objs.length];
                for (int i = 0; i < objs.length; i++) {
                    tmps[i] = URLEncoder.encode(e.getKey() + "[" + String.valueOf(i) + "]") + "=" + URLEncoder.encode(objs[i]);
                }
                return String.join("&", tmps);
            } else {
                return URLEncoder.encode(e.getKey()) + "=" + URLEncoder.encode(e.getValue().toString());
            }
        }).collect(Collectors.joining("&"));
    }

    private JSONObject _request(String api, String method, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers) {
        try {
            method = method.toUpperCase();
            SignRequest payload = this._payload(
                    query,
                    postData,
                    headers,
                    api,
                    method.toLowerCase()
            );
            Request.Builder builder = new Request.Builder();
            Request request;
            builder.url(payload.getUrl());
            // 循环payload的header put到builder
            for (Map.Entry<String, String> entry : payload.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), entry.getValue());
            }
            if (method.equals("GET")) {
                request = builder.get().build();
            } else if (method.equals("HEAD")) {
                request = builder.head().build();
            } else {
                RequestBody requestBody = RequestBody.create(mediaType, payload.getBody());
                switch (method) {
                    case "DELETE":
                        request = builder.delete(requestBody).build();
                        break;
                    case "PATCH":
                        request = builder.patch(requestBody).build();
                        break;
                    case "POST":
                        request = builder.post(requestBody).build();
                        break;
                    case "PUT":
                        request = builder.put(requestBody).build();
                        break;
                    default:
                        request = builder.get().build();
                        break;
                }
            }
            ResponseBody body = okHttpClient.newCall(request).execute().body();
            String rawBody = body.string();
            if (logger.isDebugEnabled()) {
                logger.debug("response raw body: {}", rawBody);
            }
            JSONObject jdata = JSON.parseObject(rawBody);
            jdata.put("code", jdata.getJSONObject("status").getInteger("code"));
            jdata.put("message", jdata.getJSONObject("status").getString("message"));
            return jdata;
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public JSONObject get(String api, Map<String, Object> query) {
        Map<String, String> headers = new HashMap<>();
        Map<String, Object> postData = new HashMap<>();
        return this._request(api, "get", query, postData, headers);
    }

    public JSONObject get(String api, Map<String, Object> query, Map<String, String> headers) {
        Map<String, Object> postData = new HashMap<>();
        return this._request(api, "get", query, postData, headers);
    }

    public JSONObject post(String api, Map<String, Object> postData) {
        Map<String, Object> query = new HashMap<>();
        Map<String, String> headers = new HashMap<>();
        return this._request(api, "post", query, postData, headers);
    }

    public JSONObject post(String api, Map<String, Object> query, Map<String, Object> postData) {
        Map<String, String> headers = new HashMap<>();
        return this._request(api, "post", query, postData, headers);
    }

    public JSONObject post(String api, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers) {
        return this._request(api, "post", query, postData, headers);
    }

    public JSONObject put(String api, Map<String, Object> postData) {
        Map<String, Object> query = new HashMap<>();
        Map<String, String> headers = new HashMap<>();
        return this._request(api, "put", query, postData, headers);
    }

    public JSONObject put(String api, Map<String, Object> query, Map<String, Object> postData) {
        Map<String, String> headers = new HashMap<>();
        return this._request(api, "put", query, postData, headers);
    }

    public JSONObject put(String api, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers) {
        return this._request(api, "put", query, postData, headers);
    }

    public JSONObject delete(String api, Map<String, Object> postData) {
        Map<String, Object> query = new HashMap<>();
        Map<String, String> headers = new HashMap<>();
        return this._request(api, "delete", query, postData, headers);
    }

    public JSONObject delete(String api, Map<String, Object> query, Map<String, Object> postData) {
        Map<String, String> headers = new HashMap<>();
        return this._request(api, "delete", query, postData, headers);
    }

    public JSONObject delete(String api, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers) {
        return this._request(api, "delete", query, postData, headers);
    }

    public JSONObject patch(String api, Map<String, Object> postData) {
        Map<String, Object> query = new HashMap<>();
        Map<String, String> headers = new HashMap<>();
        return this._request(api, "patch", query, postData, headers);
    }

    public JSONObject patch(String api, Map<String, Object> query, Map<String, Object> postData) {
        Map<String, String> headers = new HashMap<>();
        return this._request(api, "patch", query, postData, headers);
    }

    public JSONObject patch(String api, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers) {
        return this._request(api, "patch", query, postData, headers);
    }

}
