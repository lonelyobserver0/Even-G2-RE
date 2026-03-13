package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LaneData implements Serializable {
    private final long id;
    private final List<Long> incomingLaneIds;
    private final long laneGroupId;
    private final LaneType laneType;
    private final Long leftLaneId;
    private final LaneSeparatorType leftLaneSeparator;
    private final double length;
    private final Long oncomingLaneId;
    private final List<Long> outboundLaneIds;
    private final Long rightLaneId;
    private final LaneSeparatorType rightLaneSeparator;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneData(long j, long j3, double d8, Long l9, Long l10, List<Long> list, List<Long> list2, LaneSeparatorType laneSeparatorType, LaneSeparatorType laneSeparatorType2, Long l11, LaneType laneType) {
        this.id = j;
        this.laneGroupId = j3;
        this.length = d8;
        this.rightLaneId = l9;
        this.leftLaneId = l10;
        this.outboundLaneIds = list;
        this.incomingLaneIds = list2;
        this.rightLaneSeparator = laneSeparatorType;
        this.leftLaneSeparator = laneSeparatorType2;
        this.oncomingLaneId = l11;
        this.laneType = laneType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneData laneData = (LaneData) obj;
        return this.id == laneData.id && this.laneGroupId == laneData.laneGroupId && PartialEq.compare(this.length, laneData.length) && Objects.equals(this.rightLaneId, laneData.rightLaneId) && Objects.equals(this.leftLaneId, laneData.leftLaneId) && Objects.equals(this.outboundLaneIds, laneData.outboundLaneIds) && Objects.equals(this.incomingLaneIds, laneData.incomingLaneIds) && Objects.equals(this.rightLaneSeparator, laneData.rightLaneSeparator) && Objects.equals(this.leftLaneSeparator, laneData.leftLaneSeparator) && Objects.equals(this.oncomingLaneId, laneData.oncomingLaneId) && Objects.equals(this.laneType, laneData.laneType);
    }

    public long getId() {
        return this.id;
    }

    public List<Long> getIncomingLaneIds() {
        return this.incomingLaneIds;
    }

    public long getLaneGroupId() {
        return this.laneGroupId;
    }

    public LaneType getLaneType() {
        return this.laneType;
    }

    public Long getLeftLaneId() {
        return this.leftLaneId;
    }

    public LaneSeparatorType getLeftLaneSeparator() {
        return this.leftLaneSeparator;
    }

    public double getLength() {
        return this.length;
    }

    public Long getOncomingLaneId() {
        return this.oncomingLaneId;
    }

    public List<Long> getOutboundLaneIds() {
        return this.outboundLaneIds;
    }

    public Long getRightLaneId() {
        return this.rightLaneId;
    }

    public LaneSeparatorType getRightLaneSeparator() {
        return this.rightLaneSeparator;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.id), Long.valueOf(this.laneGroupId), Double.valueOf(this.length), this.rightLaneId, this.leftLaneId, this.outboundLaneIds, this.incomingLaneIds, this.rightLaneSeparator, this.leftLaneSeparator, this.oncomingLaneId, this.laneType);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        b.p(this.id, sb2, ", laneGroupId: ");
        b.p(this.laneGroupId, sb2, ", length: ");
        b.m(this.length, sb2, ", rightLaneId: ");
        b.u(this.rightLaneId, sb2, ", leftLaneId: ");
        b.u(this.leftLaneId, sb2, ", outboundLaneIds: ");
        b.v(", incomingLaneIds: ", sb2, this.outboundLaneIds);
        b.v(", rightLaneSeparator: ", sb2, this.incomingLaneIds);
        sb2.append(RecordUtils.fieldToString(this.rightLaneSeparator));
        sb2.append(", leftLaneSeparator: ");
        sb2.append(RecordUtils.fieldToString(this.leftLaneSeparator));
        sb2.append(", oncomingLaneId: ");
        b.u(this.oncomingLaneId, sb2, ", laneType: ");
        sb2.append(RecordUtils.fieldToString(this.laneType));
        sb2.append("]");
        return sb2.toString();
    }
}
