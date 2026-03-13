package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteIntersection implements Serializable {
    private final int geometryIndex;
    private final int legIndex;
    private final Point location;
    private final int segmentIndex;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteIntersection(Point point, int i3, int i10, int i11) {
        this.location = point;
        this.geometryIndex = i3;
        this.segmentIndex = i10;
        this.legIndex = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteIntersection routeIntersection = (RouteIntersection) obj;
        return Objects.equals(this.location, routeIntersection.location) && this.geometryIndex == routeIntersection.geometryIndex && this.segmentIndex == routeIntersection.segmentIndex && this.legIndex == routeIntersection.legIndex;
    }

    public int getGeometryIndex() {
        return this.geometryIndex;
    }

    public int getLegIndex() {
        return this.legIndex;
    }

    public Point getLocation() {
        return this.location;
    }

    public int getSegmentIndex() {
        return this.segmentIndex;
    }

    public int hashCode() {
        return Objects.hash(this.location, Integer.valueOf(this.geometryIndex), Integer.valueOf(this.segmentIndex), Integer.valueOf(this.legIndex));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[location: ");
        b.q(this.location, sb2, ", geometryIndex: ");
        b.o(this.geometryIndex, ", segmentIndex: ", sb2);
        b.o(this.segmentIndex, ", legIndex: ", sb2);
        return b.g(this.legIndex, "]", sb2);
    }
}
