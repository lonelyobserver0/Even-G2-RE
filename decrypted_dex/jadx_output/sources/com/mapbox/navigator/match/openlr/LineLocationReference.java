package com.mapbox.navigator.match.openlr;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class LineLocationReference implements Serializable {
    private final double negativeOffset;
    private final List<LocationReferencePoint> points;
    private final double positiveOffset;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LineLocationReference(List<LocationReferencePoint> list, double d8, double d10) {
        this.points = list;
        this.positiveOffset = d8;
        this.negativeOffset = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineLocationReference lineLocationReference = (LineLocationReference) obj;
        return Objects.equals(this.points, lineLocationReference.points) && PartialEq.compare(this.positiveOffset, lineLocationReference.positiveOffset) && PartialEq.compare(this.negativeOffset, lineLocationReference.negativeOffset);
    }

    public double getNegativeOffset() {
        return this.negativeOffset;
    }

    public List<LocationReferencePoint> getPoints() {
        return this.points;
    }

    public double getPositiveOffset() {
        return this.positiveOffset;
    }

    public int hashCode() {
        return Objects.hash(this.points, Double.valueOf(this.positiveOffset), Double.valueOf(this.negativeOffset));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[points: ");
        b.v(", positiveOffset: ", sb2, this.points);
        b.m(this.positiveOffset, sb2, ", negativeOffset: ");
        return b.f(this.negativeOffset, sb2, "]");
    }
}
