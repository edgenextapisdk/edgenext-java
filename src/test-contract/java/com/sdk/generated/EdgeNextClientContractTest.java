package com.sdk.generated;

import com.alibaba.fastjson.JSONObject;
import com.sdk.Sdk;
import com.sdk.generated.requests.AddDomainsRequest;
import com.sdk.generated.requests.ListDomainsRequest;
import com.sdk.generated.requests.UpdateDomainsRequest;

import java.util.HashMap;
import java.util.Map;

public class EdgeNextClientContractTest {
    static class CapturingSdk extends Sdk {
        String method;
        String api;
        Map<String, Object> query;
        Map<String, Object> body;
        Map<String, String> headers;
        JSONObject nextResponse;

        CapturingSdk() {
            super("https://api.edgenextscdn.com/api/v5", "app", "secret");
            this.nextResponse = ok();
        }

        @Override
        public JSONObject get(String api, Map<String, Object> query, Map<String, String> headers) {
            capture("GET", api, query, null, headers);
            return nextResponse;
        }

        @Override
        public JSONObject post(String api, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers) {
            capture("POST", api, query, postData, headers);
            return nextResponse;
        }

        @Override
        public JSONObject put(String api, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers) {
            capture("PUT", api, query, postData, headers);
            return nextResponse;
        }

        @Override
        public JSONObject patch(String api, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers) {
            capture("PATCH", api, query, postData, headers);
            return nextResponse;
        }

        @Override
        public JSONObject delete(String api, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers) {
            capture("DELETE", api, query, postData, headers);
            return nextResponse;
        }

        private void capture(String method, String api, Map<String, Object> query, Map<String, Object> body, Map<String, String> headers) {
            this.method = method;
            this.api = api;
            this.query = query == null ? new HashMap<>() : new HashMap<>(query);
            this.body = body == null ? null : new HashMap<>(body);
            this.headers = headers == null ? new HashMap<>() : new HashMap<>(headers);
        }

        private static JSONObject ok() {
            JSONObject status = new JSONObject();
            status.put("code", 1);
            status.put("message", "ok");
            JSONObject data = new JSONObject();
            data.put("ok", true);
            JSONObject response = new JSONObject();
            response.put("status", status);
            response.put("data", data);
            return response;
        }
    }

    public static void main(String[] args) {
        apiPathToSdkApiHandlesApiPrefixes();
        getRequestUsesQueryAndDefaultHeaders();
        postRequestUsesBody();
        callApiAcceptsDocumentedApiNameAndMethodOverride();
        wrongRequestObjectIsRejected();
        businessErrorRaisesApiException();
        System.out.println("Generated EdgeNext Java client contract tests passed");
    }

    private static void apiPathToSdkApiHandlesApiPrefixes() {
        assertEquals("domains", EdgeNextClient.apiPathToSdkApi("/api/v5/domains", "https://api.edgenextscdn.com/api/v5"), "versioned API prefix");
        assertEquals("api/v5/domains", EdgeNextClient.apiPathToSdkApi("/api/v5/domains", "https://api.edgenextscdn.com"), "host-only API prefix");
        assertEquals("v5/Web.ca.self.list", EdgeNextClient.apiPathToSdkApi("api/v5/Web.ca.self.list", "https://api.edgenextscdn.com/api"), "plain API prefix");
    }

    private static void getRequestUsesQueryAndDefaultHeaders() {
        CapturingSdk sdk = new CapturingSdk();
        EdgeNextClient client = new EdgeNextClient(sdk).setLanguage("zh");
        ListDomainsRequest request = new ListDomainsRequest().setPage(1);
        request.putHeader("X-Lang", "en");
        client.listDomains(request);

        assertEquals("GET", sdk.method, "GET method");
        assertEquals("domains", sdk.api, "GET path");
        assertEquals(1, sdk.query.get("page"), "GET query");
        assertEquals("en", sdk.headers.get("X-Lang"), "header override");
    }

    private static void postRequestUsesBody() {
        CapturingSdk sdk = new CapturingSdk();
        new EdgeNextClient(sdk).addDomains(new AddDomainsRequest().setDomain("example.com").setGroupId(1));

        assertEquals("POST", sdk.method, "POST method");
        assertEquals("domains", sdk.api, "POST path");
        assertEquals("example.com", sdk.body.get("domain"), "POST body domain");
        assertEquals(1, sdk.body.get("group_id"), "POST body group");
    }

    private static void callApiAcceptsDocumentedApiNameAndMethodOverride() {
        CapturingSdk sdk = new CapturingSdk();
        Map<String, Object> query = new HashMap<>();
        query.put("page", 1);
        new EdgeNextClient(sdk).callApi("LogDownloadTask_taskList", null, query, null, null, "GET");

        assertEquals("GET", sdk.method, "method override");
        assertEquals("soc.log.download.task.list", sdk.api, "method override path");
        assertEquals(1, sdk.query.get("page"), "method override query");
    }

    private static void wrongRequestObjectIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> new EdgeNextClient(new CapturingSdk()).callApi("AddDomains", new UpdateDomainsRequest(), null, null, null, null), "wrong request");
    }

    private static void businessErrorRaisesApiException() {
        CapturingSdk sdk = new CapturingSdk();
        JSONObject status = new JSONObject();
        status.put("code", 401);
        status.put("message", "denied");
        sdk.nextResponse = new JSONObject();
        sdk.nextResponse.put("status", status);

        ApiException error = assertThrows(ApiException.class, () -> new EdgeNextClient(sdk).listDomains(new ListDomainsRequest()), "business error");
        assertEquals(Integer.valueOf(401), error.getCode(), "business error code");
        assertEquals("denied", error.getMessage(), "business error message");
    }

    private static void assertEquals(Object expected, Object actual, String message) {
        if (expected == null ? actual != null : !expected.equals(actual)) {
            throw new AssertionError(message + ": expected " + expected + ", got " + actual);
        }
    }

    private static <T extends Throwable> T assertThrows(Class<T> type, Runnable fn, String message) {
        try {
            fn.run();
        } catch (Throwable err) {
            if (type.isInstance(err)) {
                return type.cast(err);
            }
            throw new AssertionError(message + ": expected " + type.getName() + ", got " + err.getClass().getName(), err);
        }
        throw new AssertionError(message + ": no exception thrown");
    }
}
