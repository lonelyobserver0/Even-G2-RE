package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CacheHandle implements CacheHandleInterface {
    protected long peer;

    public static class CacheHandlePeerCleaner implements Runnable {
        private long peer;

        public CacheHandlePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            CacheHandle.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public CacheHandle(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new CacheHandlePeerCleaner(j));
    }

    @Override // com.mapbox.navigator.CacheHandleInterface
    public native Cancelable getCurrentRoadGraphVersionInfo(RoadGraphVersionInfoCallback roadGraphVersionInfoCallback);

    @Override // com.mapbox.navigator.CacheHandleInterface
    @Deprecated
    public native void getCurrentRoadGraphVersionInfo(RoadGraphVersionInfoCallback roadGraphVersionInfoCallback, Integer num);

    @Override // com.mapbox.navigator.CacheHandleInterface
    public native Cancelable isRoadGraphDataUpdateAvailable(RoadGraphUpdateAvailabilityCallback roadGraphUpdateAvailabilityCallback);
}
