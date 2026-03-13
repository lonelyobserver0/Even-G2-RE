package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class OfflineRegionCallbackNative implements OfflineRegionCallback {
    private long peer;

    public static class OfflineRegionCallbackPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private OfflineRegionCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineRegionCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.OfflineRegionCallback
    public native void run(Expected<String, List<OfflineRegion>> expected);
}
