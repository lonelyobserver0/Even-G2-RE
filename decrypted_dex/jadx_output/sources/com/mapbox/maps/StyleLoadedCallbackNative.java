package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class StyleLoadedCallbackNative implements StyleLoadedCallback {
    private long peer;

    public static class StyleLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleLoadedCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleLoadedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleLoadedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleLoadedCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.StyleLoadedCallback
    public native void run(StyleLoaded styleLoaded);
}
