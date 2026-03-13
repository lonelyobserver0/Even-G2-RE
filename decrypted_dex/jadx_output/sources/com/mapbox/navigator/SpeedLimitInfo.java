package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SpeedLimitInfo implements Serializable {
    private final SpeedLimitRestriction restriction;
    private final SpeedLimitType type;
    private final SpeedLimitUnit unit;
    private final int value;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SpeedLimitInfo(int i3, SpeedLimitUnit speedLimitUnit, SpeedLimitType speedLimitType, SpeedLimitRestriction speedLimitRestriction) {
        this.value = i3;
        this.unit = speedLimitUnit;
        this.type = speedLimitType;
        this.restriction = speedLimitRestriction;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpeedLimitInfo speedLimitInfo = (SpeedLimitInfo) obj;
        return this.value == speedLimitInfo.value && Objects.equals(this.unit, speedLimitInfo.unit) && Objects.equals(this.type, speedLimitInfo.type) && Objects.equals(this.restriction, speedLimitInfo.restriction);
    }

    public SpeedLimitRestriction getRestriction() {
        return this.restriction;
    }

    public SpeedLimitType getType() {
        return this.type;
    }

    public SpeedLimitUnit getUnit() {
        return this.unit;
    }

    public int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.value), this.unit, this.type, this.restriction);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[value: ");
        b.o(this.value, ", unit: ", sb2);
        sb2.append(RecordUtils.fieldToString(this.unit));
        sb2.append(", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", restriction: ");
        sb2.append(RecordUtils.fieldToString(this.restriction));
        sb2.append("]");
        return sb2.toString();
    }
}
