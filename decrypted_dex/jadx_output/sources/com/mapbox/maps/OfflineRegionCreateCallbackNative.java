package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class OfflineRegionCreateCallbackNative implements OfflineRegionCreateCallback {
    private long peer;

    public static class OfflineRegionCreateCallbackPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionCreateCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionCreateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private OfflineRegionCreateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineRegionCreateCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.OfflineRegionCreateCallback
    public native void run(Expected<String, OfflineRegion> expected);
}
