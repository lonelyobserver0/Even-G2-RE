package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RoadGraphUpdateAvailabilityCallbackNative implements RoadGraphUpdateAvailabilityCallback {
    private long peer;

    public static class RoadGraphUpdateAvailabilityCallbackPeerCleaner implements Runnable {
        private long peer;

        public RoadGraphUpdateAvailabilityCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RoadGraphUpdateAvailabilityCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RoadGraphUpdateAvailabilityCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RoadGraphUpdateAvailabilityCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RoadGraphUpdateAvailabilityCallback
    public native void run(boolean z2, RoadGraphVersionInfo roadGraphVersionInfo);
}
