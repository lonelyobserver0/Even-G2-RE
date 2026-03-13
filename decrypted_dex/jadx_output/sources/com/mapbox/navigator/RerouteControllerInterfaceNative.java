package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RerouteControllerInterfaceNative implements RerouteControllerInterface {
    protected long peer;

    public static class RerouteControllerInterfacePeerCleaner implements Runnable {
        private long peer;

        public RerouteControllerInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RerouteControllerInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public RerouteControllerInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RerouteControllerInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RerouteControllerInterface
    public native void cancel();

    @Override // com.mapbox.navigator.RerouteControllerInterface
    public native void reroute(String str, RerouteCallback rerouteCallback);

    @Override // com.mapbox.navigator.RerouteControllerInterface
    public native void setOptionsAdapter(RouteOptionsAdapter routeOptionsAdapter);
}
