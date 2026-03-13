package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class IMUUpdateCallbackNative implements IMUUpdateCallback {
    private long peer;

    public static class IMUUpdateCallbackPeerCleaner implements Runnable {
        private long peer;

        public IMUUpdateCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IMUUpdateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private IMUUpdateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new IMUUpdateCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.IMUUpdateCallback
    public native void run(MotionData motionData);
}
