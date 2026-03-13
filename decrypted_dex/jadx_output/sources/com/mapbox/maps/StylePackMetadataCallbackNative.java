package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class StylePackMetadataCallbackNative implements StylePackMetadataCallback {
    private long peer;

    public static class StylePackMetadataCallbackPeerCleaner implements Runnable {
        private long peer;

        public StylePackMetadataCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StylePackMetadataCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StylePackMetadataCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StylePackMetadataCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.StylePackMetadataCallback
    public native void run(Expected<StylePackError, Value> expected);
}
