package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class ElectronicHorizonObserverNative implements ElectronicHorizonObserver {
    protected long peer;

    public static class ElectronicHorizonObserverPeerCleaner implements Runnable {
        private long peer;

        public ElectronicHorizonObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ElectronicHorizonObserverNative.cleanNativePeer(this.peer);
        }
    }

    public ElectronicHorizonObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ElectronicHorizonObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public native void onPositionUpdated(ElectronicHorizonPosition electronicHorizonPosition, List<RoadObjectDistance> list);

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public native void onRoadObjectEnter(RoadObjectEnterExitInfo roadObjectEnterExitInfo);

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public native void onRoadObjectExit(RoadObjectEnterExitInfo roadObjectEnterExitInfo);

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public native void onRoadObjectPassed(RoadObjectPassInfo roadObjectPassInfo);
}
