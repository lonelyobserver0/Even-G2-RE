package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class IMUServiceFactory {
    protected long peer;

    public static class IMUServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public IMUServiceFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IMUServiceFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public IMUServiceFactory(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native IMUService imuService();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new IMUServiceFactoryPeerCleaner(j));
    }

    public static native void setUserDefined(IMUService iMUService);
}
