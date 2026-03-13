package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RerouteCallbackNative implements RerouteCallback {
    private long peer;

    public static class RerouteCallbackPeerCleaner implements Runnable {
        private long peer;

        public RerouteCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RerouteCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RerouteCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RerouteCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RerouteCallback
    public native void run(Expected<RerouteError, RerouteInfo> expected);
}
