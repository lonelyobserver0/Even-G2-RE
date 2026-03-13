package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LifecycleMonitorFactory {
    protected long peer;

    public static class LifecycleMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        public LifecycleMonitorFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifecycleMonitorFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public LifecycleMonitorFactory(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native LifecycleMonitorInterface getOrCreate();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new LifecycleMonitorFactoryPeerCleaner(j));
    }
}
