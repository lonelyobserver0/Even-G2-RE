package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class ScanResultCallbackNative implements ScanResultCallback {
    private long peer;

    public static class ScanResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public ScanResultCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScanResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ScanResultCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ScanResultCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.ScanResultCallback
    public native void run(ScanResult scanResult);
}
