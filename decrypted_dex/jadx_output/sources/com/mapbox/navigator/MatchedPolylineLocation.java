package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MatchedPolylineLocation implements MatchedPolylineLocationInterface {
    protected long peer;

    public static class MatchedPolylineLocationPeerCleaner implements Runnable {
        private long peer;

        public MatchedPolylineLocationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchedPolylineLocation.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchedPolylineLocation(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MatchedPolylineLocationPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.MatchedPolylineLocationInterface
    public native MatchedPolylinePart getMatchedPart();

    @Override // com.mapbox.navigator.MatchedPolylineLocationInterface
    public native GraphPath getPath();

    @Override // com.mapbox.navigator.MatchedPolylineLocationInterface
    public native Geometry getShape();
}
