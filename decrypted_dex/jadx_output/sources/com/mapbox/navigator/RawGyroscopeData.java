package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RawGyroscopeData implements Serializable {
    private final long monotonicTimestampNanoseconds;
    private final Point3d rotationRate;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RawGyroscopeData(Point3d point3d, long j) {
        this.rotationRate = point3d;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RawGyroscopeData rawGyroscopeData = (RawGyroscopeData) obj;
        return Objects.equals(this.rotationRate, rawGyroscopeData.rotationRate) && this.monotonicTimestampNanoseconds == rawGyroscopeData.monotonicTimestampNanoseconds;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public Point3d getRotationRate() {
        return this.rotationRate;
    }

    public int hashCode() {
        return Objects.hash(this.rotationRate, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[rotationRate: ");
        sb2.append(RecordUtils.fieldToString(this.rotationRate));
        sb2.append(", monotonicTimestampNanoseconds: ");
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
