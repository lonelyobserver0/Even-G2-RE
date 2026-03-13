package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RouteAlternativesControllerInterfaceNative implements RouteAlternativesControllerInterface {
    protected long peer;

    public static class RouteAlternativesControllerInterfacePeerCleaner implements Runnable {
        private long peer;

        public RouteAlternativesControllerInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouteAlternativesControllerInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public RouteAlternativesControllerInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteAlternativesControllerInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RouteAlternativesControllerInterface
    public native void addObserver(RouteAlternativesObserver routeAlternativesObserver);

    @Override // com.mapbox.navigator.RouteAlternativesControllerInterface
    public native void removeAllObservers();

    @Override // com.mapbox.navigator.RouteAlternativesControllerInterface
    public native void removeObserver(RouteAlternativesObserver routeAlternativesObserver);

    @Override // com.mapbox.navigator.RouteAlternativesControllerInterface
    public native void setRouteAlternativesOptions(RouteAlternativesOptions routeAlternativesOptions);
}
