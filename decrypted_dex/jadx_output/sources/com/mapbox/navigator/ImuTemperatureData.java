package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ImuTemperatureData implements Serializable {
    private final long monotonicTimestampNanoseconds;
    private final float temperature;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ImuTemperatureData(float f10, long j) {
        this.temperature = f10;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImuTemperatureData imuTemperatureData = (ImuTemperatureData) obj;
        return PartialEq.compare(this.temperature, imuTemperatureData.temperature) && this.monotonicTimestampNanoseconds == imuTemperatureData.monotonicTimestampNanoseconds;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public float getTemperature() {
        return this.temperature;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.temperature), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[temperature: ");
        b.n(this.temperature, sb2, ", monotonicTimestampNanoseconds: ");
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
