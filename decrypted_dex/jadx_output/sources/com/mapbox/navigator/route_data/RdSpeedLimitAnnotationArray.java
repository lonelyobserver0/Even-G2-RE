package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdSpeedLimitAnnotationArray implements RdSpeedLimitAnnotationArrayInterface {
    protected long peer;

    public static class RdSpeedLimitAnnotationArrayPeerCleaner implements Runnable {
        private long peer;

        public RdSpeedLimitAnnotationArrayPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdSpeedLimitAnnotationArray.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdSpeedLimitAnnotationArray(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdSpeedLimitAnnotationArrayPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdSpeedLimitAnnotationArrayInterface
    public native RdSpeedLimitAnnotation get(long j);

    @Override // com.mapbox.navigator.route_data.RdSpeedLimitAnnotationArrayInterface
    public native long size();
}
