package com.mapbox.navigator.match.openlr;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class GeoCoordinateLocationReference implements Serializable {
    private final Point coordinate;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GeoCoordinateLocationReference(Point point) {
        this.coordinate = point;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.coordinate, ((GeoCoordinateLocationReference) obj).coordinate);
    }

    public Point getCoordinate() {
        return this.coordinate;
    }

    public int hashCode() {
        return Objects.hash(this.coordinate);
    }

    public String toString() {
        return "[coordinate: " + RecordUtils.fieldToString(this.coordinate) + "]";
    }
}
