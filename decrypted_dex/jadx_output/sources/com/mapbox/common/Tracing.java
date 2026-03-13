package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class Tracing {
    protected long peer;

    public static class TracingPeerCleaner implements Runnable {
        private long peer;

        public TracingPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            Tracing.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Tracing(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native TracingBackendType getTracingBackendType();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TracingPeerCleaner(j));
    }

    public static native void setTracingBackendType(TracingBackendType tracingBackendType);
}
