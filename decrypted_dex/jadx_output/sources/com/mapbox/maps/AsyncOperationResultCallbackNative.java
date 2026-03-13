package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AsyncOperationResultCallbackNative implements AsyncOperationResultCallback {
    private long peer;

    public static class AsyncOperationResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public AsyncOperationResultCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncOperationResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private AsyncOperationResultCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new AsyncOperationResultCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.AsyncOperationResultCallback
    public native void run(Expected<String, None> expected);
}
