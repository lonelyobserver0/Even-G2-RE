package com.mapbox.navigator;

import com.mapbox.geojson.Point;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface GraphAccessorInterface {
    EdgeAdasAttributes getAdasAttributes(long j);

    EdgeMetadata getEdgeMetadata(long j);

    List<Point> getEdgeShape(long j);

    List<Point> getPathShape(GraphPath graphPath);

    Point getPositionCoordinate(GraphPosition graphPosition);
}
