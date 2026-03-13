package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LaneGroupData implements Serializable {
    private final Long elevationId;
    private final long id;
    private final List<Long> incomingLaneGroupIds;
    private final boolean isJunction;
    private final List<Long> laneIds;
    private final double length;
    private final List<Long> outboundLaneGroupIds;
    private final long zLevel;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneGroupData(long j, List<Long> list, double d8, boolean z2, List<Long> list2, List<Long> list3, long j3, Long l9) {
        this.id = j;
        this.laneIds = list;
        this.length = d8;
        this.isJunction = z2;
        this.outboundLaneGroupIds = list2;
        this.incomingLaneGroupIds = list3;
        this.zLevel = j3;
        this.elevationId = l9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneGroupData laneGroupData = (LaneGroupData) obj;
        return this.id == laneGroupData.id && Objects.equals(this.laneIds, laneGroupData.laneIds) && PartialEq.compare(this.length, laneGroupData.length) && this.isJunction == laneGroupData.isJunction && Objects.equals(this.outboundLaneGroupIds, laneGroupData.outboundLaneGroupIds) && Objects.equals(this.incomingLaneGroupIds, laneGroupData.incomingLaneGroupIds) && this.zLevel == laneGroupData.zLevel && Objects.equals(this.elevationId, laneGroupData.elevationId);
    }

    public Long getElevationId() {
        return this.elevationId;
    }

    public long getId() {
        return this.id;
    }

    public List<Long> getIncomingLaneGroupIds() {
        return this.incomingLaneGroupIds;
    }

    public boolean getIsJunction() {
        return this.isJunction;
    }

    public List<Long> getLaneIds() {
        return this.laneIds;
    }

    public double getLength() {
        return this.length;
    }

    public List<Long> getOutboundLaneGroupIds() {
        return this.outboundLaneGroupIds;
    }

    public long getZLevel() {
        return this.zLevel;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.id), this.laneIds, Double.valueOf(this.length), Boolean.valueOf(this.isJunction), this.outboundLaneGroupIds, this.incomingLaneGroupIds, Long.valueOf(this.zLevel), this.elevationId);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        b.p(this.id, sb2, ", laneIds: ");
        b.v(", length: ", sb2, this.laneIds);
        b.m(this.length, sb2, ", isJunction: ");
        h.A(this.isJunction, sb2, ", outboundLaneGroupIds: ");
        b.v(", incomingLaneGroupIds: ", sb2, this.outboundLaneGroupIds);
        b.v(", zLevel: ", sb2, this.incomingLaneGroupIds);
        b.p(this.zLevel, sb2, ", elevationId: ");
        sb2.append(RecordUtils.fieldToString(this.elevationId));
        sb2.append("]");
        return sb2.toString();
    }
}
