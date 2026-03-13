package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Geometry;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface TileRegionGeometryCallback {
    void run(Expected<TileRegionError, Geometry> expected);
}
