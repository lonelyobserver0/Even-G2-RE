package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MatchedGantryLocation implements MatchedGantryLocationInterface {
    protected long peer;

    public static class MatchedGantryLocationPeerCleaner implements Runnable {
        private long peer;

        public MatchedGantryLocationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchedGantryLocation.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchedGantryLocation(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MatchedGantryLocationPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.MatchedGantryLocationInterface
    public native List<Position> getPositions();

    @Override // com.mapbox.navigator.MatchedGantryLocationInterface
    public native Geometry getShape();
}
