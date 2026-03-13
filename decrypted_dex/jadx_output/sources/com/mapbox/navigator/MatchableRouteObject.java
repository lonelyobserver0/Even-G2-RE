package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MatchableRouteObject implements Serializable {
    private final double distanceFromStartOfRoute;
    private final String id;
    private final Double length;
    private final String routeId;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchableRouteObject(String str, double d8, Double d10, String str2) {
        this.id = str;
        this.distanceFromStartOfRoute = d8;
        this.length = d10;
        this.routeId = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchableRouteObject matchableRouteObject = (MatchableRouteObject) obj;
        return Objects.equals(this.id, matchableRouteObject.id) && PartialEq.compare(this.distanceFromStartOfRoute, matchableRouteObject.distanceFromStartOfRoute) && Objects.equals(this.length, matchableRouteObject.length) && Objects.equals(this.routeId, matchableRouteObject.routeId);
    }

    public double getDistanceFromStartOfRoute() {
        return this.distanceFromStartOfRoute;
    }

    public String getId() {
        return this.id;
    }

    public Double getLength() {
        return this.length;
    }

    public String getRouteId() {
        return this.routeId;
    }

    public int hashCode() {
        return Objects.hash(this.id, Double.valueOf(this.distanceFromStartOfRoute), this.length, this.routeId);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", distanceFromStartOfRoute: ");
        b.m(this.distanceFromStartOfRoute, sb2, ", length: ");
        b.r(this.length, sb2, ", routeId: ");
        return h.t(sb2, this.routeId, "]");
    }
}
