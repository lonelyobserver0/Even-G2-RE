package com.mapbox.common.experimental.wss_backend;

import com.mapbox.common.ResultCallback;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface Service {
    void cancelConnection(long j, ResultCallback resultCallback);

    long connect(Request request, RequestObserver requestObserver);

    void setPingTimeout(long j);

    void write(long j, Data data);
}
