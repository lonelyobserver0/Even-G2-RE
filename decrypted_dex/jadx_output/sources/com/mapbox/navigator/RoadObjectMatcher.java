package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadObjectMatcher implements RoadObjectMatcherInterface {
    protected long peer;

    public static class RoadObjectMatcherPeerCleaner implements Runnable {
        private long peer;

        public RoadObjectMatcherPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RoadObjectMatcher.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadObjectMatcher(CacheHandle cacheHandle) {
        initialize(cacheHandle);
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(CacheHandle cacheHandle);

    private native void initialize(CacheHandle cacheHandle, RoadObjectMatcherConfig roadObjectMatcherConfig);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RoadObjectMatcherPeerCleaner(j));
    }

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void cancel(List<String> list);

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void cancelAll();

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void matchGantries(List<MatchableGeometry> list, MatchingOptions matchingOptions);

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void matchOpenLRs(List<MatchableOpenLr> list, MatchingOptions matchingOptions);

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void matchPoints(List<MatchablePoint> list, MatchingOptions matchingOptions);

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void matchPolygons(List<MatchableGeometry> list, MatchingOptions matchingOptions);

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void matchPolylines(List<MatchableGeometry> list, MatchingOptions matchingOptions);

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void setListener(RoadObjectMatcherListener roadObjectMatcherListener);

    public RoadObjectMatcher(CacheHandle cacheHandle, RoadObjectMatcherConfig roadObjectMatcherConfig) {
        initialize(cacheHandle, roadObjectMatcherConfig);
    }

    public RoadObjectMatcher(long j) {
        setPeer(j);
    }
}
