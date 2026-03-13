package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadObjectEdgeLocation implements Serializable {
    private final double percentAlongBegin;
    private final double percentAlongEnd;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadObjectEdgeLocation(double d8, double d10) {
        this.percentAlongBegin = d8;
        this.percentAlongEnd = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadObjectEdgeLocation roadObjectEdgeLocation = (RoadObjectEdgeLocation) obj;
        return PartialEq.compare(this.percentAlongBegin, roadObjectEdgeLocation.percentAlongBegin) && PartialEq.compare(this.percentAlongEnd, roadObjectEdgeLocation.percentAlongEnd);
    }

    public double getPercentAlongBegin() {
        return this.percentAlongBegin;
    }

    public double getPercentAlongEnd() {
        return this.percentAlongEnd;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.percentAlongBegin), Double.valueOf(this.percentAlongEnd));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[percentAlongBegin: ");
        b.m(this.percentAlongBegin, sb2, ", percentAlongEnd: ");
        return b.f(this.percentAlongEnd, sb2, "]");
    }
}
