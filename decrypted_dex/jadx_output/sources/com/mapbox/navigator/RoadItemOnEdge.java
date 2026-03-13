package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadItemOnEdge implements Serializable {
    private final double percentAlong;
    private final RoadItem roadItem;
    private final float shapeIndex;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadItemOnEdge(float f10, double d8, RoadItem roadItem) {
        this.shapeIndex = f10;
        this.percentAlong = d8;
        this.roadItem = roadItem;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadItemOnEdge roadItemOnEdge = (RoadItemOnEdge) obj;
        return PartialEq.compare(this.shapeIndex, roadItemOnEdge.shapeIndex) && PartialEq.compare(this.percentAlong, roadItemOnEdge.percentAlong) && Objects.equals(this.roadItem, roadItemOnEdge.roadItem);
    }

    public double getPercentAlong() {
        return this.percentAlong;
    }

    public RoadItem getRoadItem() {
        return this.roadItem;
    }

    public float getShapeIndex() {
        return this.shapeIndex;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.shapeIndex), Double.valueOf(this.percentAlong), this.roadItem);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[shapeIndex: ");
        b.n(this.shapeIndex, sb2, ", percentAlong: ");
        b.m(this.percentAlong, sb2, ", roadItem: ");
        sb2.append(RecordUtils.fieldToString(this.roadItem));
        sb2.append("]");
        return sb2.toString();
    }
}
