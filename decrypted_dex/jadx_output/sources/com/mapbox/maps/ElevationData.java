package com.mapbox.maps;

import com.mapbox.geojson.Point;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface ElevationData {
    Double getElevation(Point point);

    double getTerrainExaggeration();
}
