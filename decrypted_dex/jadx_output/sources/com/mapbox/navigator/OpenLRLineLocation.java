package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class OpenLRLineLocation implements OpenLRLineLocationInterface {
    protected long peer;

    public static class OpenLRLineLocationPeerCleaner implements Runnable {
        private long peer;

        public OpenLRLineLocationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenLRLineLocation.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public OpenLRLineLocation(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new OpenLRLineLocationPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.OpenLRLineLocationInterface
    public native GraphPath getPath();

    @Override // com.mapbox.navigator.OpenLRLineLocationInterface
    public native Geometry getShape();
}
