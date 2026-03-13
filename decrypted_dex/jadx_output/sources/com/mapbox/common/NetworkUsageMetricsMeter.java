package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class NetworkUsageMetricsMeter {
    protected long peer;

    public static class NetworkUsageMetricsMeterPeerCleaner implements Runnable {
        private long peer;

        public NetworkUsageMetricsMeterPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkUsageMetricsMeter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public NetworkUsageMetricsMeter(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native void onBytesTransferred(String str, int i3, int i10);

    public static native void onHttpCodeReceived(int i3);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new NetworkUsageMetricsMeterPeerCleaner(j));
    }
}
