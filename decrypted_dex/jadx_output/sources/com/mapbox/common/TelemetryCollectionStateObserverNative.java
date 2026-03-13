package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class TelemetryCollectionStateObserverNative implements TelemetryCollectionStateObserver {
    protected long peer;

    public static class TelemetryCollectionStateObserverPeerCleaner implements Runnable {
        private long peer;

        public TelemetryCollectionStateObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryCollectionStateObserverNative.cleanNativePeer(this.peer);
        }
    }

    public TelemetryCollectionStateObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TelemetryCollectionStateObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.TelemetryCollectionStateObserver
    public native void onStateChanged(TelemetryCollectionState telemetryCollectionState);
}
