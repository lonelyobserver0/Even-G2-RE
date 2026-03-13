package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class OdometryData implements Serializable {
    private final long monotonicTimestampNanoseconds;

    /* renamed from: x, reason: collision with root package name */
    private final float f12537x;

    /* renamed from: y, reason: collision with root package name */
    private final float f12538y;
    private final float yawAngle;

    /* renamed from: z, reason: collision with root package name */
    private final float f12539z;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public OdometryData(float f10, float f11, float f12, float f13, long j) {
        this.f12537x = f10;
        this.f12538y = f11;
        this.f12539z = f12;
        this.yawAngle = f13;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OdometryData odometryData = (OdometryData) obj;
        return PartialEq.compare(this.f12537x, odometryData.f12537x) && PartialEq.compare(this.f12538y, odometryData.f12538y) && PartialEq.compare(this.f12539z, odometryData.f12539z) && PartialEq.compare(this.yawAngle, odometryData.yawAngle) && this.monotonicTimestampNanoseconds == odometryData.monotonicTimestampNanoseconds;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public float getX() {
        return this.f12537x;
    }

    public float getY() {
        return this.f12538y;
    }

    public float getYawAngle() {
        return this.yawAngle;
    }

    public float getZ() {
        return this.f12539z;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.f12537x), Float.valueOf(this.f12538y), Float.valueOf(this.f12539z), Float.valueOf(this.yawAngle), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[x: ");
        b.n(this.f12537x, sb2, ", y: ");
        b.n(this.f12538y, sb2, ", z: ");
        b.n(this.f12539z, sb2, ", yawAngle: ");
        b.n(this.yawAngle, sb2, ", monotonicTimestampNanoseconds: ");
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
