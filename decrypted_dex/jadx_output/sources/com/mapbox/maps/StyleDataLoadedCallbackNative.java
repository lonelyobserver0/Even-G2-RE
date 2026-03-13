package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class StyleDataLoadedCallbackNative implements StyleDataLoadedCallback {
    private long peer;

    public static class StyleDataLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleDataLoadedCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleDataLoadedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleDataLoadedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleDataLoadedCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public native void run(StyleDataLoaded styleDataLoaded);
}
