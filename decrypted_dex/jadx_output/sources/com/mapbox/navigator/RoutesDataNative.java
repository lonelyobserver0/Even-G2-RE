package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RoutesDataNative implements RoutesData {
    protected long peer;

    public static class RoutesDataPeerCleaner implements Runnable {
        private long peer;

        public RoutesDataPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RoutesDataNative.cleanNativePeer(this.peer);
        }
    }

    public RoutesDataNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RoutesDataPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RoutesData
    public native List<RouteAlternative> alternativeRoutes();

    @Override // com.mapbox.navigator.RoutesData
    public native RouteInterface primaryRoute();
}
