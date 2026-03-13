package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SchedulerFactory {
    protected long peer;

    public static class SchedulerFactoryPeerCleaner implements Runnable {
        private long peer;

        public SchedulerFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SchedulerFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SchedulerFactory(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native Scheduler createSequenced();

    public static native Scheduler createSequenced(ThreadServiceType threadServiceType);

    public static native Scheduler createSingleThreaded();

    public static native Scheduler createSingleThreaded(ThreadServiceType threadServiceType);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new SchedulerFactoryPeerCleaner(j));
    }

    public static native Scheduler threadPool();

    public static native Scheduler threadPool(ThreadServiceType threadServiceType);
}
