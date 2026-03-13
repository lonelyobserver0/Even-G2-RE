package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import java.util.HashMap;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class MatchedSubgraphLocation implements MatchedSubgraphLocationInterface {
    protected long peer;

    public static class MatchedSubgraphLocationPeerCleaner implements Runnable {
        private long peer;

        public MatchedSubgraphLocationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchedSubgraphLocation.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchedSubgraphLocation(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MatchedSubgraphLocationPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.MatchedSubgraphLocationInterface
    public native HashMap<Long, SubgraphEdge> getEdges();

    @Override // com.mapbox.navigator.MatchedSubgraphLocationInterface
    public native List<Position> getEnters();

    @Override // com.mapbox.navigator.MatchedSubgraphLocationInterface
    public native List<Position> getExits();

    @Override // com.mapbox.navigator.MatchedSubgraphLocationInterface
    public native Geometry getShape();
}
