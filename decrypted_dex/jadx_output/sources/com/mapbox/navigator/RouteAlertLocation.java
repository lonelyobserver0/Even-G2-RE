package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteAlertLocation implements RouteAlertLocationInterface {
    protected long peer;

    public static class RouteAlertLocationPeerCleaner implements Runnable {
        private long peer;

        public RouteAlertLocationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RouteAlertLocation.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteAlertLocation(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RouteAlertLocationPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.RouteAlertLocationInterface
    public native Geometry getShape();
}
