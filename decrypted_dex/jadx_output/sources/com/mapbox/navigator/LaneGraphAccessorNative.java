package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.geojson.Point;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class LaneGraphAccessorNative implements LaneGraphAccessor {
    protected long peer;

    public static class LaneGraphAccessorPeerCleaner implements Runnable {
        private long peer;

        public LaneGraphAccessorPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LaneGraphAccessorNative.cleanNativePeer(this.peer);
        }
    }

    public LaneGraphAccessorNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LaneGraphAccessorPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native LaneData getLaneData(long j);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native List<Point> getLaneGeometry(long j);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native LaneGroupData getLaneGroupData(long j);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native List<Point> getLaneGroupGeometry(long j);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native List<LaneWidthPoint> getLaneWidthPoints(long j);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native List<Point> getSmoothedLaneGroupGeometry(long j, double d8, String str);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native LaneGroupData getVirtualLaneGroupData(long j, String str);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native List<Point> getVirtualLaneGroupGeometry(long j, String str);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native boolean isVirtualLaneGroup(long j);
}
