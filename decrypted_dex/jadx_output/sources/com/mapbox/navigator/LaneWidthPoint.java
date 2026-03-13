package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LaneWidthPoint implements Serializable {
    private final float leftWidth;
    private final float percentAlong;
    private final float rightWidth;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneWidthPoint(float f10, float f11, float f12) {
        this.percentAlong = f10;
        this.leftWidth = f11;
        this.rightWidth = f12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneWidthPoint laneWidthPoint = (LaneWidthPoint) obj;
        return PartialEq.compare(this.percentAlong, laneWidthPoint.percentAlong) && PartialEq.compare(this.leftWidth, laneWidthPoint.leftWidth) && PartialEq.compare(this.rightWidth, laneWidthPoint.rightWidth);
    }

    public float getLeftWidth() {
        return this.leftWidth;
    }

    public float getPercentAlong() {
        return this.percentAlong;
    }

    public float getRightWidth() {
        return this.rightWidth;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.percentAlong), Float.valueOf(this.leftWidth), Float.valueOf(this.rightWidth));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[percentAlong: ");
        b.n(this.percentAlong, sb2, ", leftWidth: ");
        b.n(this.leftWidth, sb2, ", rightWidth: ");
        sb2.append(RecordUtils.fieldToString(Float.valueOf(this.rightWidth)));
        sb2.append("]");
        return sb2.toString();
    }
}
