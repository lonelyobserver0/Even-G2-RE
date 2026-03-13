package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CorrectedLocationData implements Serializable {
    private final DRSensorFusionStatus drSensorFusionStatus;
    private final IMUDerivedData imuData;
    private final boolean isDeadReckoning;
    private final boolean isStill;
    private final FixLocation location;
    private final Integer satellitesCount;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public CorrectedLocationData(FixLocation fixLocation, boolean z2, IMUDerivedData iMUDerivedData, boolean z10, Integer num, DRSensorFusionStatus dRSensorFusionStatus) {
        this.location = fixLocation;
        this.isStill = z2;
        this.imuData = iMUDerivedData;
        this.isDeadReckoning = z10;
        this.satellitesCount = num;
        this.drSensorFusionStatus = dRSensorFusionStatus;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CorrectedLocationData correctedLocationData = (CorrectedLocationData) obj;
        return Objects.equals(this.location, correctedLocationData.location) && this.isStill == correctedLocationData.isStill && Objects.equals(this.imuData, correctedLocationData.imuData) && this.isDeadReckoning == correctedLocationData.isDeadReckoning && Objects.equals(this.satellitesCount, correctedLocationData.satellitesCount) && Objects.equals(this.drSensorFusionStatus, correctedLocationData.drSensorFusionStatus);
    }

    public DRSensorFusionStatus getDrSensorFusionStatus() {
        return this.drSensorFusionStatus;
    }

    public IMUDerivedData getImuData() {
        return this.imuData;
    }

    public boolean getIsDeadReckoning() {
        return this.isDeadReckoning;
    }

    public boolean getIsStill() {
        return this.isStill;
    }

    public FixLocation getLocation() {
        return this.location;
    }

    public Integer getSatellitesCount() {
        return this.satellitesCount;
    }

    public int hashCode() {
        return Objects.hash(this.location, Boolean.valueOf(this.isStill), this.imuData, Boolean.valueOf(this.isDeadReckoning), this.satellitesCount, this.drSensorFusionStatus);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[location: ");
        sb2.append(RecordUtils.fieldToString(this.location));
        sb2.append(", isStill: ");
        h.A(this.isStill, sb2, ", imuData: ");
        sb2.append(RecordUtils.fieldToString(this.imuData));
        sb2.append(", isDeadReckoning: ");
        h.A(this.isDeadReckoning, sb2, ", satellitesCount: ");
        b.t(this.satellitesCount, sb2, ", drSensorFusionStatus: ");
        sb2.append(RecordUtils.fieldToString(this.drSensorFusionStatus));
        sb2.append("]");
        return sb2.toString();
    }
}
