package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ProjectedMeters implements Serializable {
    private final double easting;
    private final double northing;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ProjectedMeters(double d8, double d10) {
        this.northing = d8;
        this.easting = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProjectedMeters.class != obj.getClass()) {
            return false;
        }
        ProjectedMeters projectedMeters = (ProjectedMeters) obj;
        return PartialEq.compare(this.northing, projectedMeters.northing) && PartialEq.compare(this.easting, projectedMeters.easting);
    }

    public double getEasting() {
        return this.easting;
    }

    public double getNorthing() {
        return this.northing;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.northing), Double.valueOf(this.easting));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[northing: ");
        com.mapbox.common.b.m(this.northing, sb2, ", easting: ");
        return com.mapbox.common.b.f(this.easting, sb2, "]");
    }
}
