package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SpeedLimit implements Serializable {
    private final SpeedLimitSign localeSign;
    private final SpeedLimitUnit localeUnit;
    private final Integer speed;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SpeedLimit(Integer num, SpeedLimitUnit speedLimitUnit, SpeedLimitSign speedLimitSign) {
        this.speed = num;
        this.localeUnit = speedLimitUnit;
        this.localeSign = speedLimitSign;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpeedLimit speedLimit = (SpeedLimit) obj;
        return Objects.equals(this.speed, speedLimit.speed) && Objects.equals(this.localeUnit, speedLimit.localeUnit) && Objects.equals(this.localeSign, speedLimit.localeSign);
    }

    public SpeedLimitSign getLocaleSign() {
        return this.localeSign;
    }

    public SpeedLimitUnit getLocaleUnit() {
        return this.localeUnit;
    }

    public Integer getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        return Objects.hash(this.speed, this.localeUnit, this.localeSign);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[speed: ");
        b.t(this.speed, sb2, ", localeUnit: ");
        sb2.append(RecordUtils.fieldToString(this.localeUnit));
        sb2.append(", localeSign: ");
        sb2.append(RecordUtils.fieldToString(this.localeSign));
        sb2.append("]");
        return sb2.toString();
    }
}
