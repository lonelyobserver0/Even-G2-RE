package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface BatteryMonitorInterface {
    void getBatteryChargingStatus(BatteryChargingStatusCallback batteryChargingStatusCallback);

    void registerObserver(BatteryMonitorObserver batteryMonitorObserver);

    void unregisterObserver(BatteryMonitorObserver batteryMonitorObserver);
}
