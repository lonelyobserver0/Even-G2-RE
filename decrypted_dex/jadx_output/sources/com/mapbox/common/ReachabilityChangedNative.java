package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ReachabilityChangedNative implements ReachabilityChanged {
    private long peer;

    public static class ReachabilityChangedPeerCleaner implements Runnable {
        private long peer;

        public ReachabilityChangedPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReachabilityChangedNative.cleanNativePeer(this.peer);
        }
    }

    private ReachabilityChangedNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ReachabilityChangedPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.ReachabilityChanged
    public native void run(NetworkStatus networkStatus);
}
