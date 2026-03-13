package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GeoUtils implements GeoUtilsInterface {
    protected long peer;

    public static class GeoUtilsPeerCleaner implements Runnable {
        private long peer;

        public GeoUtilsPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            GeoUtils.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GeoUtils(long j) {
        setPeer(j);
    }

    public static native double calculateShapeLength(Geometry geometry);

    public static native double calculateShapeLength(Geometry geometry, int i3, int i10);

    public static native void cleanNativePeer(long j);

    public static native long getTopoLinkId(Geometry geometry, int i3, int i10);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new GeoUtilsPeerCleaner(j));
    }
}
