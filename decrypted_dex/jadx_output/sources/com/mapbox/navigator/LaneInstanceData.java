package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LaneInstanceData implements Serializable {
    private final LaneInstance laneInstance;
    private final int leftRoadMarkingIndex;
    private final int rightRoadMarkingIndex;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneInstanceData(int i3, int i10, LaneInstance laneInstance) {
        this.leftRoadMarkingIndex = i3;
        this.rightRoadMarkingIndex = i10;
        this.laneInstance = laneInstance;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneInstanceData laneInstanceData = (LaneInstanceData) obj;
        return this.leftRoadMarkingIndex == laneInstanceData.leftRoadMarkingIndex && this.rightRoadMarkingIndex == laneInstanceData.rightRoadMarkingIndex && Objects.equals(this.laneInstance, laneInstanceData.laneInstance);
    }

    public LaneInstance getLaneInstance() {
        return this.laneInstance;
    }

    public int getLeftRoadMarkingIndex() {
        return this.leftRoadMarkingIndex;
    }

    public int getRightRoadMarkingIndex() {
        return this.rightRoadMarkingIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.leftRoadMarkingIndex), Integer.valueOf(this.rightRoadMarkingIndex), this.laneInstance);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[leftRoadMarkingIndex: ");
        b.o(this.leftRoadMarkingIndex, ", rightRoadMarkingIndex: ", sb2);
        b.o(this.rightRoadMarkingIndex, ", laneInstance: ", sb2);
        sb2.append(RecordUtils.fieldToString(this.laneInstance));
        sb2.append("]");
        return sb2.toString();
    }
}
