package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class Log {
    protected long peer;

    public static class LogPeerCleaner implements Runnable {
        private long peer;

        public LogPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Log(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native void debug(String str, String str2);

    public static native void error(String str, String str2);

    public static native void info(String str, String str2);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new LogPeerCleaner(j));
    }

    public static native void warning(String str, String str2);
}
