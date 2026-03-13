package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BLEServiceFactory {
    protected long peer;

    public static class BLEServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public BLEServiceFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            BLEServiceFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public BLEServiceFactory(long j) {
        setPeer(j);
    }

    public static native BLEService bleService();

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new BLEServiceFactoryPeerCleaner(j));
    }

    public static native void setUserDefined(BLEService bLEService);
}
