package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AmbientCacheClearingCallbackNative implements AmbientCacheClearingCallback {
    private long peer;

    public static class AmbientCacheClearingCallbackPeerCleaner implements Runnable {
        private long peer;

        public AmbientCacheClearingCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AmbientCacheClearingCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private AmbientCacheClearingCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new AmbientCacheClearingCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.AmbientCacheClearingCallback
    public native void run(Expected<CacheClearingError, Long> expected);
}
