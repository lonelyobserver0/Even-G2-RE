package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MetricsSourceNative implements MetricsSource {
    protected long peer;

    public static class MetricsSourcePeerCleaner implements Runnable {
        private long peer;

        public MetricsSourcePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsSourceNative.cleanNativePeer(this.peer);
        }
    }

    public MetricsSourceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MetricsSourcePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.MetricsSource
    public native List<Metrics> getMetrics();
}
