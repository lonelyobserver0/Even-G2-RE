package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class MapSnapshotter extends CameraManager {

    public static class MapSnapshotterPeerCleaner implements Runnable {
        private long peer;

        public MapSnapshotterPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapSnapshotter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapSnapshotter(MapSnapshotOptions mapSnapshotOptions) {
        super(0L);
        initialize(mapSnapshotOptions);
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(MapSnapshotOptions mapSnapshotOptions);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapSnapshotterPeerCleaner(j));
    }

    public native void cancel();

    public native Double getElevation(Point point);

    public native Size getSize();

    public native void reduceMemoryUse();

    public native void setSize(Size size);

    public native void start(SnapshotCompleteCallback snapshotCompleteCallback);

    public MapSnapshotter(long j) {
        super(0L);
        setPeer(j);
    }
}
