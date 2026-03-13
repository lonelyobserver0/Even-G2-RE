package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MemoryMonitorStatusCallbackNative implements MemoryMonitorStatusCallback {
    private long peer;

    public static class MemoryMonitorStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public MemoryMonitorStatusCallbackPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MemoryMonitorStatusCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MemoryMonitorStatusCallbackPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.MemoryMonitorStatusCallback
    public native void run(Expected<String, MemoryMonitorStatus> expected);
}
