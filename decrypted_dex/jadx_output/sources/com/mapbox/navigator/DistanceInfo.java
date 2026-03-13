package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DistanceInfo implements Serializable {
    private final double distance;
    private final double length;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public DistanceInfo(double d8, double d10) {
        this.distance = d8;
        this.length = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistanceInfo distanceInfo = (DistanceInfo) obj;
        return PartialEq.compare(this.distance, distanceInfo.distance) && PartialEq.compare(this.length, distanceInfo.length);
    }

    public double getDistance() {
        return this.distance;
    }

    public double getLength() {
        return this.length;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.distance), Double.valueOf(this.length));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[distance: ");
        b.m(this.distance, sb2, ", length: ");
        return b.f(this.length, sb2, "]");
    }
}
