package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RerouteControllerInterface {
    void cancel();

    void reroute(String str, RerouteCallback rerouteCallback);

    void setOptionsAdapter(RouteOptionsAdapter routeOptionsAdapter);
}
