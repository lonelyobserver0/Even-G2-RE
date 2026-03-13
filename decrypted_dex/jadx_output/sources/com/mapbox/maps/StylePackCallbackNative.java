package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class StylePackCallbackNative implements StylePackCallback {
    private long peer;

    public static class StylePackCallbackPeerCleaner implements Runnable {
        private long peer;

        public StylePackCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StylePackCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StylePackCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StylePackCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.StylePackCallback
    public native void run(Expected<StylePackError, StylePack> expected);
}
