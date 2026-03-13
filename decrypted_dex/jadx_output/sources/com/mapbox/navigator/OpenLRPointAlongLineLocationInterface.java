package com.mapbox.navigator;

import com.mapbox.geojson.Point;
import com.mapbox.navigator.match.openlr.Orientation;
import com.mapbox.navigator.match.openlr.SideOfRoad;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface OpenLRPointAlongLineLocationInterface {
    Point getCoordinate();

    Orientation getOrientation();

    GraphPosition getPosition();

    SideOfRoad getSideOfRoad();
}
