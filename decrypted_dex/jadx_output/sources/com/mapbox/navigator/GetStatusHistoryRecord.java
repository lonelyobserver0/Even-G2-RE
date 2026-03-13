package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GetStatusHistoryRecord implements Serializable {
    private final long monotonicTimestampNanoseconds;
    private final NavigationStatus result;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GetStatusHistoryRecord(long j, NavigationStatus navigationStatus) {
        this.monotonicTimestampNanoseconds = j;
        this.result = navigationStatus;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetStatusHistoryRecord getStatusHistoryRecord = (GetStatusHistoryRecord) obj;
        return this.monotonicTimestampNanoseconds == getStatusHistoryRecord.monotonicTimestampNanoseconds && Objects.equals(this.result, getStatusHistoryRecord.result);
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public NavigationStatus getResult() {
        return this.result;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.monotonicTimestampNanoseconds), this.result);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[monotonicTimestampNanoseconds: ");
        b.p(this.monotonicTimestampNanoseconds, sb2, ", result: ");
        sb2.append(RecordUtils.fieldToString(this.result));
        sb2.append("]");
        return sb2.toString();
    }
}
