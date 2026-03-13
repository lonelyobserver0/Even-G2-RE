package com.mapbox.navigator.route_data;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RdRouteDataInterface {
    double distance();

    double duration();

    RdCoordinateArrayInterface geometry();

    RdLegArrayInterface legs();

    String voiceLocale();

    RdWaypointArrayInterface waypoints();

    double weight();

    String weightName();
}
