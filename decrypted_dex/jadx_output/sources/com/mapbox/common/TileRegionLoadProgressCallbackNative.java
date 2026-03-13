package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TileRegionLoadProgressCallbackNative implements TileRegionLoadProgressCallback {
    private long peer;

    public static class TileRegionLoadProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionLoadProgressCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionLoadProgressCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionLoadProgressCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionLoadProgressCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TileRegionLoadProgressCallback
    public native void run(TileRegionLoadProgress tileRegionLoadProgress);
}
