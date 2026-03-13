package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FeatureTelemetryCounter {
    protected long peer;

    public static class FeatureTelemetryCounterPeerCleaner implements Runnable {
        private long peer;

        public FeatureTelemetryCounterPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            FeatureTelemetryCounter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public FeatureTelemetryCounter(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native FeatureTelemetryCounter create(String str);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new FeatureTelemetryCounterPeerCleaner(j));
    }

    public native String getName();

    public native int getValue();

    public native void increment();

    public native void reset();
}
