package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CacheFactory implements CacheFactoryInterface {
    protected long peer;

    public static class CacheFactoryPeerCleaner implements Runnable {
        private long peer;

        public CacheFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            CacheFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public CacheFactory(long j) {
        setPeer(j);
    }

    public static native CacheHandle build(TilesConfig tilesConfig, ConfigHandle configHandle, HistoryRecorderHandle historyRecorderHandle, BillingProductType billingProductType);

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new CacheFactoryPeerCleaner(j));
    }
}
