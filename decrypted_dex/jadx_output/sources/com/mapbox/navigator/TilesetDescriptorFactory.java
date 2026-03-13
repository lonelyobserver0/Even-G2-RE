package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.TilesetDescriptor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TilesetDescriptorFactory implements TilesetDescriptorFactoryInterface {
    protected long peer;

    public static class TilesetDescriptorFactoryPeerCleaner implements Runnable {
        private long peer;

        public TilesetDescriptorFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TilesetDescriptorFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public TilesetDescriptorFactory(long j) {
        setPeer(j);
    }

    public static native TilesetDescriptor build(String str, String str2, boolean z2);

    public static native void cleanNativePeer(long j);

    public static native TilesetDescriptor getLatest(CacheHandle cacheHandle, boolean z2);

    public static native TilesetDescriptor getSpecificVersion(CacheHandle cacheHandle, String str, boolean z2);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TilesetDescriptorFactoryPeerCleaner(j));
    }
}
