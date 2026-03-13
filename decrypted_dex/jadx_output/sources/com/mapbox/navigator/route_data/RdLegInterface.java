package com.mapbox.navigator.route_data;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RdLegInterface {
    double distance();

    double duration();

    RdStepArrayInterface steps();

    String summary();
}
