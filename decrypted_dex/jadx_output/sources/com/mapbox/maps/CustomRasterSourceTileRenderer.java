package com.mapbox.maps;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface CustomRasterSourceTileRenderer {
    void contextLost();

    void deinitialize();

    void initialize();

    boolean isTileRenderable(CanonicalTileID canonicalTileID, CustomRasterSourceTileStatus customRasterSourceTileStatus);

    void prerender(CustomLayerRenderParameters customLayerRenderParameters);

    void renderToTile(CanonicalTileID canonicalTileID);
}
