package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdRouteData implements RdRouteDataInterface {
    protected long peer;

    public static class RdRouteDataPeerCleaner implements Runnable {
        private long peer;

        public RdRouteDataPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdRouteData.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdRouteData(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdRouteDataPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdRouteDataInterface
    public native double distance();

    @Override // com.mapbox.navigator.route_data.RdRouteDataInterface
    public native double duration();

    @Override // com.mapbox.navigator.route_data.RdRouteDataInterface
    public native RdCoordinateArray geometry();

    @Override // com.mapbox.navigator.route_data.RdRouteDataInterface
    public native RdLegArray legs();

    @Override // com.mapbox.navigator.route_data.RdRouteDataInterface
    public native String voiceLocale();

    @Override // com.mapbox.navigator.route_data.RdRouteDataInterface
    public native RdWaypointArray waypoints();

    @Override // com.mapbox.navigator.route_data.RdRouteDataInterface
    public native double weight();

    @Override // com.mapbox.navigator.route_data.RdRouteDataInterface
    public native String weightName();
}
