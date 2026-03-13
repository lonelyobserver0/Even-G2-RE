package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RouteRefreshControllerInterfaceNative implements RouteRefreshControllerInterface {
    protected long peer;

    public static class RouteRefreshControllerInterfacePeerCleaner implements Runnable {
        private long peer;

        public RouteRefreshControllerInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouteRefreshControllerInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public RouteRefreshControllerInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteRefreshControllerInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RouteRefreshControllerInterface
    public native void addObserver(RouteRefreshObserver routeRefreshObserver);

    @Override // com.mapbox.navigator.RouteRefreshControllerInterface
    public native void removeAllObservers();

    @Override // com.mapbox.navigator.RouteRefreshControllerInterface
    public native void removeObserver(RouteRefreshObserver routeRefreshObserver);
}
