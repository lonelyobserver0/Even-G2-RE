package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class StyleManagerCallbackNative implements StyleManagerCallback {
    private long peer;

    public static class StyleManagerCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleManagerCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleManagerCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleManagerCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleManagerCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.StyleManagerCallback
    public native void run(StyleManager styleManager);
}
