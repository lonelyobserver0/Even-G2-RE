package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RouterInterfaceNative implements RouterInterface {
    protected long peer;

    public static class RouterInterfacePeerCleaner implements Runnable {
        private long peer;

        public RouterInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouterInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public RouterInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouterInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RouterInterface
    public native void cancelAll();

    @Override // com.mapbox.navigator.RouterInterface
    public native void cancelRouteMapMatchedRequest(long j);

    @Override // com.mapbox.navigator.RouterInterface
    public native void cancelRouteRefreshRequest(long j);

    @Override // com.mapbox.navigator.RouterInterface
    public native void cancelRouteRequest(long j);

    @Override // com.mapbox.navigator.RouterInterface
    public native long getRoute(String str, GetRouteOptions getRouteOptions, GetRouteSignature getRouteSignature, RouterDataRefCallback routerDataRefCallback);

    @Override // com.mapbox.navigator.RouterInterface
    public native long getRouteMapMatched(String str, GetRouteOptions getRouteOptions, RouterDataRefCallback routerDataRefCallback);

    @Override // com.mapbox.navigator.RouterInterface
    public native long getRouteRefresh(RouteRefreshOptions routeRefreshOptions, RouterRefreshCallback routerRefreshCallback);
}
