package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CoordinateInfo implements Serializable {
    private final Point coordinate;
    private final boolean isOnSurface;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CoordinateInfo(Point point, boolean z2) {
        this.coordinate = point;
        this.isOnSurface = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CoordinateInfo.class != obj.getClass()) {
            return false;
        }
        CoordinateInfo coordinateInfo = (CoordinateInfo) obj;
        return Objects.equals(this.coordinate, coordinateInfo.coordinate) && this.isOnSurface == coordinateInfo.isOnSurface;
    }

    public Point getCoordinate() {
        return this.coordinate;
    }

    public boolean getIsOnSurface() {
        return this.isOnSurface;
    }

    public int hashCode() {
        return Objects.hash(this.coordinate, Boolean.valueOf(this.isOnSurface));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[coordinate: ");
        com.mapbox.common.b.q(this.coordinate, sb2, ", isOnSurface: ");
        return com.mapbox.common.b.k(this.isOnSurface, sb2, "]");
    }
}
