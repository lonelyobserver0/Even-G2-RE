package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class ResetCallbackNative implements ResetCallback {
    private long peer;

    public static class ResetCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResetCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResetCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResetCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ResetCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.ResetCallback
    public native void run();
}
