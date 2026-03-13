package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TileFunctionCallbackNative implements TileFunctionCallback {
    private long peer;

    public static class TileFunctionCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileFunctionCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileFunctionCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileFunctionCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileFunctionCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.TileFunctionCallback
    public native void run(CanonicalTileID canonicalTileID);
}
