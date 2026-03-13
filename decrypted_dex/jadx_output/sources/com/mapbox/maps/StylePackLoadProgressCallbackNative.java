package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class StylePackLoadProgressCallbackNative implements StylePackLoadProgressCallback {
    private long peer;

    public static class StylePackLoadProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        public StylePackLoadProgressCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StylePackLoadProgressCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StylePackLoadProgressCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StylePackLoadProgressCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.StylePackLoadProgressCallback
    public native void run(StylePackLoadProgress stylePackLoadProgress);
}
