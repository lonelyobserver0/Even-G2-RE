package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ReachabilityInterfaceNative implements ReachabilityInterface {
    protected long peer;

    public static class ReachabilityInterfacePeerCleaner implements Runnable {
        private long peer;

        public ReachabilityInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReachabilityInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public ReachabilityInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ReachabilityInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.ReachabilityInterface
    public native long addListener(ReachabilityChanged reachabilityChanged);

    @Override // com.mapbox.common.ReachabilityInterface
    public native NetworkStatus currentNetworkStatus();

    @Override // com.mapbox.common.ReachabilityInterface
    public native boolean isReachable();

    @Override // com.mapbox.common.ReachabilityInterface
    public native boolean removeListener(long j);
}
