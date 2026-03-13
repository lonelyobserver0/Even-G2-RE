package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class EvStateData implements Serializable {
    private final Integer auxiliaryConsumption;
    private final List<CurveElement> energyConsumptionCurve;
    private final int evInitialCharge;
    private final Integer evPreConditioningTime;
    private final List<CurveElement> evUnconditionedChargingCurve;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public EvStateData(int i3, List<CurveElement> list, Integer num, Integer num2, List<CurveElement> list2) {
        this.evInitialCharge = i3;
        this.energyConsumptionCurve = list;
        this.auxiliaryConsumption = num;
        this.evPreConditioningTime = num2;
        this.evUnconditionedChargingCurve = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvStateData evStateData = (EvStateData) obj;
        return this.evInitialCharge == evStateData.evInitialCharge && Objects.equals(this.energyConsumptionCurve, evStateData.energyConsumptionCurve) && Objects.equals(this.auxiliaryConsumption, evStateData.auxiliaryConsumption) && Objects.equals(this.evPreConditioningTime, evStateData.evPreConditioningTime) && Objects.equals(this.evUnconditionedChargingCurve, evStateData.evUnconditionedChargingCurve);
    }

    public Integer getAuxiliaryConsumption() {
        return this.auxiliaryConsumption;
    }

    public List<CurveElement> getEnergyConsumptionCurve() {
        return this.energyConsumptionCurve;
    }

    public int getEvInitialCharge() {
        return this.evInitialCharge;
    }

    public Integer getEvPreConditioningTime() {
        return this.evPreConditioningTime;
    }

    public List<CurveElement> getEvUnconditionedChargingCurve() {
        return this.evUnconditionedChargingCurve;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.evInitialCharge), this.energyConsumptionCurve, this.auxiliaryConsumption, this.evPreConditioningTime, this.evUnconditionedChargingCurve);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[evInitialCharge: ");
        b.o(this.evInitialCharge, ", energyConsumptionCurve: ", sb2);
        b.v(", auxiliaryConsumption: ", sb2, this.energyConsumptionCurve);
        b.t(this.auxiliaryConsumption, sb2, ", evPreConditioningTime: ");
        b.t(this.evPreConditioningTime, sb2, ", evUnconditionedChargingCurve: ");
        return b.i("]", sb2, this.evUnconditionedChargingCurve);
    }

    public EvStateData(List<CurveElement> list, Integer num, Integer num2, List<CurveElement> list2) {
        this.energyConsumptionCurve = list;
        this.auxiliaryConsumption = num;
        this.evPreConditioningTime = num2;
        this.evUnconditionedChargingCurve = list2;
        this.evInitialCharge = 0;
    }
}
