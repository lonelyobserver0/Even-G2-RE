package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ChangeLegCallbackNative implements ChangeLegCallback {
    private long peer;

    public static class ChangeLegCallbackPeerCleaner implements Runnable {
        private long peer;

        public ChangeLegCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChangeLegCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ChangeLegCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ChangeLegCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.ChangeLegCallback
    public native void run(boolean z2);
}
