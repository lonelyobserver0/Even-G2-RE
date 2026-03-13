package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MemoryMonitorObserverNative implements MemoryMonitorObserver {
    protected long peer;

    public static class MemoryMonitorObserverPeerCleaner implements Runnable {
        private long peer;

        public MemoryMonitorObserverPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorObserverNative.cleanNativePeer(this.peer);
        }
    }

    public MemoryMonitorObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MemoryMonitorObserverPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.MemoryMonitorObserver
    public native void onMemoryMonitorAlert(MemoryMonitorStatus memoryMonitorStatus);
}
