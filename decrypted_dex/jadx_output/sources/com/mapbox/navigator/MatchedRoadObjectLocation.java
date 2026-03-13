package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MatchedRoadObjectLocation {
    private Type type;
    private Object value;

    public enum Type {
        OPEN_LRLINE_LOCATION,
        OPEN_LRPOINT_ALONG_LINE_LOCATION,
        MATCHED_POLYLINE_LOCATION,
        MATCHED_GANTRY_LOCATION,
        MATCHED_POLYGON_LOCATION,
        MATCHED_POINT_LOCATION,
        MATCHED_SUBGRAPH_LOCATION,
        ROUTE_ALERT_LOCATION
    }

    public MatchedRoadObjectLocation(OpenLRLineLocation openLRLineLocation) {
        this.type = Type.OPEN_LRLINE_LOCATION;
        this.value = openLRLineLocation;
    }

    public static MatchedRoadObjectLocation valueOf(OpenLRLineLocation openLRLineLocation) {
        return new MatchedRoadObjectLocation(openLRLineLocation);
    }

    public MatchedGantryLocation getMatchedGantryLocation() {
        if (isMatchedGantryLocation()) {
            return (MatchedGantryLocation) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15106));
    }

    public MatchedPointLocation getMatchedPointLocation() {
        if (isMatchedPointLocation()) {
            return (MatchedPointLocation) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15107));
    }

    public MatchedPolygonLocation getMatchedPolygonLocation() {
        if (isMatchedPolygonLocation()) {
            return (MatchedPolygonLocation) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15108));
    }

    public MatchedPolylineLocation getMatchedPolylineLocation() {
        if (isMatchedPolylineLocation()) {
            return (MatchedPolylineLocation) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15109));
    }

    public MatchedSubgraphLocation getMatchedSubgraphLocation() {
        if (isMatchedSubgraphLocation()) {
            return (MatchedSubgraphLocation) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15110));
    }

    public OpenLRLineLocation getOpenLRLineLocation() {
        if (isOpenLRLineLocation()) {
            return (OpenLRLineLocation) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15111));
    }

    public OpenLRPointAlongLineLocation getOpenLRPointAlongLineLocation() {
        if (isOpenLRPointAlongLineLocation()) {
            return (OpenLRPointAlongLineLocation) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15112));
    }

    public RouteAlertLocation getRouteAlertLocation() {
        if (isRouteAlertLocation()) {
            return (RouteAlertLocation) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15113));
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isMatchedGantryLocation() {
        return this.type == Type.MATCHED_GANTRY_LOCATION;
    }

    public boolean isMatchedPointLocation() {
        return this.type == Type.MATCHED_POINT_LOCATION;
    }

    public boolean isMatchedPolygonLocation() {
        return this.type == Type.MATCHED_POLYGON_LOCATION;
    }

    public boolean isMatchedPolylineLocation() {
        return this.type == Type.MATCHED_POLYLINE_LOCATION;
    }

    public boolean isMatchedSubgraphLocation() {
        return this.type == Type.MATCHED_SUBGRAPH_LOCATION;
    }

    public boolean isOpenLRLineLocation() {
        return this.type == Type.OPEN_LRLINE_LOCATION;
    }

    public boolean isOpenLRPointAlongLineLocation() {
        return this.type == Type.OPEN_LRPOINT_ALONG_LINE_LOCATION;
    }

    public boolean isRouteAlertLocation() {
        return this.type == Type.ROUTE_ALERT_LOCATION;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static MatchedRoadObjectLocation valueOf(OpenLRPointAlongLineLocation openLRPointAlongLineLocation) {
        return new MatchedRoadObjectLocation(openLRPointAlongLineLocation);
    }

    public static MatchedRoadObjectLocation valueOf(MatchedPolylineLocation matchedPolylineLocation) {
        return new MatchedRoadObjectLocation(matchedPolylineLocation);
    }

    public MatchedRoadObjectLocation(OpenLRPointAlongLineLocation openLRPointAlongLineLocation) {
        this.type = Type.OPEN_LRPOINT_ALONG_LINE_LOCATION;
        this.value = openLRPointAlongLineLocation;
    }

    public static MatchedRoadObjectLocation valueOf(MatchedGantryLocation matchedGantryLocation) {
        return new MatchedRoadObjectLocation(matchedGantryLocation);
    }

    public static MatchedRoadObjectLocation valueOf(MatchedPolygonLocation matchedPolygonLocation) {
        return new MatchedRoadObjectLocation(matchedPolygonLocation);
    }

    public static MatchedRoadObjectLocation valueOf(MatchedPointLocation matchedPointLocation) {
        return new MatchedRoadObjectLocation(matchedPointLocation);
    }

    public MatchedRoadObjectLocation(MatchedPolylineLocation matchedPolylineLocation) {
        this.type = Type.MATCHED_POLYLINE_LOCATION;
        this.value = matchedPolylineLocation;
    }

    public static MatchedRoadObjectLocation valueOf(MatchedSubgraphLocation matchedSubgraphLocation) {
        return new MatchedRoadObjectLocation(matchedSubgraphLocation);
    }

    public static MatchedRoadObjectLocation valueOf(RouteAlertLocation routeAlertLocation) {
        return new MatchedRoadObjectLocation(routeAlertLocation);
    }

    public MatchedRoadObjectLocation(MatchedGantryLocation matchedGantryLocation) {
        this.type = Type.MATCHED_GANTRY_LOCATION;
        this.value = matchedGantryLocation;
    }

    public MatchedRoadObjectLocation(MatchedPolygonLocation matchedPolygonLocation) {
        this.type = Type.MATCHED_POLYGON_LOCATION;
        this.value = matchedPolygonLocation;
    }

    public MatchedRoadObjectLocation(MatchedPointLocation matchedPointLocation) {
        this.type = Type.MATCHED_POINT_LOCATION;
        this.value = matchedPointLocation;
    }

    public MatchedRoadObjectLocation(MatchedSubgraphLocation matchedSubgraphLocation) {
        this.type = Type.MATCHED_SUBGRAPH_LOCATION;
        this.value = matchedSubgraphLocation;
    }

    public MatchedRoadObjectLocation(RouteAlertLocation routeAlertLocation) {
        this.type = Type.ROUTE_ALERT_LOCATION;
        this.value = routeAlertLocation;
    }
}
