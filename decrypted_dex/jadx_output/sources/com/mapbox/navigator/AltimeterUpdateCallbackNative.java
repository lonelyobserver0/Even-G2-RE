package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AltimeterUpdateCallbackNative implements AltimeterUpdateCallback {
    private long peer;

    public static class AltimeterUpdateCallbackPeerCleaner implements Runnable {
        private long peer;

        public AltimeterUpdateCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AltimeterUpdateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private AltimeterUpdateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new AltimeterUpdateCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.AltimeterUpdateCallback
    public native void run(AltimeterData altimeterData);
}
