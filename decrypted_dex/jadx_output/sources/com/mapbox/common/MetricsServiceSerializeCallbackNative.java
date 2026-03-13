package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MetricsServiceSerializeCallbackNative implements MetricsServiceSerializeCallback {
    private long peer;

    public static class MetricsServiceSerializeCallbackPeerCleaner implements Runnable {
        private long peer;

        public MetricsServiceSerializeCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsServiceSerializeCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MetricsServiceSerializeCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MetricsServiceSerializeCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.MetricsServiceSerializeCallback
    public native void run(Value value);
}
