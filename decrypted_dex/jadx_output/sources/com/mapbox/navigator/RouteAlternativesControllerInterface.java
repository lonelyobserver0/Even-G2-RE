package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RouteAlternativesControllerInterface {
    void addObserver(RouteAlternativesObserver routeAlternativesObserver);

    void removeAllObservers();

    void removeObserver(RouteAlternativesObserver routeAlternativesObserver);

    void setRouteAlternativesOptions(RouteAlternativesOptions routeAlternativesOptions);
}
