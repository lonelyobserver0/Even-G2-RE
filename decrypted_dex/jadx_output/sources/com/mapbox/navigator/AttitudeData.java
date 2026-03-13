package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AttitudeData implements Serializable {
    private final float pitch;
    private final float roll;
    private final float yaw;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AttitudeData(float f10, float f11, float f12) {
        this.pitch = f10;
        this.yaw = f11;
        this.roll = f12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttitudeData attitudeData = (AttitudeData) obj;
        return PartialEq.compare(this.pitch, attitudeData.pitch) && PartialEq.compare(this.yaw, attitudeData.yaw) && PartialEq.compare(this.roll, attitudeData.roll);
    }

    public float getPitch() {
        return this.pitch;
    }

    public float getRoll() {
        return this.roll;
    }

    public float getYaw() {
        return this.yaw;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.pitch), Float.valueOf(this.yaw), Float.valueOf(this.roll));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[pitch: ");
        b.n(this.pitch, sb2, ", yaw: ");
        b.n(this.yaw, sb2, ", roll: ");
        sb2.append(RecordUtils.fieldToString(Float.valueOf(this.roll)));
        sb2.append("]");
        return sb2.toString();
    }
}
