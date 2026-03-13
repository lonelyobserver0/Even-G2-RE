package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ValueOnEdge implements Serializable {
    private final double percentAlong;
    private final float shapeIndex;
    private final double value;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ValueOnEdge(float f10, double d8, double d10) {
        this.shapeIndex = f10;
        this.percentAlong = d8;
        this.value = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValueOnEdge valueOnEdge = (ValueOnEdge) obj;
        return PartialEq.compare(this.shapeIndex, valueOnEdge.shapeIndex) && PartialEq.compare(this.percentAlong, valueOnEdge.percentAlong) && PartialEq.compare(this.value, valueOnEdge.value);
    }

    public double getPercentAlong() {
        return this.percentAlong;
    }

    public float getShapeIndex() {
        return this.shapeIndex;
    }

    public double getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.shapeIndex), Double.valueOf(this.percentAlong), Double.valueOf(this.value));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[shapeIndex: ");
        b.n(this.shapeIndex, sb2, ", percentAlong: ");
        b.m(this.percentAlong, sb2, ", value: ");
        return b.f(this.value, sb2, "]");
    }
}
