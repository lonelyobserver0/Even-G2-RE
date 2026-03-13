package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class BatteryMonitorInterfaceNative implements BatteryMonitorInterface {
    protected long peer;

    public static class BatteryMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        public BatteryMonitorInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            BatteryMonitorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public BatteryMonitorInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new BatteryMonitorInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.BatteryMonitorInterface
    public native void getBatteryChargingStatus(BatteryChargingStatusCallback batteryChargingStatusCallback);

    @Override // com.mapbox.common.BatteryMonitorInterface
    public native void registerObserver(BatteryMonitorObserver batteryMonitorObserver);

    @Override // com.mapbox.common.BatteryMonitorInterface
    public native void unregisterObserver(BatteryMonitorObserver batteryMonitorObserver);
}
