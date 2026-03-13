package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface HttpServiceInterceptorInterface {
    void onRequest(HttpRequest httpRequest, HttpServiceInterceptorRequestContinuation httpServiceInterceptorRequestContinuation);

    void onResponse(HttpResponse httpResponse, HttpServiceInterceptorResponseContinuation httpServiceInterceptorResponseContinuation);
}
