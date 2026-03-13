package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class SourceRemovedCallbackNative implements SourceRemovedCallback {
    private long peer;

    public static class SourceRemovedCallbackPeerCleaner implements Runnable {
        private long peer;

        public SourceRemovedCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SourceRemovedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SourceRemovedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SourceRemovedCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.SourceRemovedCallback
    public native void run(SourceRemoved sourceRemoved);
}
