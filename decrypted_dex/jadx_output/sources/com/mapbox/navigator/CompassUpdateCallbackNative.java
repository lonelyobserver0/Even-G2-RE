package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class CompassUpdateCallbackNative implements CompassUpdateCallback {
    private long peer;

    public static class CompassUpdateCallbackPeerCleaner implements Runnable {
        private long peer;

        public CompassUpdateCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            CompassUpdateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private CompassUpdateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CompassUpdateCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.CompassUpdateCallback
    public native void run(CompassData compassData);
}
