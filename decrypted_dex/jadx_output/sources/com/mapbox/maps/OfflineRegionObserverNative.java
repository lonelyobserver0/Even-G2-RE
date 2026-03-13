package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class OfflineRegionObserverNative implements OfflineRegionObserver {
    protected long peer;

    public static class OfflineRegionObserverPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionObserverNative.cleanNativePeer(this.peer);
        }
    }

    public OfflineRegionObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineRegionObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.OfflineRegionObserver
    public native void errorOccurred(OfflineRegionError offlineRegionError);

    @Override // com.mapbox.maps.OfflineRegionObserver
    public native void statusChanged(OfflineRegionStatus offlineRegionStatus);
}
