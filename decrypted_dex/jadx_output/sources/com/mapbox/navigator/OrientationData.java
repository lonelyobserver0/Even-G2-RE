package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class OrientationData implements Serializable {
    private final long monotonicTimestampNanoseconds;
    private final Float pitch;
    private final Float roll;
    private final Float yaw;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public OrientationData(Float f10, Float f11, Float f12, long j) {
        this.pitch = f10;
        this.yaw = f11;
        this.roll = f12;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrientationData orientationData = (OrientationData) obj;
        return Objects.equals(this.pitch, orientationData.pitch) && Objects.equals(this.yaw, orientationData.yaw) && Objects.equals(this.roll, orientationData.roll) && this.monotonicTimestampNanoseconds == orientationData.monotonicTimestampNanoseconds;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public Float getPitch() {
        return this.pitch;
    }

    public Float getRoll() {
        return this.roll;
    }

    public Float getYaw() {
        return this.yaw;
    }

    public int hashCode() {
        return Objects.hash(this.pitch, this.yaw, this.roll, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[pitch: ");
        b.s(this.pitch, sb2, ", yaw: ");
        b.s(this.yaw, sb2, ", roll: ");
        b.s(this.roll, sb2, ", monotonicTimestampNanoseconds: ");
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
