package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteRefreshOptions implements Serializable {
    private final HashMap<String, String> additionalParams;
    private final String baseURL;
    private final Integer currentRouteGeometryIndex;
    private final int legIndex;
    private final String requestId;
    private final int routeIndex;
    private final RoutingProfile routingProfile;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteRefreshOptions(String str, int i3, int i10, RoutingProfile routingProfile, String str2, Integer num, HashMap<String, String> hashMap) {
        this.requestId = str;
        this.routeIndex = i3;
        this.legIndex = i10;
        this.routingProfile = routingProfile;
        this.baseURL = str2;
        this.currentRouteGeometryIndex = num;
        this.additionalParams = hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteRefreshOptions routeRefreshOptions = (RouteRefreshOptions) obj;
        return Objects.equals(this.requestId, routeRefreshOptions.requestId) && this.routeIndex == routeRefreshOptions.routeIndex && this.legIndex == routeRefreshOptions.legIndex && Objects.equals(this.routingProfile, routeRefreshOptions.routingProfile) && Objects.equals(this.baseURL, routeRefreshOptions.baseURL) && Objects.equals(this.currentRouteGeometryIndex, routeRefreshOptions.currentRouteGeometryIndex) && Objects.equals(this.additionalParams, routeRefreshOptions.additionalParams);
    }

    public HashMap<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    public String getBaseURL() {
        return this.baseURL;
    }

    public Integer getCurrentRouteGeometryIndex() {
        return this.currentRouteGeometryIndex;
    }

    public int getLegIndex() {
        return this.legIndex;
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
        return Objects.hash(this.requestId, Integer.valueOf(this.routeIndex), Integer.valueOf(this.legIndex), this.routingProfile, this.baseURL, this.currentRouteGeometryIndex, this.additionalParams);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[requestId: ");
        h.z(sb2, this.requestId, ", routeIndex: ");
        b.o(this.routeIndex, ", legIndex: ", sb2);
        b.o(this.legIndex, ", routingProfile: ", sb2);
        sb2.append(RecordUtils.fieldToString(this.routingProfile));
        sb2.append(", baseURL: ");
        h.z(sb2, this.baseURL, ", currentRouteGeometryIndex: ");
        b.t(this.currentRouteGeometryIndex, sb2, ", additionalParams: ");
        sb2.append(RecordUtils.fieldToString(this.additionalParams));
        sb2.append("]");
        return sb2.toString();
    }
}
