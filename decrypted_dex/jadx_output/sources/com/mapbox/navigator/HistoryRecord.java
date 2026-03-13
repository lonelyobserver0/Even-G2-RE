package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class HistoryRecord implements Serializable {
    private final GetStatusHistoryRecord getStatus;
    private final PushHistoryRecord pushHistory;
    private final SetRouteHistoryRecord setRoute;
    private final long timestampNanoseconds;
    private final HistoryRecordType type;
    private final UpdateLocationHistoryRecord updateLocation;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public HistoryRecord(long j, HistoryRecordType historyRecordType, UpdateLocationHistoryRecord updateLocationHistoryRecord, GetStatusHistoryRecord getStatusHistoryRecord, SetRouteHistoryRecord setRouteHistoryRecord, PushHistoryRecord pushHistoryRecord) {
        this.timestampNanoseconds = j;
        this.type = historyRecordType;
        this.updateLocation = updateLocationHistoryRecord;
        this.getStatus = getStatusHistoryRecord;
        this.setRoute = setRouteHistoryRecord;
        this.pushHistory = pushHistoryRecord;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HistoryRecord historyRecord = (HistoryRecord) obj;
        return this.timestampNanoseconds == historyRecord.timestampNanoseconds && Objects.equals(this.type, historyRecord.type) && Objects.equals(this.updateLocation, historyRecord.updateLocation) && Objects.equals(this.getStatus, historyRecord.getStatus) && Objects.equals(this.setRoute, historyRecord.setRoute) && Objects.equals(this.pushHistory, historyRecord.pushHistory);
    }

    public GetStatusHistoryRecord getGetStatus() {
        return this.getStatus;
    }

    public PushHistoryRecord getPushHistory() {
        return this.pushHistory;
    }

    public SetRouteHistoryRecord getSetRoute() {
        return this.setRoute;
    }

    public long getTimestampNanoseconds() {
        return this.timestampNanoseconds;
    }

    public HistoryRecordType getType() {
        return this.type;
    }

    public UpdateLocationHistoryRecord getUpdateLocation() {
        return this.updateLocation;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.timestampNanoseconds), this.type, this.updateLocation, this.getStatus, this.setRoute, this.pushHistory);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[timestampNanoseconds: ");
        b.p(this.timestampNanoseconds, sb2, ", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", updateLocation: ");
        sb2.append(RecordUtils.fieldToString(this.updateLocation));
        sb2.append(", getStatus: ");
        sb2.append(RecordUtils.fieldToString(this.getStatus));
        sb2.append(", setRoute: ");
        sb2.append(RecordUtils.fieldToString(this.setRoute));
        sb2.append(", pushHistory: ");
        sb2.append(RecordUtils.fieldToString(this.pushHistory));
        sb2.append("]");
        return sb2.toString();
    }
}
