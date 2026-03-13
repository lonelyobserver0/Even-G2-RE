package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CompassData implements Serializable {
    private final Float headingAccuracy;
    private final Float magneticHeading;
    private final long monotonicTimestampNanoseconds;
    private final Point3d rawGeomagneticData;
    private final Float trueHeading;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public CompassData(Float f10, Float f11, Float f12, Point3d point3d, long j) {
        this.magneticHeading = f10;
        this.trueHeading = f11;
        this.headingAccuracy = f12;
        this.rawGeomagneticData = point3d;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompassData compassData = (CompassData) obj;
        return Objects.equals(this.magneticHeading, compassData.magneticHeading) && Objects.equals(this.trueHeading, compassData.trueHeading) && Objects.equals(this.headingAccuracy, compassData.headingAccuracy) && Objects.equals(this.rawGeomagneticData, compassData.rawGeomagneticData) && this.monotonicTimestampNanoseconds == compassData.monotonicTimestampNanoseconds;
    }

    public Float getHeadingAccuracy() {
        return this.headingAccuracy;
    }

    public Float getMagneticHeading() {
        return this.magneticHeading;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public Point3d getRawGeomagneticData() {
        return this.rawGeomagneticData;
    }

    public Float getTrueHeading() {
        return this.trueHeading;
    }

    public int hashCode() {
        return Objects.hash(this.magneticHeading, this.trueHeading, this.headingAccuracy, this.rawGeomagneticData, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[magneticHeading: ");
        b.s(this.magneticHeading, sb2, ", trueHeading: ");
        b.s(this.trueHeading, sb2, ", headingAccuracy: ");
        b.s(this.headingAccuracy, sb2, ", rawGeomagneticData: ");
        sb2.append(RecordUtils.fieldToString(this.rawGeomagneticData));
        sb2.append(", monotonicTimestampNanoseconds: ");
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
