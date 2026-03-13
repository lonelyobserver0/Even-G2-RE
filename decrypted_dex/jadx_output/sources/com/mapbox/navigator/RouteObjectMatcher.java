package com.mapbox.navigator;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RouteObjectMatcher {
    void cancel(List<String> list);

    void cancelAll();

    void matchRouteObjects(List<MatchableRouteObject> list);

    void setListener(RouteObjectMatcherListener routeObjectMatcherListener);
}
