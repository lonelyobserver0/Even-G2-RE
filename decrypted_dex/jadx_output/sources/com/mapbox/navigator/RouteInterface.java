package com.mapbox.navigator;

import com.mapbox.bindgen.DataRef;
import com.mapbox.geojson.Point;
import java.util.Date;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RouteInterface {
    Long getExpirationTimeMs();

    Date getLastRefreshTimestamp();

    MapboxAPI getMapboxAPI();

    String getRequestUri();

    DataRef getResponseJsonRef();

    String getResponseUuid();

    List<Point> getRouteGeometry();

    String getRouteId();

    int getRouteIndex();

    RouteInfo getRouteInfo();

    RouterOrigin getRouterOrigin();

    List<Waypoint> getWaypoints();
}
