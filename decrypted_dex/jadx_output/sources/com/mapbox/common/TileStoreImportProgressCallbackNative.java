package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TileStoreImportProgressCallbackNative implements TileStoreImportProgressCallback {
    private long peer;

    public static class TileStoreImportProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileStoreImportProgressCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileStoreImportProgressCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileStoreImportProgressCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileStoreImportProgressCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TileStoreImportProgressCallback
    public native void run(TileStoreImportProgress tileStoreImportProgress);
}
