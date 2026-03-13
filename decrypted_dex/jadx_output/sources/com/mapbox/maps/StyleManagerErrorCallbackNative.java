package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class StyleManagerErrorCallbackNative implements StyleManagerErrorCallback {
    private long peer;

    public static class StyleManagerErrorCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleManagerErrorCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleManagerErrorCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleManagerErrorCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleManagerErrorCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.StyleManagerErrorCallback
    public native void run(StyleManager styleManager, MapLoadingError mapLoadingError);
}
