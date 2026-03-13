package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisFacadeBuilder implements AdasisFacadeBuilderInterface {
    protected long peer;

    public static class AdasisFacadeBuilderPeerCleaner implements Runnable {
        private long peer;

        public AdasisFacadeBuilderPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdasisFacadeBuilder.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisFacadeBuilder(long j) {
        setPeer(j);
    }

    public static native AdasisFacadeHandle build(ConfigHandle configHandle, CacheHandle cacheHandle, HistoryRecorderHandle historyRecorderHandle);

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new AdasisFacadeBuilderPeerCleaner(j));
    }
}
