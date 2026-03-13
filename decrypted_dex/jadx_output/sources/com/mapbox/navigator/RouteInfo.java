package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteInfo implements Serializable {
    private final List<UpcomingRouteAlert> alerts;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteInfo(List<UpcomingRouteAlert> list) {
        this.alerts = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.alerts, ((RouteInfo) obj).alerts);
    }

    public List<UpcomingRouteAlert> getAlerts() {
        return this.alerts;
    }

    public int hashCode() {
        return Objects.hash(this.alerts);
    }

    public String toString() {
        return b.i("]", new StringBuilder("[alerts: "), this.alerts);
    }
}
