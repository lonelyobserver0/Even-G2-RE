package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class SensorsServiceFactory implements SensorsServiceFactoryInterface {
    protected long peer;

    public static class SensorsServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public SensorsServiceFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SensorsServiceFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SensorsServiceFactory(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native SensorsService sensorsService();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new SensorsServiceFactoryPeerCleaner(j));
    }
}
