# EdgeNext API SDK for Java

A Java SDK for interacting with the EdgeNext API, providing easy-to-use methods for making authenticated RESTful API requests.

## Table of Contents

- [Overview](#overview)
- [Requirements](#requirements)
- [Authentication](#authentication)
- [Installation](#installation)
- [Usage](#usage)
- [API Reference](#api-reference)
- [Examples](#examples)

## Overview

This SDK provides a simple interface for making API calls to EdgeNext services. All requests are signed using SHA256 to ensure data integrity during transmission.

### Key Features

- Support for GET, POST, PATCH, PUT, and DELETE HTTP methods
- Automatic request signing with SHA256
- RESTful API design
- JSON request/response format
- Customizable OkHttpClient support

## Requirements

- Java >= 1.8
- Maven (for building)

## Authentication

### API Credentials

To use this SDK, you need to obtain the following credentials:

- **API Base URL**: The base URL for the API (e.g., `https://api.local.com/V4/`). Contact your operations team for the specific address.
- **App ID**: Your application ID
- **App Secret**: Your application secret used for signing requests

To obtain these credentials:
1. Register an EdgeNext account
2. Contact technical support to apply for API credentials binding

### Signature Algorithm

Every request is signed to ensure data integrity during transmission:

- **Client-side**: Uses SHA256 algorithm to sign the Base64-encoded parameters concatenated with `app_secret`
- **Server-side**: Validates the signature using the same algorithm

## Installation

Add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>org.edgenextapisdk</groupId>
    <artifactId>edgenextapisdk</artifactId>
    <version>0.1</version>
</dependency>
```

Or build from source:

```bash
mvn clean install
```

## Usage

### Initialization

Create an SDK instance with your credentials:

```java
// Basic initialization
Sdk sdkObj = new Sdk(apiUrlPre, appId, appSecret);

// With userId (for special scenarios)
Sdk sdkObj = new Sdk(apiUrlPre, appId, appSecret, userId);

// With custom OkHttpClient
OkHttpClient okHttpClient = new OkHttpClient.Builder()
    .connectTimeout(5, TimeUnit.SECONDS)
    .build();
Sdk sdkObj = new Sdk(apiUrlPre, appId, appSecret, "", okHttpClient);
```

### Parameters

- `apiUrlPre`: API base URL prefix
- `appId`: Your allocated app ID
- `appSecret`: Your allocated app secret, used for signing data

### Return Values

- All methods return a `JSONObject`
- Exceptions are thrown directly if an error occurs during execution
- Use the `debug()` method for debugging if needed

### Important Notes

For all requests, URI and GET parameters are separated. For example, for the URL `https://api.local.com/V4/version?v=1`, the `v=1` parameter must be passed through the `query` parameter:

```java
Map<String, Object> query = new HashMap<>();
query.put("v", "1");
JSONObject result = sdkObj.get(api, query, headers);
```

## API Reference

The SDK supports the following HTTP methods with multiple overloaded variants:

### GET

```java
JSONObject get(String api)
JSONObject get(String api, Map<String, Object> query)
JSONObject get(String api, Map<String, Object> query, Map<String, String> headers)
```

### POST

```java
JSONObject post(String api, Map<String, Object> postData)
JSONObject post(String api, Map<String, Object> query, Map<String, Object> postData)
JSONObject post(String api, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers)
```

### PATCH

```java
JSONObject patch(String api, Map<String, Object> postData)
JSONObject patch(String api, Map<String, Object> query, Map<String, Object> postData)
JSONObject patch(String api, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers)
```

### PUT

```java
JSONObject put(String api, Map<String, Object> postData)
JSONObject put(String api, Map<String, Object> query, Map<String, Object> postData)
JSONObject put(String api, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers)
```

### DELETE

```java
JSONObject delete(String api, Map<String, Object> postData)
JSONObject delete(String api, Map<String, Object> query, Map<String, Object> postData)
JSONObject delete(String api, Map<String, Object> query, Map<String, Object> postData, Map<String, String> headers)
```

## Examples

### Initialization

First, initialize the SDK instance:

```java
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sdk.Sdk;

// Basic initialization
Sdk sdkObj = new Sdk(apiUrlPre, appId, appSecret);

// With userId (for special scenarios)
// Sdk sdkObj = new Sdk(apiUrlPre, appId, appSecret, userId);

// With custom OkHttpClient
// OkHttpClient okHttpClient = new OkHttpClient.Builder()
//     .connectTimeout(5, TimeUnit.SECONDS)
//     .build();
// Sdk sdkObj = new Sdk(apiUrlPre, appId, appSecret, "", okHttpClient);
```

### GET Examples

```java
import java.util.Map;
import java.util.HashMap;

String api = "test.sdk.get";
Map<String, Object> query = new HashMap<>();
Map<String, String> headers = new HashMap<>();
JSONObject result;

// GET with query parameters
query.put("v", "1");
result = sdkObj.get(api, query);
System.out.println(JSON.toJSONString(result));

// GET with query parameters and headers
result = sdkObj.get(api, query, headers);
System.out.println(JSON.toJSONString(result));
```

### POST Examples

```java
import java.util.Map;
import java.util.HashMap;

String api = "test.sdk.post";
Map<String, Object> query = new HashMap<>();
Map<String, String> headers = new HashMap<>();
Map<String, Object> postData = new HashMap<>();
JSONObject result;

// POST with data only
postData.put("domain_id", "1");
postData.put("status", "2");
result = sdkObj.post(api, postData);
System.out.println(JSON.toJSONString(result));

// POST with query parameters and data
result = sdkObj.post(api, query, postData);
System.out.println(JSON.toJSONString(result));

// POST with query parameters, data, and headers
result = sdkObj.post(api, query, postData, headers);
System.out.println(JSON.toJSONString(result));

// POST with complex data (arrays and nested objects)
postData.clear();
postData.put("domain_ids", new int[]{10, 22, 3, 44, 5, 16, 7});
postData.put("status", "2");
Map<String, Object> extData = new HashMap<>();
extData.put("bcd", "string");
extData.put("abc", "000000");
extData.put("bac", 1);
extData.put("acb", 100.0);
postData.put("extdata", extData);
result = sdkObj.post(api, postData);
System.out.println(JSON.toJSONString(result));
```

### PATCH Examples

```java
import java.util.Map;
import java.util.HashMap;

String api = "test.sdk.patch";
Map<String, Object> query = new HashMap<>();
Map<String, String> headers = new HashMap<>();
Map<String, Object> postData = new HashMap<>();
JSONObject result;

// PATCH with data only
postData.put("domain_id", "1");
postData.put("status", "2");
result = sdkObj.patch(api, postData);
System.out.println(JSON.toJSONString(result));

// PATCH with query parameters and data
result = sdkObj.patch(api, query, postData);
System.out.println(JSON.toJSONString(result));

// PATCH with query parameters, data, and headers
result = sdkObj.patch(api, query, postData, headers);
System.out.println(JSON.toJSONString(result));
```

### PUT Examples

```java
import java.util.Map;
import java.util.HashMap;

String api = "test.sdk.put";
Map<String, Object> query = new HashMap<>();
Map<String, String> headers = new HashMap<>();
Map<String, Object> postData = new HashMap<>();
JSONObject result;

// PUT with data only
postData.put("domain_id", "1");
postData.put("status", "2");
result = sdkObj.put(api, postData);
System.out.println(JSON.toJSONString(result));

// PUT with query parameters and data
result = sdkObj.put(api, query, postData);
System.out.println(JSON.toJSONString(result));

// PUT with query parameters, data, and headers
result = sdkObj.put(api, query, postData, headers);
System.out.println(JSON.toJSONString(result));
```

### DELETE Examples

```java
import java.util.Map;
import java.util.HashMap;

String api = "test.sdk.delete";
Map<String, Object> query = new HashMap<>();
Map<String, String> headers = new HashMap<>();
Map<String, Object> postData = new HashMap<>();
JSONObject result;

// DELETE with data only
postData.put("domain_id", "1");
postData.put("status", "2");
result = sdkObj.delete(api, postData);
System.out.println(JSON.toJSONString(result));

// DELETE with query parameters and data
result = sdkObj.delete(api, query, postData);
System.out.println(JSON.toJSONString(result));

// DELETE with query parameters, data, and headers
result = sdkObj.delete(api, query, postData, headers);
System.out.println(JSON.toJSONString(result));
```