package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Geometry;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TileStoreObserverNative implements TileStoreObserver {
    protected long peer;

    public static class TileStoreObserverPeerCleaner implements Runnable {
        private long peer;

        public TileStoreObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileStoreObserverNative.cleanNativePeer(this.peer);
        }
    }

    public TileStoreObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileStoreObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionGeometryChanged(String str, Geometry geometry);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionLoadFinished(String str, Expected<TileRegionError, TileRegion> expected);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionLoadProgress(String str, TileRegionLoadProgress tileRegionLoadProgress);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionMetadataChanged(String str, Value value);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionRemoved(String str);
}
