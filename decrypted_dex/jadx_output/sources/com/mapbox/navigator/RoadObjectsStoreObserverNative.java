package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
final class RoadObjectsStoreObserverNative implements RoadObjectsStoreObserver {
    protected long peer;

    public static class RoadObjectsStoreObserverPeerCleaner implements Runnable {
        private long peer;

        public RoadObjectsStoreObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RoadObjectsStoreObserverNative.cleanNativePeer(this.peer);
        }
    }

    public RoadObjectsStoreObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RoadObjectsStoreObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public native void onRoadObjectAdded(String str);

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public native void onRoadObjectRemoved(String str);

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public native void onRoadObjectUpdated(String str);
}
