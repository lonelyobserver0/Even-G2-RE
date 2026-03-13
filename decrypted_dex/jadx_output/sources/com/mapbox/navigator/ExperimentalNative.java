package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ExperimentalNative implements Experimental {
    protected long peer;

    public static class ExperimentalPeerCleaner implements Runnable {
        private long peer;

        public ExperimentalPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExperimentalNative.cleanNativePeer(this.peer);
        }
    }

    public ExperimentalNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ExperimentalPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.Experimental
    @Deprecated
    public native void generateEh360(double d8, GenerateEh360Callback generateEh360Callback);

    @Override // com.mapbox.navigator.Experimental
    @Deprecated
    public native void updateETCGateInfo(ETCGateInfo eTCGateInfo);
}
