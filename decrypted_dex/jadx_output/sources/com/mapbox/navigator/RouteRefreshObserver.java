package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RouteRefreshObserver {
    void onRouteRefreshAnnotationsUpdated(RouteIdentifier routeIdentifier, String str, int i3, int i10);

    void onRouteRefreshCancelled(RouteIdentifier routeIdentifier);

    void onRouteRefreshFailed(RouteIdentifier routeIdentifier, RouteRefreshError routeRefreshError);
}
