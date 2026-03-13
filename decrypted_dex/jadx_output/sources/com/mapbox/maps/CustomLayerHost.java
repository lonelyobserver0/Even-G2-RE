package com.mapbox.maps;

import com.mapbox.maps.CustomLayerRenderConfiguration;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface CustomLayerHost {
    void contextLost();

    void deinitialize();

    void initialize();

    default CustomLayerRenderConfiguration prerender(CustomLayerRenderParameters customLayerRenderParameters) {
        return new CustomLayerRenderConfiguration.Builder().build();
    }

    void render(CustomLayerRenderParameters customLayerRenderParameters);

    default void renderToTile(CanonicalTileID canonicalTileID) {
    }
}
