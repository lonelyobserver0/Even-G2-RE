package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TileRegionCallbackNative implements TileRegionCallback {
    private long peer;

    public static class TileRegionCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TileRegionCallback
    public native void run(Expected<TileRegionError, TileRegion> expected);
}
