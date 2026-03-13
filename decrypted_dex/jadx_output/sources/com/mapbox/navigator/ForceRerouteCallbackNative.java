package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ForceRerouteCallbackNative implements ForceRerouteCallback {
    private long peer;

    public static class ForceRerouteCallbackPeerCleaner implements Runnable {
        private long peer;

        public ForceRerouteCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForceRerouteCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ForceRerouteCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ForceRerouteCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.ForceRerouteCallback
    public native void run(Expected<RerouteError, RerouteInfo> expected);
}
