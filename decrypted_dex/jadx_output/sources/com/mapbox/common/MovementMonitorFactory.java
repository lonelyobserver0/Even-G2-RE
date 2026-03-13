package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MovementMonitorFactory {
    protected long peer;

    public static class MovementMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        public MovementMonitorFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MovementMonitorFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MovementMonitorFactory(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native MovementMonitorInterface getOrCreate();

    public static native void reset();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MovementMonitorFactoryPeerCleaner(j));
    }

    public static native void setUserDefined(MovementMonitorInterface movementMonitorInterface);
}
