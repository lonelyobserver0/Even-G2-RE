package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class UpdateLocationCallbackNative implements UpdateLocationCallback {
    private long peer;

    public static class UpdateLocationCallbackPeerCleaner implements Runnable {
        private long peer;

        public UpdateLocationCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            UpdateLocationCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private UpdateLocationCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new UpdateLocationCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.UpdateLocationCallback
    public native void run(boolean z2);
}
