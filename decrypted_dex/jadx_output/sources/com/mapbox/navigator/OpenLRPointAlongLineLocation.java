package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.match.openlr.Orientation;
import com.mapbox.navigator.match.openlr.SideOfRoad;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class OpenLRPointAlongLineLocation implements OpenLRPointAlongLineLocationInterface {
    protected long peer;

    public static class OpenLRPointAlongLineLocationPeerCleaner implements Runnable {
        private long peer;

        public OpenLRPointAlongLineLocationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenLRPointAlongLineLocation.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public OpenLRPointAlongLineLocation(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new OpenLRPointAlongLineLocationPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.OpenLRPointAlongLineLocationInterface
    public native Point getCoordinate();

    @Override // com.mapbox.navigator.OpenLRPointAlongLineLocationInterface
    public native Orientation getOrientation();

    @Override // com.mapbox.navigator.OpenLRPointAlongLineLocationInterface
    public native GraphPosition getPosition();

    @Override // com.mapbox.navigator.OpenLRPointAlongLineLocationInterface
    public native SideOfRoad getSideOfRoad();
}
