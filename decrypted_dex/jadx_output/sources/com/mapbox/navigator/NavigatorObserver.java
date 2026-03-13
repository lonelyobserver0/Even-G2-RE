package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface NavigatorObserver {
    void onRoutesChanged(RoutesChangeInfo routesChangeInfo);

    void onStatus(NavigationStatusOrigin navigationStatusOrigin, NavigationStatus navigationStatus);
}
