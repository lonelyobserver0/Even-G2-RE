package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadObjectEnterExitInfo implements Serializable {
    private final boolean enterFromStartOrExitFromEnd;
    private final String roadObjectId;
    private final RoadObjectType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadObjectEnterExitInfo(String str, boolean z2, RoadObjectType roadObjectType) {
        this.roadObjectId = str;
        this.enterFromStartOrExitFromEnd = z2;
        this.type = roadObjectType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadObjectEnterExitInfo roadObjectEnterExitInfo = (RoadObjectEnterExitInfo) obj;
        return Objects.equals(this.roadObjectId, roadObjectEnterExitInfo.roadObjectId) && this.enterFromStartOrExitFromEnd == roadObjectEnterExitInfo.enterFromStartOrExitFromEnd && Objects.equals(this.type, roadObjectEnterExitInfo.type);
    }

    public boolean getEnterFromStartOrExitFromEnd() {
        return this.enterFromStartOrExitFromEnd;
    }

    public String getRoadObjectId() {
        return this.roadObjectId;
    }

    public RoadObjectType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.roadObjectId, Boolean.valueOf(this.enterFromStartOrExitFromEnd), this.type);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[roadObjectId: ");
        h.z(sb2, this.roadObjectId, ", enterFromStartOrExitFromEnd: ");
        h.A(this.enterFromStartOrExitFromEnd, sb2, ", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append("]");
        return sb2.toString();
    }
}
