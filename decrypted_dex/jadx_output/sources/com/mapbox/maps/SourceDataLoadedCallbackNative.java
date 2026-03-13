package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class SourceDataLoadedCallbackNative implements SourceDataLoadedCallback {
    private long peer;

    public static class SourceDataLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        public SourceDataLoadedCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SourceDataLoadedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SourceDataLoadedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SourceDataLoadedCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public native void run(SourceDataLoaded sourceDataLoaded);
}
