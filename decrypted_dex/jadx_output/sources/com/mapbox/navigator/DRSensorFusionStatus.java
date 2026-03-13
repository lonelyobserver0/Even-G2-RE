package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DRSensorFusionStatus implements Serializable {
    private final byte progressCorrectionBuckets;
    private final byte progressInitDistance;
    private final DRSensorFusionState state;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public DRSensorFusionStatus(DRSensorFusionState dRSensorFusionState, byte b2, byte b10) {
        this.state = dRSensorFusionState;
        this.progressInitDistance = b2;
        this.progressCorrectionBuckets = b10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DRSensorFusionStatus dRSensorFusionStatus = (DRSensorFusionStatus) obj;
        return Objects.equals(this.state, dRSensorFusionStatus.state) && this.progressInitDistance == dRSensorFusionStatus.progressInitDistance && this.progressCorrectionBuckets == dRSensorFusionStatus.progressCorrectionBuckets;
    }

    public byte getProgressCorrectionBuckets() {
        return this.progressCorrectionBuckets;
    }

    public byte getProgressInitDistance() {
        return this.progressInitDistance;
    }

    public DRSensorFusionState getState() {
        return this.state;
    }

    public int hashCode() {
        return Objects.hash(this.state, Byte.valueOf(this.progressInitDistance), Byte.valueOf(this.progressCorrectionBuckets));
    }

    public String toString() {
        return "[state: " + RecordUtils.fieldToString(this.state) + ", progressInitDistance: " + RecordUtils.fieldToString(Byte.valueOf(this.progressInitDistance)) + ", progressCorrectionBuckets: " + RecordUtils.fieldToString(Byte.valueOf(this.progressCorrectionBuckets)) + "]";
    }
}
