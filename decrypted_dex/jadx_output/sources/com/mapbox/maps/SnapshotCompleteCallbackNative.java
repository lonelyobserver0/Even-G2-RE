package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class SnapshotCompleteCallbackNative implements SnapshotCompleteCallback {
    private long peer;

    public static class SnapshotCompleteCallbackPeerCleaner implements Runnable {
        private long peer;

        public SnapshotCompleteCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SnapshotCompleteCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SnapshotCompleteCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SnapshotCompleteCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.SnapshotCompleteCallback
    public native void run(Expected<String, MapSnapshot> expected);
}
