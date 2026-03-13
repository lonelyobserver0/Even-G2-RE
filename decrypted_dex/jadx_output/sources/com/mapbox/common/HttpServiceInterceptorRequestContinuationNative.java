package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class HttpServiceInterceptorRequestContinuationNative implements HttpServiceInterceptorRequestContinuation {
    private long peer;

    public static class HttpServiceInterceptorRequestContinuationPeerCleaner implements Runnable {
        private long peer;

        public HttpServiceInterceptorRequestContinuationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterceptorRequestContinuationNative.cleanNativePeer(this.peer);
        }
    }

    private HttpServiceInterceptorRequestContinuationNative(long j) {
        this.peer = j;
        CleanerService.register(this, new HttpServiceInterceptorRequestContinuationPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.HttpServiceInterceptorRequestContinuation
    public native void run(HttpRequestOrResponse httpRequestOrResponse);
}
