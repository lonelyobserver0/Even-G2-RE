package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AssistedDrivingData implements Serializable {
    private final AssistedDrivingLaneChangeDirection direction;
    private final AssistedDrivingState state;
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AssistedDrivingData(AssistedDrivingState assistedDrivingState, AssistedDrivingLaneChangeDirection assistedDrivingLaneChangeDirection, Date date) {
        this.state = assistedDrivingState;
        this.direction = assistedDrivingLaneChangeDirection;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssistedDrivingData assistedDrivingData = (AssistedDrivingData) obj;
        return Objects.equals(this.state, assistedDrivingData.state) && Objects.equals(this.direction, assistedDrivingData.direction) && Objects.equals(this.timestamp, assistedDrivingData.timestamp);
    }

    public AssistedDrivingLaneChangeDirection getDirection() {
        return this.direction;
    }

    public AssistedDrivingState getState() {
        return this.state;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.state, this.direction, this.timestamp);
    }

    public String toString() {
        return "[state: " + RecordUtils.fieldToString(this.state) + ", direction: " + RecordUtils.fieldToString(this.direction) + ", timestamp: " + RecordUtils.fieldToString(this.timestamp) + "]";
    }
}
