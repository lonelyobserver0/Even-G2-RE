package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class StyleImageMissingCallbackNative implements StyleImageMissingCallback {
    private long peer;

    public static class StyleImageMissingCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleImageMissingCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleImageMissingCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleImageMissingCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleImageMissingCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public native void run(StyleImageMissing styleImageMissing);
}
