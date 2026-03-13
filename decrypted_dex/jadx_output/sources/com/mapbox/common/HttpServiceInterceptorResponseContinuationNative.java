package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class HttpServiceInterceptorResponseContinuationNative implements HttpServiceInterceptorResponseContinuation {
    private long peer;

    public static class HttpServiceInterceptorResponseContinuationPeerCleaner implements Runnable {
        private long peer;

        public HttpServiceInterceptorResponseContinuationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterceptorResponseContinuationNative.cleanNativePeer(this.peer);
        }
    }

    private HttpServiceInterceptorResponseContinuationNative(long j) {
        this.peer = j;
        CleanerService.register(this, new HttpServiceInterceptorResponseContinuationPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.HttpServiceInterceptorResponseContinuation
    public native void run(HttpResponse httpResponse);
}
