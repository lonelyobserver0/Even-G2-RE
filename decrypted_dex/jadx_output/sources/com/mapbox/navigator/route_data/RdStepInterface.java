package com.mapbox.navigator.route_data;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RdStepInterface {
    double distance();

    RdDrivingSide drivingSide();

    double duration();

    RdCoordinateArrayInterface geometry();

    List<RdIntersection> intersections();

    RdManeuver maneuver();

    String name();

    RdRoadShield roadShield();

    List<RdVoiceInstruction> voiceInstructions();
}
