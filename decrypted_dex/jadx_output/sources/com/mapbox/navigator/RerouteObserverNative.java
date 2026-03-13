package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RerouteObserverNative implements RerouteObserver {
    protected long peer;

    public static class RerouteObserverPeerCleaner implements Runnable {
        private long peer;

        public RerouteObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RerouteObserverNative.cleanNativePeer(this.peer);
        }
    }

    public RerouteObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RerouteObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RerouteObserver
    public native void onRerouteCancelled();

    @Override // com.mapbox.navigator.RerouteObserver
    public native boolean onRerouteDetected(String str);

    @Override // com.mapbox.navigator.RerouteObserver
    public native void onRerouteFailed(RerouteError rerouteError);

    @Override // com.mapbox.navigator.RerouteObserver
    public native void onRerouteReceived(DataRef dataRef, String str, RouterOrigin routerOrigin);

    @Override // com.mapbox.navigator.RerouteObserver
    public native void onSwitchToAlternative(RouteInterface routeInterface, int i3);
}
