package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapSnapshot {
    protected long peer;

    public static class MapSnapshotPeerCleaner implements Runnable {
        private long peer;

        public MapSnapshotPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapSnapshot.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapSnapshot(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapSnapshotPeerCleaner(j));
    }

    public native List<String> attributions();

    public native Point coordinate(ScreenCoordinate screenCoordinate);

    public native Image moveImage();

    public native ScreenCoordinate screenCoordinate(Point point);
}
