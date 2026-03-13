package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BatteryMonitorFactory {
    protected long peer;

    public static class BatteryMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        public BatteryMonitorFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            BatteryMonitorFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public BatteryMonitorFactory(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native BatteryMonitorInterface getOrCreate();

    public static native void reset();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new BatteryMonitorFactoryPeerCleaner(j));
    }

    public static native void setUserDefined(BatteryMonitorInterface batteryMonitorInterface);
}
