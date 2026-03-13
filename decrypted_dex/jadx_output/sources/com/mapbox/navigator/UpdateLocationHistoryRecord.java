package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class UpdateLocationHistoryRecord implements Serializable {
    private final FixLocation location;
    private final boolean result;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public UpdateLocationHistoryRecord(FixLocation fixLocation, boolean z2) {
        this.location = fixLocation;
        this.result = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLocationHistoryRecord updateLocationHistoryRecord = (UpdateLocationHistoryRecord) obj;
        return Objects.equals(this.location, updateLocationHistoryRecord.location) && this.result == updateLocationHistoryRecord.result;
    }

    public FixLocation getLocation() {
        return this.location;
    }

    public boolean getResult() {
        return this.result;
    }

    public int hashCode() {
        return Objects.hash(this.location, Boolean.valueOf(this.result));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[location: ");
        sb2.append(RecordUtils.fieldToString(this.location));
        sb2.append(", result: ");
        return b.k(this.result, sb2, "]");
    }
}
