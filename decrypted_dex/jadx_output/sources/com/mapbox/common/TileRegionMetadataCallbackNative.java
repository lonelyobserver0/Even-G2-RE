package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TileRegionMetadataCallbackNative implements TileRegionMetadataCallback {
    private long peer;

    public static class TileRegionMetadataCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionMetadataCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionMetadataCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionMetadataCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionMetadataCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TileRegionMetadataCallback
    public native void run(Expected<TileRegionError, Value> expected);
}
