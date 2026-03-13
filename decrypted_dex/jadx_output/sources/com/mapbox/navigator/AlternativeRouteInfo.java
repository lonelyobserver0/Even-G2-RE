package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AlternativeRouteInfo implements Serializable {
    private final double distance;
    private final double duration;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AlternativeRouteInfo(double d8, double d10) {
        this.distance = d8;
        this.duration = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlternativeRouteInfo alternativeRouteInfo = (AlternativeRouteInfo) obj;
        return PartialEq.compare(this.distance, alternativeRouteInfo.distance) && PartialEq.compare(this.duration, alternativeRouteInfo.duration);
    }

    public double getDistance() {
        return this.distance;
    }

    public double getDuration() {
        return this.duration;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.distance), Double.valueOf(this.duration));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[distance: ");
        b.m(this.distance, sb2, ", duration: ");
        return b.f(this.duration, sb2, "]");
    }
}
