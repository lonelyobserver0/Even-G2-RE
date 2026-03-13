package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdLegAnnotation implements RdLegAnnotationInterface {
    protected long peer;

    public static class RdLegAnnotationPeerCleaner implements Runnable {
        private long peer;

        public RdLegAnnotationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdLegAnnotation.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdLegAnnotation(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdLegAnnotationPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdLegAnnotationInterface
    public native RdAnnotation annotation();

    @Override // com.mapbox.navigator.route_data.RdLegAnnotationInterface
    public native RdLegClosureArray closures();
}
