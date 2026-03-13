package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class PlatformStreamFactory {
    protected long peer;

    public static class PlatformStreamFactoryPeerCleaner implements Runnable {
        private long peer;

        public PlatformStreamFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            PlatformStreamFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PlatformStreamFactory(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native ReadStream fileReadStream(String str);

    public static native ReadStream memoryReadStream(String str);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new PlatformStreamFactoryPeerCleaner(j));
    }
}
