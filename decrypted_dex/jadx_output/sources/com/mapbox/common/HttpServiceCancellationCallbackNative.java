package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class HttpServiceCancellationCallbackNative implements HttpServiceCancellationCallback {
    private long peer;

    public static class HttpServiceCancellationCallbackPeerCleaner implements Runnable {
        private long peer;

        public HttpServiceCancellationCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceCancellationCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private HttpServiceCancellationCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new HttpServiceCancellationCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.HttpServiceCancellationCallback
    public native void run(long j, HttpRequest httpRequest);
}
