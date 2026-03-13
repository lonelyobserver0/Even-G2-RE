package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.HashMap;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadObjectsStore implements RoadObjectsStoreInterface {
    protected long peer;

    public static class RoadObjectsStorePeerCleaner implements Runnable {
        private long peer;

        public RoadObjectsStorePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            RoadObjectsStore.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadObjectsStore(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RoadObjectsStorePeerCleaner(j));
    }

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native void addCustomRoadObject(RoadObject roadObject);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native void addObserver(RoadObjectsStoreObserver roadObjectsStoreObserver);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native HashMap<String, RoadObjectEdgeLocation> get(long j);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native RoadObject getRoadObject(String str);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native List<String> getRoadObjectIdsByEdgeIds(List<Long> list);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native boolean hasObservers();

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native void removeAllCustomRoadObjects();

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native void removeCustomRoadObject(String str);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native void removeCustomRoadObjects(List<String> list);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native void removeObserver(RoadObjectsStoreObserver roadObjectsStoreObserver);
}
