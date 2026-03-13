package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TileRegionBooleanCallbackNative implements TileRegionBooleanCallback {
    private long peer;

    public static class TileRegionBooleanCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionBooleanCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionBooleanCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionBooleanCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionBooleanCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TileRegionBooleanCallback
    public native void run(Expected<TileRegionError, Boolean> expected);
}
