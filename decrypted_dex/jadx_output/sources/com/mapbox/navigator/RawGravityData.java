package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RawGravityData implements Serializable {
    private final Point3d gravity;
    private final long monotonicTimestampNanoseconds;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RawGravityData(Point3d point3d, long j) {
        this.gravity = point3d;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RawGravityData rawGravityData = (RawGravityData) obj;
        return Objects.equals(this.gravity, rawGravityData.gravity) && this.monotonicTimestampNanoseconds == rawGravityData.monotonicTimestampNanoseconds;
    }

    public Point3d getGravity() {
        return this.gravity;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public int hashCode() {
        return Objects.hash(this.gravity, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[gravity: ");
        sb2.append(RecordUtils.fieldToString(this.gravity));
        sb2.append(", monotonicTimestampNanoseconds: ");
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
