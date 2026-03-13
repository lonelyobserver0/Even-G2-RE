package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MemoryMonitorInterfaceNative implements MemoryMonitorInterface {
    protected long peer;

    public static class MemoryMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        public MemoryMonitorInterfacePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public MemoryMonitorInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MemoryMonitorInterfacePeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void getMemoryMonitorStatus(MemoryMonitorObserverConfig memoryMonitorObserverConfig, MemoryMonitorStatusCallback memoryMonitorStatusCallback);

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void notifySystemMemoryWarningReceived();

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void registerObserver(MemoryMonitorObserver memoryMonitorObserver);

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void registerObserverWithConfig(MemoryMonitorObserverConfig memoryMonitorObserverConfig, MemoryMonitorObserver memoryMonitorObserver);

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void unregisterObserver(MemoryMonitorObserver memoryMonitorObserver);
}
