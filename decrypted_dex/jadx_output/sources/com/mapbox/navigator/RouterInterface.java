package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RouterInterface {
    void cancelAll();

    void cancelRouteMapMatchedRequest(long j);

    void cancelRouteRefreshRequest(long j);

    void cancelRouteRequest(long j);

    long getRoute(String str, GetRouteOptions getRouteOptions, GetRouteSignature getRouteSignature, RouterDataRefCallback routerDataRefCallback);

    long getRouteMapMatched(String str, GetRouteOptions getRouteOptions, RouterDataRefCallback routerDataRefCallback);

    long getRouteRefresh(RouteRefreshOptions routeRefreshOptions, RouterRefreshCallback routerRefreshCallback);
}
