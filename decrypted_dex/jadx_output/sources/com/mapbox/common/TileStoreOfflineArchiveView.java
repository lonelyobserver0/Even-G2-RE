package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.HashMap;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TileStoreOfflineArchiveView {
    protected long peer;

    public static class TileStoreOfflineArchiveViewPeerCleaner implements Runnable {
        private long peer;

        public TileStoreOfflineArchiveViewPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileStoreOfflineArchiveView.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileStoreOfflineArchiveView(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native Expected<TileStoreImportError, TileStoreOfflineArchiveView> make(List<Long> list);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TileStoreOfflineArchiveViewPeerCleaner(j));
    }

    public native HashMap<String, TileRegion> getRegions();

    public native long getRequiredResourceBytes();

    public native long getRequiredResourceCount();

    public native List<String> getStylePackURIs();
}
