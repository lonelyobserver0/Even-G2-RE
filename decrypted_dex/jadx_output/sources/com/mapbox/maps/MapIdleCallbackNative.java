package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MapIdleCallbackNative implements MapIdleCallback {
    private long peer;

    public static class MapIdleCallbackPeerCleaner implements Runnable {
        private long peer;

        public MapIdleCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapIdleCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MapIdleCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MapIdleCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.MapIdleCallback
    public native void run(MapIdle mapIdle);
}
