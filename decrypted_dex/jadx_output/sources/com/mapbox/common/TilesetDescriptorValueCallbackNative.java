package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TilesetDescriptorValueCallbackNative implements TilesetDescriptorValueCallback {
    private long peer;

    public static class TilesetDescriptorValueCallbackPeerCleaner implements Runnable {
        private long peer;

        public TilesetDescriptorValueCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TilesetDescriptorValueCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TilesetDescriptorValueCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TilesetDescriptorValueCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TilesetDescriptorValueCallback
    public native void run(Expected<String, Value> expected);
}
