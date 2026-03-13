package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class CustomRasterSourceTileRendererNative implements CustomRasterSourceTileRenderer {
    protected long peer;

    public static class CustomRasterSourceTileRendererPeerCleaner implements Runnable {
        private long peer;

        public CustomRasterSourceTileRendererPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomRasterSourceTileRendererNative.cleanNativePeer(this.peer);
        }
    }

    public CustomRasterSourceTileRendererNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CustomRasterSourceTileRendererPeerCleaner(j));
    }

    public static native void cleanNativePeer(long j);

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void contextLost();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void deinitialize();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void initialize();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native boolean isTileRenderable(CanonicalTileID canonicalTileID, CustomRasterSourceTileStatus customRasterSourceTileStatus);

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void prerender(CustomLayerRenderParameters customLayerRenderParameters);

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void renderToTile(CanonicalTileID canonicalTileID);
}
