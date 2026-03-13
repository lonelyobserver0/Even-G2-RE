package com.mapbox.navigator.match.openlr;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class LocationReference {
    private Type type;
    private Object value;

    public enum Type {
        LINE_LOCATION_REFERENCE,
        POINT_ALONG_LINE_LOCATION_REFERENCE,
        POIWITH_ACCESS_POINT_LOCATION_REFERENCE,
        CIRCLE_LOCATION_REFERENCE,
        RECTANGLE_LOCATION_REFERENCE,
        GRID_LOCATION_REFERENCE,
        POLYGON_LOCATION_REFERENCE,
        CLOSED_LINE_LOCATION_REFERENCE,
        GEO_COORDINATE_LOCATION_REFERENCE
    }

    public LocationReference(LineLocationReference lineLocationReference) {
        this.type = Type.LINE_LOCATION_REFERENCE;
        this.value = lineLocationReference;
    }

    public static LocationReference valueOf(LineLocationReference lineLocationReference) {
        return new LocationReference(lineLocationReference);
    }

    public CircleLocationReference getCircleLocationReference() {
        if (isCircleLocationReference()) {
            return (CircleLocationReference) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15611));
    }

    public ClosedLineLocationReference getClosedLineLocationReference() {
        if (isClosedLineLocationReference()) {
            return (ClosedLineLocationReference) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15612));
    }

    public GeoCoordinateLocationReference getGeoCoordinateLocationReference() {
        if (isGeoCoordinateLocationReference()) {
            return (GeoCoordinateLocationReference) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15613));
    }

    public GridLocationReference getGridLocationReference() {
        if (isGridLocationReference()) {
            return (GridLocationReference) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15614));
    }

    public LineLocationReference getLineLocationReference() {
        if (isLineLocationReference()) {
            return (LineLocationReference) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15615));
    }

    public POIWithAccessPointLocationReference getPOIWithAccessPointLocationReference() {
        if (isPOIWithAccessPointLocationReference()) {
            return (POIWithAccessPointLocationReference) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15616));
    }

    public PointAlongLineLocationReference getPointAlongLineLocationReference() {
        if (isPointAlongLineLocationReference()) {
            return (PointAlongLineLocationReference) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15617));
    }

    public PolygonLocationReference getPolygonLocationReference() {
        if (isPolygonLocationReference()) {
            return (PolygonLocationReference) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15618));
    }

    public RectangleLocationReference getRectangleLocationReference() {
        if (isRectangleLocationReference()) {
            return (RectangleLocationReference) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15619));
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isCircleLocationReference() {
        return this.type == Type.CIRCLE_LOCATION_REFERENCE;
    }

    public boolean isClosedLineLocationReference() {
        return this.type == Type.CLOSED_LINE_LOCATION_REFERENCE;
    }

    public boolean isGeoCoordinateLocationReference() {
        return this.type == Type.GEO_COORDINATE_LOCATION_REFERENCE;
    }

    public boolean isGridLocationReference() {
        return this.type == Type.GRID_LOCATION_REFERENCE;
    }

    public boolean isLineLocationReference() {
        return this.type == Type.LINE_LOCATION_REFERENCE;
    }

    public boolean isPOIWithAccessPointLocationReference() {
        return this.type == Type.POIWITH_ACCESS_POINT_LOCATION_REFERENCE;
    }

    public boolean isPointAlongLineLocationReference() {
        return this.type == Type.POINT_ALONG_LINE_LOCATION_REFERENCE;
    }

    public boolean isPolygonLocationReference() {
        return this.type == Type.POLYGON_LOCATION_REFERENCE;
    }

    public boolean isRectangleLocationReference() {
        return this.type == Type.RECTANGLE_LOCATION_REFERENCE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static LocationReference valueOf(PointAlongLineLocationReference pointAlongLineLocationReference) {
        return new LocationReference(pointAlongLineLocationReference);
    }

    public static LocationReference valueOf(POIWithAccessPointLocationReference pOIWithAccessPointLocationReference) {
        return new LocationReference(pOIWithAccessPointLocationReference);
    }

    public LocationReference(PointAlongLineLocationReference pointAlongLineLocationReference) {
        this.type = Type.POINT_ALONG_LINE_LOCATION_REFERENCE;
        this.value = pointAlongLineLocationReference;
    }

    public static LocationReference valueOf(CircleLocationReference circleLocationReference) {
        return new LocationReference(circleLocationReference);
    }

    public static LocationReference valueOf(RectangleLocationReference rectangleLocationReference) {
        return new LocationReference(rectangleLocationReference);
    }

    public static LocationReference valueOf(GridLocationReference gridLocationReference) {
        return new LocationReference(gridLocationReference);
    }

    public LocationReference(POIWithAccessPointLocationReference pOIWithAccessPointLocationReference) {
        this.type = Type.POIWITH_ACCESS_POINT_LOCATION_REFERENCE;
        this.value = pOIWithAccessPointLocationReference;
    }

    public static LocationReference valueOf(PolygonLocationReference polygonLocationReference) {
        return new LocationReference(polygonLocationReference);
    }

    public static LocationReference valueOf(ClosedLineLocationReference closedLineLocationReference) {
        return new LocationReference(closedLineLocationReference);
    }

    public static LocationReference valueOf(GeoCoordinateLocationReference geoCoordinateLocationReference) {
        return new LocationReference(geoCoordinateLocationReference);
    }

    public LocationReference(CircleLocationReference circleLocationReference) {
        this.type = Type.CIRCLE_LOCATION_REFERENCE;
        this.value = circleLocationReference;
    }

    public LocationReference(RectangleLocationReference rectangleLocationReference) {
        this.type = Type.RECTANGLE_LOCATION_REFERENCE;
        this.value = rectangleLocationReference;
    }

    public LocationReference(GridLocationReference gridLocationReference) {
        this.type = Type.GRID_LOCATION_REFERENCE;
        this.value = gridLocationReference;
    }

    public LocationReference(PolygonLocationReference polygonLocationReference) {
        this.type = Type.POLYGON_LOCATION_REFERENCE;
        this.value = polygonLocationReference;
    }

    public LocationReference(ClosedLineLocationReference closedLineLocationReference) {
        this.type = Type.CLOSED_LINE_LOCATION_REFERENCE;
        this.value = closedLineLocationReference;
    }

    public LocationReference(GeoCoordinateLocationReference geoCoordinateLocationReference) {
        this.type = Type.GEO_COORDINATE_LOCATION_REFERENCE;
        this.value = geoCoordinateLocationReference;
    }
}
