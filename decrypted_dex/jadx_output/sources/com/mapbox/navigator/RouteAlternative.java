package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteAlternative implements Serializable {
    private final RouteIntersection alternativeRouteFork;
    private final int id;
    private final AlternativeRouteInfo infoFromFork;
    private final AlternativeRouteInfo infoFromStart;
    private final boolean isNew;
    private final RouteIntersection mainRouteFork;
    private final RouteInterface route;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteAlternative(int i3, RouteInterface routeInterface, RouteIntersection routeIntersection, RouteIntersection routeIntersection2, AlternativeRouteInfo alternativeRouteInfo, AlternativeRouteInfo alternativeRouteInfo2, boolean z2) {
        this.id = i3;
        this.route = routeInterface;
        this.mainRouteFork = routeIntersection;
        this.alternativeRouteFork = routeIntersection2;
        this.infoFromFork = alternativeRouteInfo;
        this.infoFromStart = alternativeRouteInfo2;
        this.isNew = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteAlternative routeAlternative = (RouteAlternative) obj;
        return this.id == routeAlternative.id && Objects.equals(this.route, routeAlternative.route) && Objects.equals(this.mainRouteFork, routeAlternative.mainRouteFork) && Objects.equals(this.alternativeRouteFork, routeAlternative.alternativeRouteFork) && Objects.equals(this.infoFromFork, routeAlternative.infoFromFork) && Objects.equals(this.infoFromStart, routeAlternative.infoFromStart) && this.isNew == routeAlternative.isNew;
    }

    public RouteIntersection getAlternativeRouteFork() {
        return this.alternativeRouteFork;
    }

    public int getId() {
        return this.id;
    }

    public AlternativeRouteInfo getInfoFromFork() {
        return this.infoFromFork;
    }

    public AlternativeRouteInfo getInfoFromStart() {
        return this.infoFromStart;
    }

    public boolean getIsNew() {
        return this.isNew;
    }

    public RouteIntersection getMainRouteFork() {
        return this.mainRouteFork;
    }

    public RouteInterface getRoute() {
        return this.route;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id), this.route, this.mainRouteFork, this.alternativeRouteFork, this.infoFromFork, this.infoFromStart, Boolean.valueOf(this.isNew));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        b.o(this.id, ", route: ", sb2);
        sb2.append(RecordUtils.fieldToString(this.route));
        sb2.append(", mainRouteFork: ");
        sb2.append(RecordUtils.fieldToString(this.mainRouteFork));
        sb2.append(", alternativeRouteFork: ");
        sb2.append(RecordUtils.fieldToString(this.alternativeRouteFork));
        sb2.append(", infoFromFork: ");
        sb2.append(RecordUtils.fieldToString(this.infoFromFork));
        sb2.append(", infoFromStart: ");
        sb2.append(RecordUtils.fieldToString(this.infoFromStart));
        sb2.append(", isNew: ");
        return b.k(this.isNew, sb2, "]");
    }
}
