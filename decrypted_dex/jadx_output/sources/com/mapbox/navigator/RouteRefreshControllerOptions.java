package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteRefreshControllerOptions implements Serializable {
    private final String requestId;
    private final int routeIndex;
    private final RoutingProfile routingProfile;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteRefreshControllerOptions(String str, int i3, RoutingProfile routingProfile) {
        this.requestId = str;
        this.routeIndex = i3;
        this.routingProfile = routingProfile;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteRefreshControllerOptions routeRefreshControllerOptions = (RouteRefreshControllerOptions) obj;
        return Objects.equals(this.requestId, routeRefreshControllerOptions.requestId) && this.routeIndex == routeRefreshControllerOptions.routeIndex && Objects.equals(this.routingProfile, routeRefreshControllerOptions.routingProfile);
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getRouteIndex() {
        return this.routeIndex;
    }

    public RoutingProfile getRoutingProfile() {
        return this.routingProfile;
    }

    public int hashCode() {
        return Objects.hash(this.requestId, Integer.valueOf(this.routeIndex), this.routingProfile);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[requestId: ");
        h.z(sb2, this.requestId, ", routeIndex: ");
        b.o(this.routeIndex, ", routingProfile: ", sb2);
        sb2.append(RecordUtils.fieldToString(this.routingProfile));
        sb2.append("]");
        return sb2.toString();
    }
}
