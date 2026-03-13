package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RoadGraphVersionInfoCallbackNative implements RoadGraphVersionInfoCallback {
    private long peer;

    public static class RoadGraphVersionInfoCallbackPeerCleaner implements Runnable {
        private long peer;

        public RoadGraphVersionInfoCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RoadGraphVersionInfoCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RoadGraphVersionInfoCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RoadGraphVersionInfoCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RoadGraphVersionInfoCallback
    public native void run(boolean z2, RoadGraphVersionInfo roadGraphVersionInfo);
}
