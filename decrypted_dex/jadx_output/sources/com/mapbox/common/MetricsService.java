package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MetricsService {
    protected long peer;

    public static class MetricsServicePeerCleaner implements Runnable {
        private long peer;

        public MetricsServicePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MetricsService(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MetricsServicePeerCleaner(j));
    }

    public native void addMetricsSource(MetricsSource metricsSource);

    public native void flush(FlushOperationResultCallback flushOperationResultCallback);

    public native void removeMetricsSource(MetricsSource metricsSource);

    public native void serialize(MetricsServiceSerializeCallback metricsServiceSerializeCallback);

    public native void serializePretty(MetricsServiceSerializeCallback metricsServiceSerializeCallback);

    public native void setTag(String str);

    public native void start(Long l9);

    public native void stop();

    public native void subscribeToConfigUpdates();
}
