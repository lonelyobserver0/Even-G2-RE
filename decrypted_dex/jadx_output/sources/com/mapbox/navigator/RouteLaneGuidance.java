package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteLaneGuidance implements Serializable {
    private final double beginDistanceFromStartOfRoute;
    private final List<ConnectedLaneSequence> connectedLaneSequences;
    private final double endDistanceFromStartOfRoute;
    private final String routeId;
    private final List<RouteLaneGroup> routeLaneGroups;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteLaneGuidance(String str, List<RouteLaneGroup> list, List<ConnectedLaneSequence> list2, double d8, double d10) {
        this.routeId = str;
        this.routeLaneGroups = list;
        this.connectedLaneSequences = list2;
        this.beginDistanceFromStartOfRoute = d8;
        this.endDistanceFromStartOfRoute = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteLaneGuidance routeLaneGuidance = (RouteLaneGuidance) obj;
        return Objects.equals(this.routeId, routeLaneGuidance.routeId) && Objects.equals(this.routeLaneGroups, routeLaneGuidance.routeLaneGroups) && Objects.equals(this.connectedLaneSequences, routeLaneGuidance.connectedLaneSequences) && PartialEq.compare(this.beginDistanceFromStartOfRoute, routeLaneGuidance.beginDistanceFromStartOfRoute) && PartialEq.compare(this.endDistanceFromStartOfRoute, routeLaneGuidance.endDistanceFromStartOfRoute);
    }

    public double getBeginDistanceFromStartOfRoute() {
        return this.beginDistanceFromStartOfRoute;
    }

    public List<ConnectedLaneSequence> getConnectedLaneSequences() {
        return this.connectedLaneSequences;
    }

    public double getEndDistanceFromStartOfRoute() {
        return this.endDistanceFromStartOfRoute;
    }

    public String getRouteId() {
        return this.routeId;
    }

    public List<RouteLaneGroup> getRouteLaneGroups() {
        return this.routeLaneGroups;
    }

    public int hashCode() {
        return Objects.hash(this.routeId, this.routeLaneGroups, this.connectedLaneSequences, Double.valueOf(this.beginDistanceFromStartOfRoute), Double.valueOf(this.endDistanceFromStartOfRoute));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[routeId: ");
        h.z(sb2, this.routeId, ", routeLaneGroups: ");
        b.v(", connectedLaneSequences: ", sb2, this.routeLaneGroups);
        b.v(", beginDistanceFromStartOfRoute: ", sb2, this.connectedLaneSequences);
        b.m(this.beginDistanceFromStartOfRoute, sb2, ", endDistanceFromStartOfRoute: ");
        return b.f(this.endDistanceFromStartOfRoute, sb2, "]");
    }
}
