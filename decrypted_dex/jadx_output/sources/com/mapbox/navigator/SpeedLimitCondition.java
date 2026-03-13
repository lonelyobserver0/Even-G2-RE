package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SpeedLimitCondition implements Serializable {
    private final byte lane;
    private final VehicleType vehicleType;
    private final List<Weather> weather;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SpeedLimitCondition(List<Weather> list, byte b2, VehicleType vehicleType) {
        this.weather = list;
        this.lane = b2;
        this.vehicleType = vehicleType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpeedLimitCondition speedLimitCondition = (SpeedLimitCondition) obj;
        return Objects.equals(this.weather, speedLimitCondition.weather) && this.lane == speedLimitCondition.lane && Objects.equals(this.vehicleType, speedLimitCondition.vehicleType);
    }

    public byte getLane() {
        return this.lane;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public List<Weather> getWeather() {
        return this.weather;
    }

    public int hashCode() {
        return Objects.hash(this.weather, Byte.valueOf(this.lane), this.vehicleType);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[weather: ");
        b.v(", lane: ", sb2, this.weather);
        sb2.append(RecordUtils.fieldToString(Byte.valueOf(this.lane)));
        sb2.append(", vehicleType: ");
        sb2.append(RecordUtils.fieldToString(this.vehicleType));
        sb2.append("]");
        return sb2.toString();
    }
}
