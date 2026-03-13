package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class BatteryChargingStatusCallbackNative implements BatteryChargingStatusCallback {
    private long peer;

    public static class BatteryChargingStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public BatteryChargingStatusCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            BatteryChargingStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private BatteryChargingStatusCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new BatteryChargingStatusCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.BatteryChargingStatusCallback
    public native void run(Expected<String, Boolean> expected);
}
