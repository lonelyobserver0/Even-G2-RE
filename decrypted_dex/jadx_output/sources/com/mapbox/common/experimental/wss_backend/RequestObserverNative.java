package com.mapbox.common.experimental.wss_backend;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.HttpRequestError;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class RequestObserverNative implements RequestObserver {
    protected long peer;

    public static class RequestObserverPeerCleaner implements Runnable {
        private long peer;

        public RequestObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestObserverNative.cleanNativePeer(this.peer);
        }
    }

    public RequestObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RequestObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onData(long j, WsOpCode wsOpCode, boolean z2);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onFailed(long j, HttpRequestError httpRequestError, Integer num);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onResponse(long j, ResponseData responseData);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onSucceeded(long j);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onSwitchingProtocols(long j);
}
