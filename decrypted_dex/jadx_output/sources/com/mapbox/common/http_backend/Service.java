package com.mapbox.common.http_backend;

import com.mapbox.common.ResultCallback;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface Service {
    void cancelRequest(long j, ResultCallback resultCallback);

    long request(Request request, RequestObserver requestObserver);

    void setMaxRequestsPerHost(byte b2);

    boolean supportsKeepCompression();
}
