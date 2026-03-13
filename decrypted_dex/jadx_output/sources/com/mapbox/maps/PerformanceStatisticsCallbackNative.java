package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class PerformanceStatisticsCallbackNative implements PerformanceStatisticsCallback {
    private long peer;

    public static class PerformanceStatisticsCallbackPeerCleaner implements Runnable {
        private long peer;

        public PerformanceStatisticsCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            PerformanceStatisticsCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private PerformanceStatisticsCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new PerformanceStatisticsCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.PerformanceStatisticsCallback
    public native void run(PerformanceStatistics performanceStatistics);
}
