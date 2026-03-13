package com.mapbox.navigator;

import com.mapbox.bindgen.DataRef;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RerouteObserver {
    void onRerouteCancelled();

    boolean onRerouteDetected(String str);

    void onRerouteFailed(RerouteError rerouteError);

    void onRerouteReceived(DataRef dataRef, String str, RouterOrigin routerOrigin);

    void onSwitchToAlternative(RouteInterface routeInterface, int i3);
}
