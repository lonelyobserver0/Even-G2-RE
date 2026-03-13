package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class CustomLayerHostNative implements CustomLayerHost {
    protected long peer;

    public static class CustomLayerHostPeerCleaner implements Runnable {
        private long peer;

        public CustomLayerHostPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomLayerHostNative.cleanNativePeer(this.peer);
        }
    }

    public CustomLayerHostNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CustomLayerHostPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.CustomLayerHost
    public native void contextLost();

    @Override // com.mapbox.maps.CustomLayerHost
    public native void deinitialize();

    @Override // com.mapbox.maps.CustomLayerHost
    public native void initialize();

    @Override // com.mapbox.maps.CustomLayerHost
    public native CustomLayerRenderConfiguration prerender(CustomLayerRenderParameters customLayerRenderParameters);

    @Override // com.mapbox.maps.CustomLayerHost
    public native void render(CustomLayerRenderParameters customLayerRenderParameters);

    @Override // com.mapbox.maps.CustomLayerHost
    public native void renderToTile(CanonicalTileID canonicalTileID);
}
