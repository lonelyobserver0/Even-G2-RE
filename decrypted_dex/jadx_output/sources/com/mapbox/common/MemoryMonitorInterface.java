package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface MemoryMonitorInterface {
    void getMemoryMonitorStatus(MemoryMonitorObserverConfig memoryMonitorObserverConfig, MemoryMonitorStatusCallback memoryMonitorStatusCallback);

    void notifySystemMemoryWarningReceived();

    void registerObserver(MemoryMonitorObserver memoryMonitorObserver);

    void registerObserverWithConfig(MemoryMonitorObserverConfig memoryMonitorObserverConfig, MemoryMonitorObserver memoryMonitorObserver);

    void unregisterObserver(MemoryMonitorObserver memoryMonitorObserver);
}
