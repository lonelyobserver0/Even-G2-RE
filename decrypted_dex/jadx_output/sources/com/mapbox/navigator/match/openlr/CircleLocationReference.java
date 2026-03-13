package com.mapbox.navigator.match.openlr;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class CircleLocationReference implements Serializable {
    private final Point coord;
    private final int radiusMeters;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public CircleLocationReference(Point point, int i3) {
        this.coord = point;
        this.radiusMeters = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CircleLocationReference circleLocationReference = (CircleLocationReference) obj;
        return Objects.equals(this.coord, circleLocationReference.coord) && this.radiusMeters == circleLocationReference.radiusMeters;
    }

    public Point getCoord() {
        return this.coord;
    }

    public int getRadiusMeters() {
        return this.radiusMeters;
    }

    public int hashCode() {
        return Objects.hash(this.coord, Integer.valueOf(this.radiusMeters));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[coord: ");
        b.q(this.coord, sb2, ", radiusMeters: ");
        return b.g(this.radiusMeters, "]", sb2);
    }
}
