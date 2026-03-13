package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TileStoreImportCompleteCallbackNative implements TileStoreImportCompleteCallback {
    private long peer;

    public static class TileStoreImportCompleteCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileStoreImportCompleteCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileStoreImportCompleteCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileStoreImportCompleteCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileStoreImportCompleteCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TileStoreImportCompleteCallback
    public native void run(Expected<TileStoreImportError, None> expected);
}
