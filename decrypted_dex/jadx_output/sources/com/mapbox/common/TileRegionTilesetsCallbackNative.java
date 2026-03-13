package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TileRegionTilesetsCallbackNative implements TileRegionTilesetsCallback {
    private long peer;

    public static class TileRegionTilesetsCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionTilesetsCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionTilesetsCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionTilesetsCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionTilesetsCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TileRegionTilesetsCallback
    public native void run(Expected<TileRegionError, TilesetDescriptor> expected);
}
