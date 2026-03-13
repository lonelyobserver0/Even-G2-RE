package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.geojson.Point;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ElevationDataNative implements ElevationData {
    protected long peer;

    public static class ElevationDataPeerCleaner implements Runnable {
        private long peer;

        public ElevationDataPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ElevationDataNative.cleanNativePeer(this.peer);
        }
    }

    public ElevationDataNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ElevationDataPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.ElevationData
    public native Double getElevation(Point point);

    @Override // com.mapbox.maps.ElevationData
    public native double getTerrainExaggeration();
}
