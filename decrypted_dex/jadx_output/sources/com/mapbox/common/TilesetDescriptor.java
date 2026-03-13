package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TilesetDescriptor {
    protected long peer;

    public static class TilesetDescriptorPeerCleaner implements Runnable {
        private long peer;

        public TilesetDescriptorPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TilesetDescriptor.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TilesetDescriptor(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TilesetDescriptorPeerCleaner(j));
    }

    public native void toValue(TilesetDescriptorValueCallback tilesetDescriptorValueCallback);
}
