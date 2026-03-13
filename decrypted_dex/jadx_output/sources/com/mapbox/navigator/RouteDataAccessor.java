package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.route_data.RdRouteAnnotation;
import com.mapbox.navigator.route_data.RdRouteData;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteDataAccessor implements RouteDataAccessorInterface {
    protected long peer;

    public static class RouteDataAccessorPeerCleaner implements Runnable {
        private long peer;

        public RouteDataAccessorPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouteDataAccessor.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteDataAccessor(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native RdRouteAnnotation getRouteAnnotation(RouteInterface routeInterface);

    public static native RdRouteData getRouteData(RouteInterface routeInterface);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RouteDataAccessorPeerCleaner(j));
    }
}
