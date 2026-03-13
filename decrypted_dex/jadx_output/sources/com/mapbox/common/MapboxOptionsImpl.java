package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxOptionsImpl {
    protected long peer;

    public static class MapboxOptionsImplPeerCleaner implements Runnable {
        private long peer;

        public MapboxOptionsImplPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapboxOptionsImpl.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MapboxOptionsImpl(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native String getAccessToken();

    public static native String getTokenForService(String str);

    public static native boolean getUseStaging(String str);

    public static native void setAccessToken(String str);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapboxOptionsImplPeerCleaner(j));
    }

    public static native void setStagingAccessToken(String str);

    public static native void setTokenForService(String str, String str2);

    public static native void setUseStaging(String str, boolean z2);
}
