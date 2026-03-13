package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RouteRefreshObserverNative implements RouteRefreshObserver {
    protected long peer;

    public static class RouteRefreshObserverPeerCleaner implements Runnable {
        private long peer;

        public RouteRefreshObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouteRefreshObserverNative.cleanNativePeer(this.peer);
        }
    }

    public RouteRefreshObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteRefreshObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RouteRefreshObserver
    public native void onRouteRefreshAnnotationsUpdated(RouteIdentifier routeIdentifier, String str, int i3, int i10);

    @Override // com.mapbox.navigator.RouteRefreshObserver
    public native void onRouteRefreshCancelled(RouteIdentifier routeIdentifier);

    @Override // com.mapbox.navigator.RouteRefreshObserver
    public native void onRouteRefreshFailed(RouteIdentifier routeIdentifier, RouteRefreshError routeRefreshError);
}
