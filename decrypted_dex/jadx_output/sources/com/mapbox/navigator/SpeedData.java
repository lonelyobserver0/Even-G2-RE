package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SpeedData implements Serializable {
    private final long monotonicTimestampNanoseconds;
    private final float speed;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SpeedData(float f10, long j) {
        this.speed = f10;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpeedData speedData = (SpeedData) obj;
        return PartialEq.compare(this.speed, speedData.speed) && this.monotonicTimestampNanoseconds == speedData.monotonicTimestampNanoseconds;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public float getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.speed), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[speed: ");
        b.n(this.speed, sb2, ", monotonicTimestampNanoseconds: ");
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
