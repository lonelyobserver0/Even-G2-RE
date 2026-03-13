package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Projection {
    protected long peer;

    public static class ProjectionPeerCleaner implements Runnable {
        private long peer;

        public ProjectionPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            Projection.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Projection(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native Point coordinateForProjectedMeters(ProjectedMeters projectedMeters);

    public static native double getLatitudeScale(double d8);

    public static native double getMetersPerPixelAtLatitude(double d8, double d10);

    public static native Vec2 latLngToMercatorXY(Point point);

    public static native MercatorCoordinate project(Point point, double d8);

    public static native ProjectedMeters projectedMetersForCoordinate(Point point);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ProjectionPeerCleaner(j));
    }

    public static native Point unproject(MercatorCoordinate mercatorCoordinate, double d8);

    public static native double worldSize(double d8);
}
