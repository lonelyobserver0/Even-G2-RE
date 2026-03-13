package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RawAccelerometerData implements Serializable {
    private final Point3d acceleration;
    private final long monotonicTimestampNanoseconds;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RawAccelerometerData(Point3d point3d, long j) {
        this.acceleration = point3d;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RawAccelerometerData rawAccelerometerData = (RawAccelerometerData) obj;
        return Objects.equals(this.acceleration, rawAccelerometerData.acceleration) && this.monotonicTimestampNanoseconds == rawAccelerometerData.monotonicTimestampNanoseconds;
    }

    public Point3d getAcceleration() {
        return this.acceleration;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public int hashCode() {
        return Objects.hash(this.acceleration, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[acceleration: ");
        sb2.append(RecordUtils.fieldToString(this.acceleration));
        sb2.append(", monotonicTimestampNanoseconds: ");
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
