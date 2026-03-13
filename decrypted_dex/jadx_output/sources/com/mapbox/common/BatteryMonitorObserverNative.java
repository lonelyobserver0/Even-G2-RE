package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class BatteryMonitorObserverNative implements BatteryMonitorObserver {
    protected long peer;

    public static class BatteryMonitorObserverPeerCleaner implements Runnable {
        private long peer;

        public BatteryMonitorObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            BatteryMonitorObserverNative.cleanNativePeer(this.peer);
        }
    }

    public BatteryMonitorObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new BatteryMonitorObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.BatteryMonitorObserver
    public native void onBatteryChargingStatusChanged(boolean z2);

    @Override // com.mapbox.common.BatteryMonitorObserver
    public native void onBatteryStatusError(String str);
}
