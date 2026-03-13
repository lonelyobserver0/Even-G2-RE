package com.mapbox.common.http_backend;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.ResultCallback;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ServiceNative implements Service {
    protected long peer;

    public static class ServicePeerCleaner implements Runnable {
        private long peer;

        public ServicePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ServiceNative.cleanNativePeer(this.peer);
        }
    }

    public ServiceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ServicePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.http_backend.Service
    public native void cancelRequest(long j, ResultCallback resultCallback);

    @Override // com.mapbox.common.http_backend.Service
    public native long request(Request request, RequestObserver requestObserver);

    @Override // com.mapbox.common.http_backend.Service
    public native void setMaxRequestsPerHost(byte b2);

    @Override // com.mapbox.common.http_backend.Service
    public native boolean supportsKeepCompression();
}
