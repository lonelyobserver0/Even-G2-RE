package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MatchedDetectedObject implements Serializable {
    private final FixDirectedCoordinate coordinate;
    private final String id;
    private final MatchedLaneInfo laneInfo;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchedDetectedObject(String str, FixDirectedCoordinate fixDirectedCoordinate, MatchedLaneInfo matchedLaneInfo) {
        this.id = str;
        this.coordinate = fixDirectedCoordinate;
        this.laneInfo = matchedLaneInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchedDetectedObject matchedDetectedObject = (MatchedDetectedObject) obj;
        return Objects.equals(this.id, matchedDetectedObject.id) && Objects.equals(this.coordinate, matchedDetectedObject.coordinate) && Objects.equals(this.laneInfo, matchedDetectedObject.laneInfo);
    }

    public FixDirectedCoordinate getCoordinate() {
        return this.coordinate;
    }

    public String getId() {
        return this.id;
    }

    public MatchedLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.coordinate, this.laneInfo);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", coordinate: ");
        sb2.append(RecordUtils.fieldToString(this.coordinate));
        sb2.append(", laneInfo: ");
        sb2.append(RecordUtils.fieldToString(this.laneInfo));
        sb2.append("]");
        return sb2.toString();
    }
}
