package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdRouteAnnotation implements RdRouteAnnotationInterface {
    protected long peer;

    public static class RdRouteAnnotationPeerCleaner implements Runnable {
        private long peer;

        public RdRouteAnnotationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdRouteAnnotation.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdRouteAnnotation(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdRouteAnnotationPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdRouteAnnotationInterface
    public native List<RdLegAnnotation> legAnnotations();
}
