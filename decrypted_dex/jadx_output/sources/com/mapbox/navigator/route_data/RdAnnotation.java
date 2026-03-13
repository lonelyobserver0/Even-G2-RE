package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdAnnotation implements RdAnnotationInterface {
    protected long peer;

    public static class RdAnnotationPeerCleaner implements Runnable {
        private long peer;

        public RdAnnotationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdAnnotation.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdAnnotation(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdAnnotationPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdAnnotationInterface
    public native RdCongestionLevelArray congestion();

    @Override // com.mapbox.navigator.route_data.RdAnnotationInterface
    public native RdU32OptionalArray congestionNumeric();

    @Override // com.mapbox.navigator.route_data.RdAnnotationInterface
    public native RdF64Array distance();

    @Override // com.mapbox.navigator.route_data.RdAnnotationInterface
    public native RdF64Array duration();

    @Override // com.mapbox.navigator.route_data.RdAnnotationInterface
    public native RdSpeedLimitAnnotationArray maxspeed();

    @Override // com.mapbox.navigator.route_data.RdAnnotationInterface
    public native RdF64Array speed();
}
