package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RouteAlternativesObserverNative implements RouteAlternativesObserver {
    protected long peer;

    public static class RouteAlternativesObserverPeerCleaner implements Runnable {
        private long peer;

        public RouteAlternativesObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouteAlternativesObserverNative.cleanNativePeer(this.peer);
        }
    }

    public RouteAlternativesObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteAlternativesObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    public native void onError(String str);

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    @Deprecated
    public native void onOnlinePrimaryRouteAvailable(RouteInterface routeInterface);

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    @Deprecated
    public native void onRouteAlternativesChanged(List<RouteAlternative> list, List<RouteAlternative> list2);

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    public native void onRouteAlternativesUpdated(RouteInterface routeInterface, List<RouteAlternative> list, List<RouteAlternative> list2);
}
