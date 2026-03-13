package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MatchedPolygonLocation implements MatchedPolygonLocationInterface {
    protected long peer;

    public static class MatchedPolygonLocationPeerCleaner implements Runnable {
        private long peer;

        public MatchedPolygonLocationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchedPolygonLocation.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchedPolygonLocation(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MatchedPolygonLocationPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.MatchedPolygonLocationInterface
    public native List<Position> getEntries();

    @Override // com.mapbox.navigator.MatchedPolygonLocationInterface
    public native List<Position> getExits();

    @Override // com.mapbox.navigator.MatchedPolygonLocationInterface
    public native Geometry getShape();
}
