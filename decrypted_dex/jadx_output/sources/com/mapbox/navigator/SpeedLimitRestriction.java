package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SpeedLimitRestriction implements Serializable {
    private final String dateTimeCondition;
    private final List<Byte> lanes;
    private final List<VehicleType> vehicleTypes;
    private final List<Weather> weather;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SpeedLimitRestriction(List<Weather> list, String str, List<VehicleType> list2, List<Byte> list3) {
        this.weather = list;
        this.dateTimeCondition = str;
        this.vehicleTypes = list2;
        this.lanes = list3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpeedLimitRestriction speedLimitRestriction = (SpeedLimitRestriction) obj;
        return Objects.equals(this.weather, speedLimitRestriction.weather) && Objects.equals(this.dateTimeCondition, speedLimitRestriction.dateTimeCondition) && Objects.equals(this.vehicleTypes, speedLimitRestriction.vehicleTypes) && Objects.equals(this.lanes, speedLimitRestriction.lanes);
    }

    public String getDateTimeCondition() {
        return this.dateTimeCondition;
    }

    public List<Byte> getLanes() {
        return this.lanes;
    }

    public List<VehicleType> getVehicleTypes() {
        return this.vehicleTypes;
    }

    public List<Weather> getWeather() {
        return this.weather;
    }

    public int hashCode() {
        return Objects.hash(this.weather, this.dateTimeCondition, this.vehicleTypes, this.lanes);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[weather: ");
        b.v(", dateTimeCondition: ", sb2, this.weather);
        h.z(sb2, this.dateTimeCondition, ", vehicleTypes: ");
        b.v(", lanes: ", sb2, this.vehicleTypes);
        return b.i("]", sb2, this.lanes);
    }
}
