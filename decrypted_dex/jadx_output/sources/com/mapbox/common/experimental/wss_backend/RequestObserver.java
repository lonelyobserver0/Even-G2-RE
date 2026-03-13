package com.mapbox.common.experimental.wss_backend;

import com.mapbox.common.HttpRequestError;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface RequestObserver {
    void onData(long j, WsOpCode wsOpCode, boolean z2);

    void onFailed(long j, HttpRequestError httpRequestError, Integer num);

    void onResponse(long j, ResponseData responseData);

    void onSucceeded(long j);

    void onSwitchingProtocols(long j);
}
