package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RouteRefreshControllerInterface {
    void addObserver(RouteRefreshObserver routeRefreshObserver);

    void removeAllObservers();

    void removeObserver(RouteRefreshObserver routeRefreshObserver);
}
