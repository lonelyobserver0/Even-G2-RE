package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class MergingAreaInfo implements Serializable {
    private final String id;
    private final MergingAreaType mergeType;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MergingAreaInfo(String str, MergingAreaType mergingAreaType) {
        this.id = str;
        this.mergeType = mergingAreaType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergingAreaInfo mergingAreaInfo = (MergingAreaInfo) obj;
        return Objects.equals(this.id, mergingAreaInfo.id) && Objects.equals(this.mergeType, mergingAreaInfo.mergeType);
    }

    public String getId() {
        return this.id;
    }

    public MergingAreaType getMergeType() {
        return this.mergeType;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.mergeType);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", mergeType: ");
        sb2.append(RecordUtils.fieldToString(this.mergeType));
        sb2.append("]");
        return sb2.toString();
    }
}
