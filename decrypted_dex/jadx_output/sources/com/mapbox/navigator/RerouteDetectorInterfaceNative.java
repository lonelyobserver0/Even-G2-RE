package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RerouteDetectorInterfaceNative implements RerouteDetectorInterface {
    protected long peer;

    public static class RerouteDetectorInterfacePeerCleaner implements Runnable {
        private long peer;

        public RerouteDetectorInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RerouteDetectorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public RerouteDetectorInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RerouteDetectorInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RerouteDetectorInterface
    public native void cancelReroute();

    @Override // com.mapbox.navigator.RerouteDetectorInterface
    public native void forceReroute(ForceRerouteReason forceRerouteReason);

    @Override // com.mapbox.navigator.RerouteDetectorInterface
    public native void forceReroute(ForceRerouteReason forceRerouteReason, ForceRerouteCallback forceRerouteCallback);

    @Override // com.mapbox.navigator.RerouteDetectorInterface
    public native boolean isReroute();
}
