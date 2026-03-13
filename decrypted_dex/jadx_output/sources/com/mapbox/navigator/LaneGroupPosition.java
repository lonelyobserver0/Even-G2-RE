package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LaneGroupPosition implements Serializable {
    private final long laneGroupId;
    private final double percentAlong;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneGroupPosition(long j, double d8) {
        this.laneGroupId = j;
        this.percentAlong = d8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneGroupPosition laneGroupPosition = (LaneGroupPosition) obj;
        return this.laneGroupId == laneGroupPosition.laneGroupId && PartialEq.compare(this.percentAlong, laneGroupPosition.percentAlong);
    }

    public long getLaneGroupId() {
        return this.laneGroupId;
    }

    public double getPercentAlong() {
        return this.percentAlong;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.laneGroupId), Double.valueOf(this.percentAlong));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[laneGroupId: ");
        b.p(this.laneGroupId, sb2, ", percentAlong: ");
        return b.f(this.percentAlong, sb2, "]");
    }
}
