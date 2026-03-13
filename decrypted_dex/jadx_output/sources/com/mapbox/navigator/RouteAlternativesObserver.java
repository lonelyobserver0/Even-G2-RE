package com.mapbox.navigator;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RouteAlternativesObserver {
    void onError(String str);

    @Deprecated
    void onOnlinePrimaryRouteAvailable(RouteInterface routeInterface);

    @Deprecated
    void onRouteAlternativesChanged(List<RouteAlternative> list, List<RouteAlternative> list2);

    void onRouteAlternativesUpdated(RouteInterface routeInterface, List<RouteAlternative> list, List<RouteAlternative> list2);
}
