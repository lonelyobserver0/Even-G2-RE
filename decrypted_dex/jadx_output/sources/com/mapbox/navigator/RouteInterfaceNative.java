package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.geojson.Point;
import java.util.Date;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RouteInterfaceNative implements RouteInterface {
    protected long peer;

    public static class RouteInterfacePeerCleaner implements Runnable {
        private long peer;

        public RouteInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouteInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public RouteInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RouteInterface
    public native Long getExpirationTimeMs();

    @Override // com.mapbox.navigator.RouteInterface
    public native Date getLastRefreshTimestamp();

    @Override // com.mapbox.navigator.RouteInterface
    public native MapboxAPI getMapboxAPI();

    @Override // com.mapbox.navigator.RouteInterface
    public native String getRequestUri();

    @Override // com.mapbox.navigator.RouteInterface
    public native DataRef getResponseJsonRef();

    @Override // com.mapbox.navigator.RouteInterface
    public native String getResponseUuid();

    @Override // com.mapbox.navigator.RouteInterface
    public native List<Point> getRouteGeometry();

    @Override // com.mapbox.navigator.RouteInterface
    public native String getRouteId();

    @Override // com.mapbox.navigator.RouteInterface
    public native int getRouteIndex();

    @Override // com.mapbox.navigator.RouteInterface
    public native RouteInfo getRouteInfo();

    @Override // com.mapbox.navigator.RouteInterface
    public native RouterOrigin getRouterOrigin();

    @Override // com.mapbox.navigator.RouteInterface
    public native List<Waypoint> getWaypoints();
}
