package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class HttpRequestOrResponse {
    private Type type;
    private Object value;

    public enum Type {
        HTTP_REQUEST,
        HTTP_RESPONSE
    }

    public HttpRequestOrResponse(HttpRequest httpRequest) {
        this.type = Type.HTTP_REQUEST;
        this.value = httpRequest;
    }

    public static HttpRequestOrResponse valueOf(HttpRequest httpRequest) {
        return new HttpRequestOrResponse(httpRequest);
    }

    public HttpRequest getHttpRequest() {
        if (isHttpRequest()) {
            return (HttpRequest) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(13332));
    }

    public HttpResponse getHttpResponse() {
        if (isHttpResponse()) {
            return (HttpResponse) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(13333));
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isHttpRequest() {
        return this.type == Type.HTTP_REQUEST;
    }

    public boolean isHttpResponse() {
        return this.type == Type.HTTP_RESPONSE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static HttpRequestOrResponse valueOf(HttpResponse httpResponse) {
        return new HttpRequestOrResponse(httpResponse);
    }

    public HttpRequestOrResponse(HttpResponse httpResponse) {
        this.type = Type.HTTP_RESPONSE;
        this.value = httpResponse;
    }
}
