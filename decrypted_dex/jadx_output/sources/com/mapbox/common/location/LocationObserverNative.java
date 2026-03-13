package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class LocationObserverNative implements LocationObserver {
    protected long peer;

    public static class LocationObserverPeerCleaner implements Runnable {
        private long peer;

        public LocationObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationObserverNative.cleanNativePeer(this.peer);
        }
    }

    public LocationObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LocationObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.location.LocationObserver
    public native void onLocationUpdateReceived(List<Location> list);
}
