package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MatchedLaneInfo implements Serializable {
    private final Integer currentLaneIndex;
    private final Double currentLaneOffset;
    private final Double currentLaneWidth;
    private final Integer laneCount;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchedLaneInfo(Integer num, Integer num2, Double d8, Double d10) {
        this.laneCount = num;
        this.currentLaneIndex = num2;
        this.currentLaneWidth = d8;
        this.currentLaneOffset = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchedLaneInfo matchedLaneInfo = (MatchedLaneInfo) obj;
        return Objects.equals(this.laneCount, matchedLaneInfo.laneCount) && Objects.equals(this.currentLaneIndex, matchedLaneInfo.currentLaneIndex) && Objects.equals(this.currentLaneWidth, matchedLaneInfo.currentLaneWidth) && Objects.equals(this.currentLaneOffset, matchedLaneInfo.currentLaneOffset);
    }

    public Integer getCurrentLaneIndex() {
        return this.currentLaneIndex;
    }

    public Double getCurrentLaneOffset() {
        return this.currentLaneOffset;
    }

    public Double getCurrentLaneWidth() {
        return this.currentLaneWidth;
    }

    public Integer getLaneCount() {
        return this.laneCount;
    }

    public int hashCode() {
        return Objects.hash(this.laneCount, this.currentLaneIndex, this.currentLaneWidth, this.currentLaneOffset);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[laneCount: ");
        b.t(this.laneCount, sb2, ", currentLaneIndex: ");
        b.t(this.currentLaneIndex, sb2, ", currentLaneWidth: ");
        b.r(this.currentLaneWidth, sb2, ", currentLaneOffset: ");
        sb2.append(RecordUtils.fieldToString(this.currentLaneOffset));
        sb2.append("]");
        return sb2.toString();
    }
}
