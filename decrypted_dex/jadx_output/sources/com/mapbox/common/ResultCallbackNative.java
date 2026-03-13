package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ResultCallbackNative implements ResultCallback {
    private long peer;

    public static class ResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResultCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResultCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ResultCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.ResultCallback
    public native void run(boolean z2);
}
