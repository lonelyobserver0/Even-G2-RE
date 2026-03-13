package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadObjectPassInfo implements Serializable {
    private final String roadObjectId;
    private final RoadObjectType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadObjectPassInfo(String str, RoadObjectType roadObjectType) {
        this.roadObjectId = str;
        this.type = roadObjectType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadObjectPassInfo roadObjectPassInfo = (RoadObjectPassInfo) obj;
        return Objects.equals(this.roadObjectId, roadObjectPassInfo.roadObjectId) && Objects.equals(this.type, roadObjectPassInfo.type);
    }

    public String getRoadObjectId() {
        return this.roadObjectId;
    }

    public RoadObjectType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.roadObjectId, this.type);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[roadObjectId: ");
        h.z(sb2, this.roadObjectId, ", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append("]");
        return sb2.toString();
    }
}
