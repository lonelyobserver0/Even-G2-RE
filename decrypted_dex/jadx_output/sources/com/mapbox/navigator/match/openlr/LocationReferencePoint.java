package com.mapbox.navigator.match.openlr;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.FormOfWay;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class LocationReferencePoint implements Serializable {
    private final int bearing;
    private final Point coord;
    private final int distanceToNextPoint;
    private final FormOfWay formOfWay;
    private final OpenLRFunctionalRoadClass functionalRoadClass;
    private final OpenLRFunctionalRoadClass lowestFunctionRoadClassToNextPoint;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LocationReferencePoint(Point point, OpenLRFunctionalRoadClass openLRFunctionalRoadClass, FormOfWay formOfWay, int i3, OpenLRFunctionalRoadClass openLRFunctionalRoadClass2, int i10) {
        this.coord = point;
        this.functionalRoadClass = openLRFunctionalRoadClass;
        this.formOfWay = formOfWay;
        this.bearing = i3;
        this.lowestFunctionRoadClassToNextPoint = openLRFunctionalRoadClass2;
        this.distanceToNextPoint = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationReferencePoint locationReferencePoint = (LocationReferencePoint) obj;
        return Objects.equals(this.coord, locationReferencePoint.coord) && Objects.equals(this.functionalRoadClass, locationReferencePoint.functionalRoadClass) && Objects.equals(this.formOfWay, locationReferencePoint.formOfWay) && this.bearing == locationReferencePoint.bearing && Objects.equals(this.lowestFunctionRoadClassToNextPoint, locationReferencePoint.lowestFunctionRoadClassToNextPoint) && this.distanceToNextPoint == locationReferencePoint.distanceToNextPoint;
    }

    public int getBearing() {
        return this.bearing;
    }

    public Point getCoord() {
        return this.coord;
    }

    public int getDistanceToNextPoint() {
        return this.distanceToNextPoint;
    }

    public FormOfWay getFormOfWay() {
        return this.formOfWay;
    }

    public OpenLRFunctionalRoadClass getFunctionalRoadClass() {
        return this.functionalRoadClass;
    }

    public OpenLRFunctionalRoadClass getLowestFunctionRoadClassToNextPoint() {
        return this.lowestFunctionRoadClassToNextPoint;
    }

    public int hashCode() {
        return Objects.hash(this.coord, this.functionalRoadClass, this.formOfWay, Integer.valueOf(this.bearing), this.lowestFunctionRoadClassToNextPoint, Integer.valueOf(this.distanceToNextPoint));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[coord: ");
        b.q(this.coord, sb2, ", functionalRoadClass: ");
        sb2.append(RecordUtils.fieldToString(this.functionalRoadClass));
        sb2.append(", formOfWay: ");
        sb2.append(RecordUtils.fieldToString(this.formOfWay));
        sb2.append(", bearing: ");
        b.o(this.bearing, ", lowestFunctionRoadClassToNextPoint: ", sb2);
        sb2.append(RecordUtils.fieldToString(this.lowestFunctionRoadClassToNextPoint));
        sb2.append(", distanceToNextPoint: ");
        return b.g(this.distanceToNextPoint, "]", sb2);
    }
}
