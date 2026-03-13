package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class SetRouteCallbackNative implements SetRouteCallback {
    private long peer;

    public static class SetRouteCallbackPeerCleaner implements Runnable {
        private long peer;

        public SetRouteCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SetRouteCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SetRouteCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SetRouteCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.SetRouteCallback
    public native void run(Expected<String, SetRoutesResult> expected);
}
