package com.mapbox.common.http_backend;

import com.mapbox.common.HttpRequestError;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface RequestObserver {
    void onData(long j);

    void onFailed(long j, HttpRequestError httpRequestError);

    void onResponse(long j, ResponseData responseData);

    void onSucceeded(long j);
}
