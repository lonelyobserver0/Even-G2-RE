package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LogConfiguration {
    protected long peer;

    public static class LogConfigurationPeerCleaner implements Runnable {
        private long peer;

        public LogConfigurationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogConfiguration.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public LogConfiguration(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native LoggingLevel getLoggingLevel();

    public static native LoggingLevel getLoggingLevel(String str);

    public static native void registerLogWriterBackend(LogWriterBackend logWriterBackend);

    public static native void resetLoggingLevel(String str);

    public static native void setLoggingLevel(LoggingLevel loggingLevel);

    public static native void setLoggingLevel(String str, LoggingLevel loggingLevel);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new LogConfigurationPeerCleaner(j));
    }
}
