package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class GroupPerformanceStatistics implements Serializable {
    private final double durationMillis;
    private final String name;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public GroupPerformanceStatistics(double d8, String str) {
        this.durationMillis = d8;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GroupPerformanceStatistics.class != obj.getClass()) {
            return false;
        }
        GroupPerformanceStatistics groupPerformanceStatistics = (GroupPerformanceStatistics) obj;
        return PartialEq.compare(this.durationMillis, groupPerformanceStatistics.durationMillis) && Objects.equals(this.name, groupPerformanceStatistics.name);
    }

    public double getDurationMillis() {
        return this.durationMillis;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.durationMillis), this.name);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[durationMillis: ");
        com.mapbox.common.b.m(this.durationMillis, sb2, ", name: ");
        return Xa.h.t(sb2, this.name, "]");
    }
}
