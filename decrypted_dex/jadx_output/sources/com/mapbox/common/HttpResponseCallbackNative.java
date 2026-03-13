package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class HttpResponseCallbackNative implements HttpResponseCallback {
    private long peer;

    public static class HttpResponseCallbackPeerCleaner implements Runnable {
        private long peer;

        public HttpResponseCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpResponseCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private HttpResponseCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new HttpResponseCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.HttpResponseCallback
    public native void run(HttpResponse httpResponse);
}
