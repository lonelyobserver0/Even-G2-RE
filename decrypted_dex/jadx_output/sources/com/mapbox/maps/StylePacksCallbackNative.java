package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class StylePacksCallbackNative implements StylePacksCallback {
    private long peer;

    public static class StylePacksCallbackPeerCleaner implements Runnable {
        private long peer;

        public StylePacksCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StylePacksCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StylePacksCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StylePacksCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.StylePacksCallback
    public native void run(Expected<StylePackError, List<StylePack>> expected);
}
