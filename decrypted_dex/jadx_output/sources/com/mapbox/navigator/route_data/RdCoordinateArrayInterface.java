package com.mapbox.navigator.route_data;

import com.mapbox.geojson.Point;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RdCoordinateArrayInterface {
    Point get(long j);

    List<Point> rawArray();

    long size();
}
