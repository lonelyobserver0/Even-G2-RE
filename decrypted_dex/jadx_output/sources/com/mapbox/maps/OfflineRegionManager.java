package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class OfflineRegionManager {
    protected long peer;

    public static class OfflineRegionManagerPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionManagerPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionManager.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public OfflineRegionManager() {
        initialize();
    }

    public static native void cleanNativePeer(long j);

    private native void initialize();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new OfflineRegionManagerPeerCleaner(j));
    }

    public native void createOfflineRegion(OfflineRegionGeometryDefinition offlineRegionGeometryDefinition, OfflineRegionCreateCallback offlineRegionCreateCallback);

    public native void createOfflineRegion(OfflineRegionTilePyramidDefinition offlineRegionTilePyramidDefinition, OfflineRegionCreateCallback offlineRegionCreateCallback);

    public native void getOfflineRegions(OfflineRegionCallback offlineRegionCallback);

    public native void mergeOfflineDatabase(String str, OfflineDatabaseMergeCallback offlineDatabaseMergeCallback);

    public native void setOfflineMapboxTileCountLimit(long j);

    public OfflineRegionManager(long j) {
        setPeer(j);
    }
}
