package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class HttpServiceInterceptorInterfaceNative implements HttpServiceInterceptorInterface {
    protected long peer;

    public static class HttpServiceInterceptorInterfacePeerCleaner implements Runnable {
        private long peer;

        public HttpServiceInterceptorInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterceptorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public HttpServiceInterceptorInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new HttpServiceInterceptorInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.HttpServiceInterceptorInterface
    public native void onRequest(HttpRequest httpRequest, HttpServiceInterceptorRequestContinuation httpServiceInterceptorRequestContinuation);

    @Override // com.mapbox.common.HttpServiceInterceptorInterface
    public native void onResponse(HttpResponse httpResponse, HttpServiceInterceptorResponseContinuation httpServiceInterceptorResponseContinuation);
}
