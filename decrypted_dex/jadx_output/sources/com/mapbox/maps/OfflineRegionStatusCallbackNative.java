package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class OfflineRegionStatusCallbackNative implements OfflineRegionStatusCallback {
    private long peer;

    public static class OfflineRegionStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionStatusCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private OfflineRegionStatusCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineRegionStatusCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.OfflineRegionStatusCallback
    public native void run(Expected<String, OfflineRegionStatus> expected);
}
