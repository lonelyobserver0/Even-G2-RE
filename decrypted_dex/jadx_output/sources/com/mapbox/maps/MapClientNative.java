package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MapClientNative implements MapClient {
    protected long peer;

    public static class MapClientPeerCleaner implements Runnable {
        private long peer;

        public MapClientPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapClientNative.cleanNativePeer(this.peer);
        }
    }

    public MapClientNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MapClientPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.MapClient
    public native void scheduleRepaint();
}
