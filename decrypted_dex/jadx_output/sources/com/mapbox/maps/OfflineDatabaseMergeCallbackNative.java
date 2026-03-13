package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class OfflineDatabaseMergeCallbackNative implements OfflineDatabaseMergeCallback {
    private long peer;

    public static class OfflineDatabaseMergeCallbackPeerCleaner implements Runnable {
        private long peer;

        public OfflineDatabaseMergeCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineDatabaseMergeCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private OfflineDatabaseMergeCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineDatabaseMergeCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.OfflineDatabaseMergeCallback
    public native void run(Expected<String, List<OfflineRegion>> expected);
}
