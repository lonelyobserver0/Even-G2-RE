package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class FlushOperationResultCallbackNative implements FlushOperationResultCallback {
    private long peer;

    public static class FlushOperationResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public FlushOperationResultCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            FlushOperationResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private FlushOperationResultCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new FlushOperationResultCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.FlushOperationResultCallback
    public native void run(Expected<String, None> expected);
}
