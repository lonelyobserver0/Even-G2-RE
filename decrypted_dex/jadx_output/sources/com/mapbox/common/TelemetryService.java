package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TelemetryService {
    protected long peer;

    public static class TelemetryServicePeerCleaner implements Runnable {
        private long peer;

        public TelemetryServicePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TelemetryService(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native TelemetryService getOrCreate();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TelemetryServicePeerCleaner(j));
    }

    public native void flush(FlushOperationResultCallback flushOperationResultCallback);
}
