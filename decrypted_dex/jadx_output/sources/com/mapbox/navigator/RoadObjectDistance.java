package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadObjectDistance implements Serializable {
    private final RoadObjectDistanceInfo distanceInfo;
    private final String roadObjectId;
    private final RoadObjectType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadObjectDistance(String str, RoadObjectType roadObjectType, RoadObjectDistanceInfo roadObjectDistanceInfo) {
        this.roadObjectId = str;
        this.type = roadObjectType;
        this.distanceInfo = roadObjectDistanceInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadObjectDistance roadObjectDistance = (RoadObjectDistance) obj;
        return Objects.equals(this.roadObjectId, roadObjectDistance.roadObjectId) && Objects.equals(this.type, roadObjectDistance.type) && Objects.equals(this.distanceInfo, roadObjectDistance.distanceInfo);
    }

    public RoadObjectDistanceInfo getDistanceInfo() {
        return this.distanceInfo;
    }

    public String getRoadObjectId() {
        return this.roadObjectId;
    }

    public RoadObjectType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.roadObjectId, this.type, this.distanceInfo);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[roadObjectId: ");
        h.z(sb2, this.roadObjectId, ", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", distanceInfo: ");
        sb2.append(RecordUtils.fieldToString(this.distanceInfo));
        sb2.append("]");
        return sb2.toString();
    }
}
