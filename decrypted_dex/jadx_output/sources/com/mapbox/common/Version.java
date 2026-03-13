package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Version {
    protected long peer;

    public static class VersionPeerCleaner implements Runnable {
        private long peer;

        public VersionPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            Version.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Version(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native String getCommonSDKRevisionString();

    public static native String getCommonSDKVersionString();

    public static native int getMajorVersion();

    public static native int getMinorVersion();

    public static native int getPatchVersion();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new VersionPeerCleaner(j));
    }
}
