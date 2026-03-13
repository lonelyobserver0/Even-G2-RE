package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Geometry;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface TileStoreObserver {
    void onRegionGeometryChanged(String str, Geometry geometry);

    void onRegionLoadFinished(String str, Expected<TileRegionError, TileRegion> expected);

    void onRegionLoadProgress(String str, TileRegionLoadProgress tileRegionLoadProgress);

    void onRegionMetadataChanged(String str, Value value);

    void onRegionRemoved(String str);
}
