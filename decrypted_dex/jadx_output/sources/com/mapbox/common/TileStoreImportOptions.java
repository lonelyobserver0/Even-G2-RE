package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.geojson.Point;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TileStoreImportOptions {
    protected long peer;

    public static class TileStoreImportOptionsPeerCleaner implements Runnable {
        private long peer;

        public TileStoreImportOptionsPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileStoreImportOptions.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileStoreImportOptions(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native TileStoreImportOptions make();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TileStoreImportOptionsPeerCleaner(j));
    }

    public native List<Long> getArchiveFileDescriptors();

    public native TileStoreFilter getFilter();

    public native long getMaxImportChunkSize();

    public native Point getStartLocation();

    public native TileStoreImportOptions setArchiveFileDescriptors(List<Long> list);

    public native TileStoreImportOptions setFilter(TileStoreFilter tileStoreFilter);

    public native TileStoreImportOptions setMaxImportChunkSize(long j);

    public native TileStoreImportOptions startLocation(Point point);
}
