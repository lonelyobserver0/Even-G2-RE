package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class CustomRasterSourceTileStatusChangedCallbackNative implements CustomRasterSourceTileStatusChangedCallback {
    private long peer;

    public static class CustomRasterSourceTileStatusChangedCallbackPeerCleaner implements Runnable {
        private long peer;

        public CustomRasterSourceTileStatusChangedCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomRasterSourceTileStatusChangedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private CustomRasterSourceTileStatusChangedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CustomRasterSourceTileStatusChangedCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.CustomRasterSourceTileStatusChangedCallback
    public native void run(CanonicalTileID canonicalTileID, CustomRasterSourceTileStatus customRasterSourceTileStatus);
}
