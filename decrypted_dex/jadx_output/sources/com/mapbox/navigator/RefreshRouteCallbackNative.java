package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RefreshRouteCallbackNative implements RefreshRouteCallback {
    private long peer;

    public static class RefreshRouteCallbackPeerCleaner implements Runnable {
        private long peer;

        public RefreshRouteCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RefreshRouteCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RefreshRouteCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RefreshRouteCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RefreshRouteCallback
    public native void run(Expected<String, RefreshRouteResult> expected);
}
