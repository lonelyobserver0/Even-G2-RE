package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LaneMatching implements Serializable {
    private final boolean isLaneChange;
    private final MatchedLaneInfo laneInfo;
    private final LanePosition lanePosition;
    private final List<MatchedDetectedObject> matchedDetectedObjects;
    private final FixDirectedCoordinate smoothedCoordinate;
    private final LanePosition smoothedLanePosition;
    private final FixDirectedCoordinate snappedCoordinate;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneMatching(FixDirectedCoordinate fixDirectedCoordinate, LanePosition lanePosition, FixDirectedCoordinate fixDirectedCoordinate2, LanePosition lanePosition2, MatchedLaneInfo matchedLaneInfo, List<MatchedDetectedObject> list, boolean z2) {
        this.smoothedCoordinate = fixDirectedCoordinate;
        this.smoothedLanePosition = lanePosition;
        this.snappedCoordinate = fixDirectedCoordinate2;
        this.lanePosition = lanePosition2;
        this.laneInfo = matchedLaneInfo;
        this.matchedDetectedObjects = list;
        this.isLaneChange = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneMatching laneMatching = (LaneMatching) obj;
        return Objects.equals(this.smoothedCoordinate, laneMatching.smoothedCoordinate) && Objects.equals(this.smoothedLanePosition, laneMatching.smoothedLanePosition) && Objects.equals(this.snappedCoordinate, laneMatching.snappedCoordinate) && Objects.equals(this.lanePosition, laneMatching.lanePosition) && Objects.equals(this.laneInfo, laneMatching.laneInfo) && Objects.equals(this.matchedDetectedObjects, laneMatching.matchedDetectedObjects) && this.isLaneChange == laneMatching.isLaneChange;
    }

    public boolean getIsLaneChange() {
        return this.isLaneChange;
    }

    public MatchedLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    public LanePosition getLanePosition() {
        return this.lanePosition;
    }

    public List<MatchedDetectedObject> getMatchedDetectedObjects() {
        return this.matchedDetectedObjects;
    }

    public FixDirectedCoordinate getSmoothedCoordinate() {
        return this.smoothedCoordinate;
    }

    public LanePosition getSmoothedLanePosition() {
        return this.smoothedLanePosition;
    }

    public FixDirectedCoordinate getSnappedCoordinate() {
        return this.snappedCoordinate;
    }

    public int hashCode() {
        return Objects.hash(this.smoothedCoordinate, this.smoothedLanePosition, this.snappedCoordinate, this.lanePosition, this.laneInfo, this.matchedDetectedObjects, Boolean.valueOf(this.isLaneChange));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[smoothedCoordinate: ");
        sb2.append(RecordUtils.fieldToString(this.smoothedCoordinate));
        sb2.append(", smoothedLanePosition: ");
        sb2.append(RecordUtils.fieldToString(this.smoothedLanePosition));
        sb2.append(", snappedCoordinate: ");
        sb2.append(RecordUtils.fieldToString(this.snappedCoordinate));
        sb2.append(", lanePosition: ");
        sb2.append(RecordUtils.fieldToString(this.lanePosition));
        sb2.append(", laneInfo: ");
        sb2.append(RecordUtils.fieldToString(this.laneInfo));
        sb2.append(", matchedDetectedObjects: ");
        b.v(", isLaneChange: ", sb2, this.matchedDetectedObjects);
        return b.k(this.isLaneChange, sb2, "]");
    }
}
