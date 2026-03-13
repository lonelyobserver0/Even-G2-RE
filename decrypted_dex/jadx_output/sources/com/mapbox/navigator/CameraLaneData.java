package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CameraLaneData implements Serializable {
    private final Integer currentLaneIndex;
    private final Float currentLaneOffset;
    private final Float currentLaneWidth;
    private final List<LaneInstanceData> lanes;
    private final List<RoadEdge> roadEdges;
    private final List<RoadMarking> roadMarkings;
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public CameraLaneData(Integer num, Float f10, Float f11, List<RoadMarking> list, List<LaneInstanceData> list2, List<RoadEdge> list3, Date date) {
        this.currentLaneIndex = num;
        this.currentLaneWidth = f10;
        this.currentLaneOffset = f11;
        this.roadMarkings = list;
        this.lanes = list2;
        this.roadEdges = list3;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CameraLaneData cameraLaneData = (CameraLaneData) obj;
        return Objects.equals(this.currentLaneIndex, cameraLaneData.currentLaneIndex) && Objects.equals(this.currentLaneWidth, cameraLaneData.currentLaneWidth) && Objects.equals(this.currentLaneOffset, cameraLaneData.currentLaneOffset) && Objects.equals(this.roadMarkings, cameraLaneData.roadMarkings) && Objects.equals(this.lanes, cameraLaneData.lanes) && Objects.equals(this.roadEdges, cameraLaneData.roadEdges) && Objects.equals(this.timestamp, cameraLaneData.timestamp);
    }

    public Integer getCurrentLaneIndex() {
        return this.currentLaneIndex;
    }

    public Float getCurrentLaneOffset() {
        return this.currentLaneOffset;
    }

    public Float getCurrentLaneWidth() {
        return this.currentLaneWidth;
    }

    public List<LaneInstanceData> getLanes() {
        return this.lanes;
    }

    public List<RoadEdge> getRoadEdges() {
        return this.roadEdges;
    }

    public List<RoadMarking> getRoadMarkings() {
        return this.roadMarkings;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.currentLaneIndex, this.currentLaneWidth, this.currentLaneOffset, this.roadMarkings, this.lanes, this.roadEdges, this.timestamp);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[currentLaneIndex: ");
        b.t(this.currentLaneIndex, sb2, ", currentLaneWidth: ");
        b.s(this.currentLaneWidth, sb2, ", currentLaneOffset: ");
        b.s(this.currentLaneOffset, sb2, ", roadMarkings: ");
        b.v(", lanes: ", sb2, this.roadMarkings);
        b.v(", roadEdges: ", sb2, this.lanes);
        b.v(", timestamp: ", sb2, this.roadEdges);
        sb2.append(RecordUtils.fieldToString(this.timestamp));
        sb2.append("]");
        return sb2.toString();
    }
}
