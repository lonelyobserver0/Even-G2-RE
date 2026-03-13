package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TileRegionEstimateResultCallbackNative implements TileRegionEstimateResultCallback {
    private long peer;

    public static class TileRegionEstimateResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionEstimateResultCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionEstimateResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionEstimateResultCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionEstimateResultCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TileRegionEstimateResultCallback
    public native void run(Expected<TileRegionError, TileRegionEstimateResult> expected);
}
