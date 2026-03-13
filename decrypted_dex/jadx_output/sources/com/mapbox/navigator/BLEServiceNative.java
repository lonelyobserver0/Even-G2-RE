package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class BLEServiceNative implements BLEService {
    protected long peer;

    public static class BLEServicePeerCleaner implements Runnable {
        private long peer;

        public BLEServicePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            BLEServiceNative.cleanNativePeer(this.peer);
        }
    }

    public BLEServiceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new BLEServicePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.BLEService
    public native int registerScanResultCallback(ScanResultCallback scanResultCallback);

    @Override // com.mapbox.navigator.BLEService
    public native void unregisterCallback(int i3);
}
