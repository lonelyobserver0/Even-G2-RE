package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdCoordinateArray implements RdCoordinateArrayInterface {
    protected long peer;

    public static class RdCoordinateArrayPeerCleaner implements Runnable {
        private long peer;

        public RdCoordinateArrayPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdCoordinateArray.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdCoordinateArray(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdCoordinateArrayPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdCoordinateArrayInterface
    public native Point get(long j);

    @Override // com.mapbox.navigator.route_data.RdCoordinateArrayInterface
    public native List<Point> rawArray();

    @Override // com.mapbox.navigator.route_data.RdCoordinateArrayInterface
    public native long size();
}
