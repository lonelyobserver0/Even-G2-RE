package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MapLoadedCallbackNative implements MapLoadedCallback {
    private long peer;

    public static class MapLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        public MapLoadedCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapLoadedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MapLoadedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MapLoadedCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.MapLoadedCallback
    public native void run(MapLoaded mapLoaded);
}
