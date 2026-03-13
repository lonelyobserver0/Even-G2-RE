package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TileStoreFilter {
    protected long peer;

    public static class TileStoreFilterPeerCleaner implements Runnable {
        private long peer;

        public TileStoreFilterPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileStoreFilter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileStoreFilter(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native TileStoreFilter make();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TileStoreFilterPeerCleaner(j));
    }

    public native TileStoreFilter byDomain(TileDataDomain tileDataDomain);

    public native TileStoreFilter byStylePack(String str);

    public native TileStoreFilter byTileDataset(String str);

    public native TileStoreFilter byTileRegion(String str);

    public native TileStoreFilter byTileVersion(String str);

    public native TileStoreFilter excludeResources();

    public native TileStoreFilter excludeTiles();
}
