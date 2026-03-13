package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class DurationStatistics implements Serializable {
    private final double maxMillis;
    private final double medianMillis;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public DurationStatistics(double d8, double d10) {
        this.maxMillis = d8;
        this.medianMillis = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DurationStatistics.class != obj.getClass()) {
            return false;
        }
        DurationStatistics durationStatistics = (DurationStatistics) obj;
        return PartialEq.compare(this.maxMillis, durationStatistics.maxMillis) && PartialEq.compare(this.medianMillis, durationStatistics.medianMillis);
    }

    public double getMaxMillis() {
        return this.maxMillis;
    }

    public double getMedianMillis() {
        return this.medianMillis;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.maxMillis), Double.valueOf(this.medianMillis));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[maxMillis: ");
        com.mapbox.common.b.m(this.maxMillis, sb2, ", medianMillis: ");
        return com.mapbox.common.b.f(this.medianMillis, sb2, "]");
    }
}
