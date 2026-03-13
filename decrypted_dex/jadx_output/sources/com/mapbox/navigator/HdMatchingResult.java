package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class HdMatchingResult implements Serializable {
    private final CorrectedLocationData correctedLocationData;
    private final boolean inTunnel;
    private final boolean isOnRoad;
    private final boolean isTeleport;
    private final LaneGroupMatching laneGroupMatching;
    private final LaneMatching laneMatching;
    private final float offRoadProbability;
    private final RoutesLaneGuidance routesLaneGuidance;
    private final int totalCandidatesCount;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public HdMatchingResult(LaneGroupMatching laneGroupMatching, LaneMatching laneMatching, boolean z2, boolean z10, float f10, RoutesLaneGuidance routesLaneGuidance, boolean z11, CorrectedLocationData correctedLocationData, int i3) {
        this.laneGroupMatching = laneGroupMatching;
        this.laneMatching = laneMatching;
        this.isTeleport = z2;
        this.isOnRoad = z10;
        this.offRoadProbability = f10;
        this.routesLaneGuidance = routesLaneGuidance;
        this.inTunnel = z11;
        this.correctedLocationData = correctedLocationData;
        this.totalCandidatesCount = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HdMatchingResult hdMatchingResult = (HdMatchingResult) obj;
        return Objects.equals(this.laneGroupMatching, hdMatchingResult.laneGroupMatching) && Objects.equals(this.laneMatching, hdMatchingResult.laneMatching) && this.isTeleport == hdMatchingResult.isTeleport && this.isOnRoad == hdMatchingResult.isOnRoad && PartialEq.compare(this.offRoadProbability, hdMatchingResult.offRoadProbability) && Objects.equals(this.routesLaneGuidance, hdMatchingResult.routesLaneGuidance) && this.inTunnel == hdMatchingResult.inTunnel && Objects.equals(this.correctedLocationData, hdMatchingResult.correctedLocationData) && this.totalCandidatesCount == hdMatchingResult.totalCandidatesCount;
    }

    public CorrectedLocationData getCorrectedLocationData() {
        return this.correctedLocationData;
    }

    public boolean getInTunnel() {
        return this.inTunnel;
    }

    public boolean getIsOnRoad() {
        return this.isOnRoad;
    }

    public boolean getIsTeleport() {
        return this.isTeleport;
    }

    public LaneGroupMatching getLaneGroupMatching() {
        return this.laneGroupMatching;
    }

    public LaneMatching getLaneMatching() {
        return this.laneMatching;
    }

    public float getOffRoadProbability() {
        return this.offRoadProbability;
    }

    public RoutesLaneGuidance getRoutesLaneGuidance() {
        return this.routesLaneGuidance;
    }

    public int getTotalCandidatesCount() {
        return this.totalCandidatesCount;
    }

    public int hashCode() {
        return Objects.hash(this.laneGroupMatching, this.laneMatching, Boolean.valueOf(this.isTeleport), Boolean.valueOf(this.isOnRoad), Float.valueOf(this.offRoadProbability), this.routesLaneGuidance, Boolean.valueOf(this.inTunnel), this.correctedLocationData, Integer.valueOf(this.totalCandidatesCount));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[laneGroupMatching: ");
        sb2.append(RecordUtils.fieldToString(this.laneGroupMatching));
        sb2.append(", laneMatching: ");
        sb2.append(RecordUtils.fieldToString(this.laneMatching));
        sb2.append(", isTeleport: ");
        h.A(this.isTeleport, sb2, ", isOnRoad: ");
        h.A(this.isOnRoad, sb2, ", offRoadProbability: ");
        b.n(this.offRoadProbability, sb2, ", routesLaneGuidance: ");
        sb2.append(RecordUtils.fieldToString(this.routesLaneGuidance));
        sb2.append(", inTunnel: ");
        h.A(this.inTunnel, sb2, ", correctedLocationData: ");
        sb2.append(RecordUtils.fieldToString(this.correctedLocationData));
        sb2.append(", totalCandidatesCount: ");
        return b.g(this.totalCandidatesCount, "]", sb2);
    }
}
