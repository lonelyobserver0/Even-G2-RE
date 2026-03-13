package com.mapbox.navigator;

import com.mapbox.geojson.Geometry;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface MatchedPolylineLocationInterface {
    MatchedPolylinePart getMatchedPart();

    GraphPath getPath();

    Geometry getShape();
}
