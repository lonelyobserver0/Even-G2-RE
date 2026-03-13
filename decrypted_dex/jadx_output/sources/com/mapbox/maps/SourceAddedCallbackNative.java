package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class SourceAddedCallbackNative implements SourceAddedCallback {
    private long peer;

    public static class SourceAddedCallbackPeerCleaner implements Runnable {
        private long peer;

        public SourceAddedCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SourceAddedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SourceAddedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SourceAddedCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.SourceAddedCallback
    public native void run(SourceAdded sourceAdded);
}
