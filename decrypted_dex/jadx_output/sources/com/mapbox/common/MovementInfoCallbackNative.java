package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MovementInfoCallbackNative implements MovementInfoCallback {
    private long peer;

    public static class MovementInfoCallbackPeerCleaner implements Runnable {
        private long peer;

        public MovementInfoCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MovementInfoCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MovementInfoCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MovementInfoCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.MovementInfoCallback
    public native void run(Expected<String, MovementInfo> expected);
}
