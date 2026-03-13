package com.mapbox.navigator.match.openlr;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PolygonLocationReference implements Serializable {
    private final List<Point> corners;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public PolygonLocationReference(List<Point> list) {
        this.corners = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.corners, ((PolygonLocationReference) obj).corners);
    }

    public List<Point> getCorners() {
        return this.corners;
    }

    public int hashCode() {
        return Objects.hash(this.corners);
    }

    public String toString() {
        return b.i("]", new StringBuilder("[corners: "), this.corners);
    }
}
