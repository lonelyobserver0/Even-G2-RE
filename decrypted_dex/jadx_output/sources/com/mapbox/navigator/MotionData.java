package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class MotionData implements Serializable {
    private final AttitudeData attitude;
    private final Point3d gravityAcceleration;
    private final float heading;
    private final Point3d magneticField;
    private final long monotonicTimestampNanoseconds;
    private final Point3d rotationRate;
    private final Point3d userAcceleration;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MotionData(AttitudeData attitudeData, Point3d point3d, Point3d point3d2, Point3d point3d3, Point3d point3d4, float f10, long j) {
        this.attitude = attitudeData;
        this.rotationRate = point3d;
        this.gravityAcceleration = point3d2;
        this.userAcceleration = point3d3;
        this.magneticField = point3d4;
        this.heading = f10;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MotionData motionData = (MotionData) obj;
        return Objects.equals(this.attitude, motionData.attitude) && Objects.equals(this.rotationRate, motionData.rotationRate) && Objects.equals(this.gravityAcceleration, motionData.gravityAcceleration) && Objects.equals(this.userAcceleration, motionData.userAcceleration) && Objects.equals(this.magneticField, motionData.magneticField) && PartialEq.compare(this.heading, motionData.heading) && this.monotonicTimestampNanoseconds == motionData.monotonicTimestampNanoseconds;
    }

    @Deprecated
    public AttitudeData getAttitude() {
        return this.attitude;
    }

    @Deprecated
    public Point3d getGravityAcceleration() {
        return this.gravityAcceleration;
    }

    @Deprecated
    public float getHeading() {
        return this.heading;
    }

    @Deprecated
    public Point3d getMagneticField() {
        return this.magneticField;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    @Deprecated
    public Point3d getRotationRate() {
        return this.rotationRate;
    }

    @Deprecated
    public Point3d getUserAcceleration() {
        return this.userAcceleration;
    }

    public int hashCode() {
        return Objects.hash(this.attitude, this.rotationRate, this.gravityAcceleration, this.userAcceleration, this.magneticField, Float.valueOf(this.heading), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[attitude: ");
        sb2.append(RecordUtils.fieldToString(this.attitude));
        sb2.append(", rotationRate: ");
        sb2.append(RecordUtils.fieldToString(this.rotationRate));
        sb2.append(", gravityAcceleration: ");
        sb2.append(RecordUtils.fieldToString(this.gravityAcceleration));
        sb2.append(", userAcceleration: ");
        sb2.append(RecordUtils.fieldToString(this.userAcceleration));
        sb2.append(", magneticField: ");
        sb2.append(RecordUtils.fieldToString(this.magneticField));
        sb2.append(", heading: ");
        b.n(this.heading, sb2, ", monotonicTimestampNanoseconds: ");
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
