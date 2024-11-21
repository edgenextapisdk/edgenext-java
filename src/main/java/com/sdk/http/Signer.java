package com.sdk.http;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Signer {
    public static final String X_SDK_CONTENT_SHA256 = "x-sdk-content-sha256";
    public static final String X_SDK_DATE = "X-Sdk-Date";
    public static final String AUTHORIZATION = "X-Auth-Sign";
    public static final String HOST = "Host";
    public String messageDigestAlgorithm = "SDK-HMAC-SHA256";

    public Signer(String messageDigestAlgorithm) {
        this.messageDigestAlgorithm = messageDigestAlgorithm;
    }

    public Signer() {
    }

    public String sign(SignRequest request) throws UnsupportedEncodingException {
        String singerDate = this.getHeader(request, X_SDK_DATE);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'", Locale.ENGLISH);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        if (singerDate == null) {
            singerDate = sdf.format(new Date());
            request.addHeader(X_SDK_DATE, singerDate);
        }
        //this.addHostHeader(request);
        String messageDigestContent = this.calculateContentHash(request);
        String[] signedHeaders = this.getSignedHeaders(request);
        String canonicalRequest = this.createCanonicalRequest(request, signedHeaders, messageDigestContent);
        byte[] signingKey = this.deriveSigningKey(request.getSecrect());
        String stringToSign = this.createStringToSign(canonicalRequest, singerDate);
        byte[] signature = this.computeSignature(stringToSign, signingKey);
        return this.buildAuthorizationHeader(signedHeaders, signature, request.getKey());
    }

    protected String getCanonicalizedResourcePath(String resourcePath) throws UnsupportedEncodingException {
        if (resourcePath != null && !resourcePath.isEmpty()) {
            try {
                resourcePath = (new URI(resourcePath)).getPath();
            } catch (URISyntaxException var3) {
                return resourcePath;
            }

            String value = HttpUtils.urlEncode(resourcePath, true);
            if (!value.startsWith("/")) {
                value = "/".concat(value);
            }

            if (!value.endsWith("/")) {
                value = value.concat("/");
            }

            return value;
        } else {
            return "/";
        }
    }

    protected String getCanonicalizedQueryString(Map<String, List<String>> parameters) throws UnsupportedEncodingException {
        SortedMap<String, List<String>> sorted = new TreeMap();

        for(Map.Entry<String, List<String>> entry : parameters.entrySet()) {
            String encodedParamName = HttpUtils.urlEncode((String)entry.getKey(), false);
            List<String> paramValues = (List)entry.getValue();
            List<String> encodedValues = new ArrayList(paramValues.size());

            for(String value : paramValues) {
                encodedValues.add(HttpUtils.urlEncode(value, false));
            }

            Collections.sort(encodedValues);
            sorted.put(encodedParamName, encodedValues);
        }

        StringBuilder result = new StringBuilder();

        for(Map.Entry<String, List<String>> entry : sorted.entrySet()) {
            for(String value : entry.getValue()) {
                if (result.length() > 0) {
                    result.append("&");
                }

                result.append(entry.getKey()).append("=").append(value);
            }
        }

        return result.toString();
    }

    protected String createCanonicalRequest(SignRequest request, String[] signedHeaders, String messageDigestContent) throws UnsupportedEncodingException {
        return request.getMethod().toString() + "\n" +
                this.getCanonicalizedResourcePath(request.getPath()) +
                "\n" +
                this.getCanonicalizedQueryString(request.getQueryStringParams()) +
                "\n" +
                messageDigestContent;
    }

    protected String createStringToSign(String canonicalRequest, String singerDate) {
        return this.messageDigestAlgorithm + "\n" + singerDate + "\n" + toHex(this.hash(canonicalRequest));
    }

    private byte[] deriveSigningKey(String secret) {
        return secret.getBytes(StandardCharsets.UTF_8);
    }

    protected byte[] sign(byte[] data, byte[] key) {
        try {
            Mac mac = Mac.getInstance(SigningAlgorithm.HmacSHA256.toString());
            mac.init(new SecretKeySpec(key, SigningAlgorithm.HmacSHA256.toString()));
            return mac.doFinal(data);
        } catch (InvalidKeyException | NoSuchAlgorithmException var5) {
            return new byte[0];
        }
    }

    protected final byte[] computeSignature(String stringToSign, byte[] signingKey) {
        return this.sign(stringToSign.getBytes(StandardCharsets.UTF_8), signingKey);
    }

    private String buildAuthorizationHeader(String[] signedHeaders, byte[] signature, String accessKey) {
        return "Bearer " + toHex(signature);
    }

    protected String[] getSignedHeaders(SignRequest request) {
        String[] signedHeaders = (String[])request.getHeaders().keySet().toArray(new String[0]);
        Arrays.sort(signedHeaders, String.CASE_INSENSITIVE_ORDER);
        return signedHeaders;
    }

    protected String getCanonicalizedHeaderString(SignRequest request, String[] signedHeaders) {
        Map<String, String> requestHeaders = request.getHeaders();
        StringBuilder buffer = new StringBuilder();

        for(String header : signedHeaders) {
            String key = header.toLowerCase(Locale.getDefault());
            String value = (String)requestHeaders.get(header);
            buffer.append(key).append(":");
            if (value != null) {
                buffer.append(value.trim());
            }

            buffer.append("\n");
        }

        return buffer.toString();
    }

    protected String getSignedHeadersString(String[] signedHeaders) {
        StringBuilder buffer = new StringBuilder();

        for(String header : signedHeaders) {
            if (buffer.length() > 0) {
                buffer.append(";");
            }

            buffer.append(header.toLowerCase(Locale.getDefault()));
        }

        return buffer.toString();
    }

    protected void addHostHeader(SignRequest request) {
        boolean haveHostHeader = false;

        for(String key : request.getHeaders().keySet()) {
            if ("Host".equalsIgnoreCase(key)) {
                haveHostHeader = true;
                break;
            }
        }

        if (!haveHostHeader) {
            request.addHeader("Host", request.getHost());
        }

    }

    protected String getHeader(SignRequest request, String header) {
        if (header == null) {
            return null;
        } else {
            Map<String, String> headers = request.getHeaders();

            for(Map.Entry<String, String> entry : headers.entrySet()) {
                if (header.equalsIgnoreCase((String)entry.getKey())) {
                    return (String)entry.getValue();
                }
            }

            return null;
        }
    }

    protected String calculateContentHash(SignRequest request) {
        String content_sha256 = this.getHeader(request, "x-sdk-content-sha256");
        if (content_sha256 != null) {
            return content_sha256;
        } else {
            return toHex(this.hash(request.getBody())) ;
        }
    }

    public byte[] hash(String text) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes(StandardCharsets.UTF_8));
            return md.digest();
        } catch (NoSuchAlgorithmException var3) {
            return new byte[0];
        }
    }

    public static String toHex(byte[] data) {
        StringBuffer sbuff = new StringBuffer(data.length * 2);

        for(byte bye : data) {
            String hexStr = Integer.toHexString(bye);
            if (hexStr.length() == 1) {
                sbuff.append("0");
            } else if (hexStr.length() == 8) {
                hexStr = hexStr.substring(6);
            }

            sbuff.append(hexStr);
        }

        return sbuff.toString().toLowerCase(Locale.getDefault());
    }
}
