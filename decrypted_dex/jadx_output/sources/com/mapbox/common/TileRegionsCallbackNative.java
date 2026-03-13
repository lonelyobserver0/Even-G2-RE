package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TileRegionsCallbackNative implements TileRegionsCallback {
    private long peer;

    public static class TileRegionsCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionsCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionsCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionsCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionsCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TileRegionsCallback
    public native void run(Expected<TileRegionError, List<TileRegion>> expected);
}
