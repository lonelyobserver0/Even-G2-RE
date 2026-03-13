package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouterFactory implements RouterFactoryInterface {
    protected long peer;

    public static class RouterFactoryPeerCleaner implements Runnable {
        private long peer;

        public RouterFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouterFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouterFactory(long j) {
        setPeer(j);
    }

    public static native RouterInterface build(RouterType routerType, CacheHandle cacheHandle, ConfigHandle configHandle, HistoryRecorderHandle historyRecorderHandle);

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RouterFactoryPeerCleaner(j));
    }
}
