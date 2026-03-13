package com.mapbox.navigator.route_data;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RdAnnotationInterface {
    RdCongestionLevelArray congestion();

    RdU32OptionalArray congestionNumeric();

    RdF64Array distance();

    RdF64Array duration();

    RdSpeedLimitAnnotationArray maxspeed();

    RdF64Array speed();
}
