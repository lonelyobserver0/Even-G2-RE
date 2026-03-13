package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MapLoadingErrorCallbackNative implements MapLoadingErrorCallback {
    private long peer;

    public static class MapLoadingErrorCallbackPeerCleaner implements Runnable {
        private long peer;

        public MapLoadingErrorCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapLoadingErrorCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MapLoadingErrorCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MapLoadingErrorCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.MapLoadingErrorCallback
    public native void run(MapLoadingError mapLoadingError);
}
