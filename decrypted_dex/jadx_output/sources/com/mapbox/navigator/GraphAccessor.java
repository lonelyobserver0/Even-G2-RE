package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GraphAccessor implements GraphAccessorInterface {
    protected long peer;

    public static class GraphAccessorPeerCleaner implements Runnable {
        private long peer;

        public GraphAccessorPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            GraphAccessor.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GraphAccessor(CacheHandle cacheHandle) {
        initialize(cacheHandle);
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(CacheHandle cacheHandle);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new GraphAccessorPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.GraphAccessorInterface
    public native EdgeAdasAttributes getAdasAttributes(long j);

    @Override // com.mapbox.navigator.GraphAccessorInterface
    public native EdgeMetadata getEdgeMetadata(long j);

    @Override // com.mapbox.navigator.GraphAccessorInterface
    public native List<Point> getEdgeShape(long j);

    @Override // com.mapbox.navigator.GraphAccessorInterface
    public native List<Point> getPathShape(GraphPath graphPath);

    @Override // com.mapbox.navigator.GraphAccessorInterface
    public native Point getPositionCoordinate(GraphPosition graphPosition);

    public GraphAccessor(long j) {
        setPeer(j);
    }
}
