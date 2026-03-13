package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LanePosition implements Serializable {
    private final long laneId;
    private final double percentAlong;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LanePosition(long j, double d8) {
        this.laneId = j;
        this.percentAlong = d8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LanePosition lanePosition = (LanePosition) obj;
        return this.laneId == lanePosition.laneId && PartialEq.compare(this.percentAlong, lanePosition.percentAlong);
    }

    public long getLaneId() {
        return this.laneId;
    }

    public double getPercentAlong() {
        return this.percentAlong;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.laneId), Double.valueOf(this.percentAlong));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[laneId: ");
        b.p(this.laneId, sb2, ", percentAlong: ");
        return b.f(this.percentAlong, sb2, "]");
    }
}
