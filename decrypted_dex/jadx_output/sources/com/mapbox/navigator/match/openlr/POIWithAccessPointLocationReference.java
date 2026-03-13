package com.mapbox.navigator.match.openlr;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class POIWithAccessPointLocationReference implements Serializable {
    private final Point coord;
    private final Orientation orientation;
    private final List<LocationReferencePoint> points;
    private final double positiveOffset;
    private final SideOfRoad sideOfRoad;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public POIWithAccessPointLocationReference(List<LocationReferencePoint> list, double d8, Point point, Orientation orientation, SideOfRoad sideOfRoad) {
        this.points = list;
        this.positiveOffset = d8;
        this.coord = point;
        this.orientation = orientation;
        this.sideOfRoad = sideOfRoad;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        POIWithAccessPointLocationReference pOIWithAccessPointLocationReference = (POIWithAccessPointLocationReference) obj;
        return Objects.equals(this.points, pOIWithAccessPointLocationReference.points) && PartialEq.compare(this.positiveOffset, pOIWithAccessPointLocationReference.positiveOffset) && Objects.equals(this.coord, pOIWithAccessPointLocationReference.coord) && Objects.equals(this.orientation, pOIWithAccessPointLocationReference.orientation) && Objects.equals(this.sideOfRoad, pOIWithAccessPointLocationReference.sideOfRoad);
    }

    public Point getCoord() {
        return this.coord;
    }

    public Orientation getOrientation() {
        return this.orientation;
    }

    public List<LocationReferencePoint> getPoints() {
        return this.points;
    }

    public double getPositiveOffset() {
        return this.positiveOffset;
    }

    public SideOfRoad getSideOfRoad() {
        return this.sideOfRoad;
    }

    public int hashCode() {
        return Objects.hash(this.points, Double.valueOf(this.positiveOffset), this.coord, this.orientation, this.sideOfRoad);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[points: ");
        b.v(", positiveOffset: ", sb2, this.points);
        b.m(this.positiveOffset, sb2, ", coord: ");
        b.q(this.coord, sb2, ", orientation: ");
        sb2.append(RecordUtils.fieldToString(this.orientation));
        sb2.append(", sideOfRoad: ");
        sb2.append(RecordUtils.fieldToString(this.sideOfRoad));
        sb2.append("]");
        return sb2.toString();
    }
}
