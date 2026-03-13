package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class StyleImageRemoveUnusedCallbackNative implements StyleImageRemoveUnusedCallback {
    private long peer;

    public static class StyleImageRemoveUnusedCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleImageRemoveUnusedCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleImageRemoveUnusedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleImageRemoveUnusedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleImageRemoveUnusedCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.StyleImageRemoveUnusedCallback
    public native void run(StyleImageRemoveUnused styleImageRemoveUnused);
}
