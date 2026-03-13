package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RdWaypointArray implements RdWaypointArrayInterface {
    protected long peer;

    public static class RdWaypointArrayPeerCleaner implements Runnable {
        private long peer;

        public RdWaypointArrayPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RdWaypointArray.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdWaypointArray(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RdWaypointArrayPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.route_data.RdWaypointArrayInterface
    public native RdWaypoint get(long j);

    @Override // com.mapbox.navigator.route_data.RdWaypointArrayInterface
    public native long size();
}
