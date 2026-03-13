package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LaneSensorInfo implements Serializable {
    private final byte currentLaneIndex;
    private final byte laneCount;
    private final long monotonicTimestampNanoseconds;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneSensorInfo(byte b2, byte b10, long j) {
        this.currentLaneIndex = b2;
        this.laneCount = b10;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneSensorInfo laneSensorInfo = (LaneSensorInfo) obj;
        return this.currentLaneIndex == laneSensorInfo.currentLaneIndex && this.laneCount == laneSensorInfo.laneCount && this.monotonicTimestampNanoseconds == laneSensorInfo.monotonicTimestampNanoseconds;
    }

    public byte getCurrentLaneIndex() {
        return this.currentLaneIndex;
    }

    public byte getLaneCount() {
        return this.laneCount;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public int hashCode() {
        return Objects.hash(Byte.valueOf(this.currentLaneIndex), Byte.valueOf(this.laneCount), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[currentLaneIndex: ");
        sb2.append(RecordUtils.fieldToString(Byte.valueOf(this.currentLaneIndex)));
        sb2.append(", laneCount: ");
        sb2.append(RecordUtils.fieldToString(Byte.valueOf(this.laneCount)));
        sb2.append(", monotonicTimestampNanoseconds: ");
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
