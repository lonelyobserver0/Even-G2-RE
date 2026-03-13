package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteLaneGroup implements Serializable {
    private final Double distanceFromEgo;
    private final double distanceFromStartOfRoute;
    private final long laneGroupId;
    private final List<RouteLane> lanes;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteLaneGroup(long j, List<RouteLane> list, Double d8, double d10) {
        this.laneGroupId = j;
        this.lanes = list;
        this.distanceFromEgo = d8;
        this.distanceFromStartOfRoute = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteLaneGroup routeLaneGroup = (RouteLaneGroup) obj;
        return this.laneGroupId == routeLaneGroup.laneGroupId && Objects.equals(this.lanes, routeLaneGroup.lanes) && Objects.equals(this.distanceFromEgo, routeLaneGroup.distanceFromEgo) && PartialEq.compare(this.distanceFromStartOfRoute, routeLaneGroup.distanceFromStartOfRoute);
    }

    public Double getDistanceFromEgo() {
        return this.distanceFromEgo;
    }

    public double getDistanceFromStartOfRoute() {
        return this.distanceFromStartOfRoute;
    }

    public long getLaneGroupId() {
        return this.laneGroupId;
    }

    public List<RouteLane> getLanes() {
        return this.lanes;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.laneGroupId), this.lanes, this.distanceFromEgo, Double.valueOf(this.distanceFromStartOfRoute));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[laneGroupId: ");
        b.p(this.laneGroupId, sb2, ", lanes: ");
        b.v(", distanceFromEgo: ", sb2, this.lanes);
        b.r(this.distanceFromEgo, sb2, ", distanceFromStartOfRoute: ");
        return b.f(this.distanceFromStartOfRoute, sb2, "]");
    }
}
