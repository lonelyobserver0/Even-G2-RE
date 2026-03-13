package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AltimeterData implements Serializable {
    private final long monotonicTimestampNanoseconds;
    private final float pressure;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AltimeterData(float f10, long j) {
        this.pressure = f10;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AltimeterData altimeterData = (AltimeterData) obj;
        return PartialEq.compare(this.pressure, altimeterData.pressure) && this.monotonicTimestampNanoseconds == altimeterData.monotonicTimestampNanoseconds;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public float getPressure() {
        return this.pressure;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.pressure), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[pressure: ");
        b.n(this.pressure, sb2, ", monotonicTimestampNanoseconds: ");
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
