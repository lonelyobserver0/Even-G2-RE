package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CoordinateBounds implements Serializable {
    private final boolean infiniteBounds;
    private final Point northeast;
    private final Point southwest;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CoordinateBounds(Point point, Point point2, boolean z2) {
        this.southwest = point;
        this.northeast = point2;
        this.infiniteBounds = z2;
    }

    public static native CoordinateBounds hull(Point point, Point point2);

    public static native CoordinateBounds singleton(Point point);

    public static native CoordinateBounds world();

    public native Point center();

    public native Point constrain(Point point);

    public native boolean contains(Point point, boolean z2);

    public native boolean contains(CoordinateBounds coordinateBounds, boolean z2);

    public native boolean containsLatitude(double d8);

    public native boolean containsLongitude(double d8);

    public native boolean crossesAntimeridian();

    public native double east();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoordinateBounds coordinateBounds = (CoordinateBounds) obj;
        return Objects.equals(this.southwest, coordinateBounds.southwest) && Objects.equals(this.northeast, coordinateBounds.northeast) && this.infiniteBounds == coordinateBounds.infiniteBounds;
    }

    public native CoordinateBounds extend(Point point);

    public native CoordinateBounds extend(CoordinateBounds coordinateBounds);

    public boolean getInfiniteBounds() {
        return this.infiniteBounds;
    }

    public Point getNortheast() {
        return this.northeast;
    }

    public Point getSouthwest() {
        return this.southwest;
    }

    public int hashCode() {
        return Objects.hash(this.southwest, this.northeast, Boolean.valueOf(this.infiniteBounds));
    }

    public native boolean intersects(CoordinateBounds coordinateBounds, boolean z2);

    public native boolean isBounded();

    public native boolean isEmpty();

    public native boolean isValid();

    public native double latitudeSpan();

    public native double longitudeSpan();

    public native double north();

    public native Point northwest();

    public native double south();

    public native Point southeast();

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[southwest: ");
        com.mapbox.common.b.q(this.southwest, sb2, ", northeast: ");
        com.mapbox.common.b.q(this.northeast, sb2, ", infiniteBounds: ");
        return com.mapbox.common.b.k(this.infiniteBounds, sb2, "]");
    }

    public native double west();

    public CoordinateBounds(Point point, Point point2) {
        this.southwest = point;
        this.northeast = point2;
        this.infiniteBounds = false;
    }
}
