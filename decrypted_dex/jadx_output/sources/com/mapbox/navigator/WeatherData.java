package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class WeatherData implements Serializable {
    private final List<Weather> conditions;
    private final WeatherDetail detail;
    private final long monotonicTimestampNanoseconds;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public WeatherData(List<Weather> list, WeatherDetail weatherDetail, long j) {
        this.conditions = list;
        this.detail = weatherDetail;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WeatherData weatherData = (WeatherData) obj;
        return Objects.equals(this.conditions, weatherData.conditions) && Objects.equals(this.detail, weatherData.detail) && this.monotonicTimestampNanoseconds == weatherData.monotonicTimestampNanoseconds;
    }

    public List<Weather> getConditions() {
        return this.conditions;
    }

    public WeatherDetail getDetail() {
        return this.detail;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public int hashCode() {
        return Objects.hash(this.conditions, this.detail, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[conditions: ");
        b.v(", detail: ", sb2, this.conditions);
        sb2.append(RecordUtils.fieldToString(this.detail));
        sb2.append(", monotonicTimestampNanoseconds: ");
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
