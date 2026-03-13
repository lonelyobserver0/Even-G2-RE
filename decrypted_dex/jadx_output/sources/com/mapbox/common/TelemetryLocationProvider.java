package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.location.DeviceLocationProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TelemetryLocationProvider {
    protected long peer;

    public static class TelemetryLocationProviderPeerCleaner implements Runnable {
        private long peer;

        public TelemetryLocationProviderPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryLocationProvider.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TelemetryLocationProvider(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native DeviceLocationProvider getDeviceLocationProvider();

    public static native void setDeviceLocationProvider(DeviceLocationProvider deviceLocationProvider);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TelemetryLocationProviderPeerCleaner(j));
    }
}
