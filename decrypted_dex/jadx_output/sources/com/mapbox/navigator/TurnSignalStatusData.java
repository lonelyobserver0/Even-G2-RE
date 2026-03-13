package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TurnSignalStatusData implements Serializable {
    private final Date timestamp;
    private final TurnSignalStatus turnSignalStatus;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public TurnSignalStatusData(TurnSignalStatus turnSignalStatus, Date date) {
        this.turnSignalStatus = turnSignalStatus;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TurnSignalStatusData turnSignalStatusData = (TurnSignalStatusData) obj;
        return Objects.equals(this.turnSignalStatus, turnSignalStatusData.turnSignalStatus) && Objects.equals(this.timestamp, turnSignalStatusData.timestamp);
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public TurnSignalStatus getTurnSignalStatus() {
        return this.turnSignalStatus;
    }

    public int hashCode() {
        return Objects.hash(this.turnSignalStatus, this.timestamp);
    }

    public String toString() {
        return "[turnSignalStatus: " + RecordUtils.fieldToString(this.turnSignalStatus) + ", timestamp: " + RecordUtils.fieldToString(this.timestamp) + "]";
    }
}
