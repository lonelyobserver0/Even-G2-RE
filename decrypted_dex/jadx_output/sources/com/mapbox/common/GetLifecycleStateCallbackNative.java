package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class GetLifecycleStateCallbackNative implements GetLifecycleStateCallback {
    private long peer;

    public static class GetLifecycleStateCallbackPeerCleaner implements Runnable {
        private long peer;

        public GetLifecycleStateCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            GetLifecycleStateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GetLifecycleStateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GetLifecycleStateCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.GetLifecycleStateCallback
    public native void run(Expected<String, LifecycleState> expected);
}
