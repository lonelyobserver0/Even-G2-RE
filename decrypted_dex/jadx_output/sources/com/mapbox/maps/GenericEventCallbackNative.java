package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class GenericEventCallbackNative implements GenericEventCallback {
    private long peer;

    public static class GenericEventCallbackPeerCleaner implements Runnable {
        private long peer;

        public GenericEventCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            GenericEventCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GenericEventCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GenericEventCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.GenericEventCallback
    public native void run(GenericEvent genericEvent);
}
