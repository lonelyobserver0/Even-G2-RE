package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteLaneDivergency implements Serializable {
    private final double length;
    private final long numberOfLanes;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteLaneDivergency(long j, double d8) {
        this.numberOfLanes = j;
        this.length = d8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteLaneDivergency routeLaneDivergency = (RouteLaneDivergency) obj;
        return this.numberOfLanes == routeLaneDivergency.numberOfLanes && PartialEq.compare(this.length, routeLaneDivergency.length);
    }

    public double getLength() {
        return this.length;
    }

    public long getNumberOfLanes() {
        return this.numberOfLanes;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.numberOfLanes), Double.valueOf(this.length));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[numberOfLanes: ");
        b.p(this.numberOfLanes, sb2, ", length: ");
        return b.f(this.length, sb2, "]");
    }
}
