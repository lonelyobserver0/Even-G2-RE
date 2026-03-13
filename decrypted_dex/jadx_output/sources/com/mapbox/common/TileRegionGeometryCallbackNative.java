package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Geometry;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TileRegionGeometryCallbackNative implements TileRegionGeometryCallback {
    private long peer;

    public static class TileRegionGeometryCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionGeometryCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionGeometryCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionGeometryCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionGeometryCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TileRegionGeometryCallback
    public native void run(Expected<TileRegionError, Geometry> expected);
}
