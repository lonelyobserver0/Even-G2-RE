package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class LogWriterBackendNative implements LogWriterBackend {
    protected long peer;

    public static class LogWriterBackendPeerCleaner implements Runnable {
        private long peer;

        public LogWriterBackendPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogWriterBackendNative.cleanNativePeer(this.peer);
        }
    }

    public LogWriterBackendNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LogWriterBackendPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.common.LogWriterBackend
    public native void writeLog(LoggingLevel loggingLevel, String str);
}
