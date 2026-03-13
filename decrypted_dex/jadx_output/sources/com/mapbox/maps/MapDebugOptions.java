package com.mapbox.maps;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum MapDebugOptions {
    TILE_BORDERS,
    PARSE_STATUS,
    TIMESTAMPS,
    COLLISION,
    OVERDRAW,
    STENCIL_CLIP,
    DEPTH_BUFFER,
    MODEL_BOUNDS,
    TERRAIN_WIREFRAME,
    LAYERS2_DWIREFRAME,
    LAYERS3_DWIREFRAME,
    LIGHT;

    private int getValue() {
        return ordinal();
    }
}
