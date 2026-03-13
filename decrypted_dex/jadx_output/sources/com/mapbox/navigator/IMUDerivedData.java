package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class IMUDerivedData implements Serializable {
    private final Double bearing;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public IMUDerivedData(Double d8) {
        this.bearing = d8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.bearing, ((IMUDerivedData) obj).bearing);
    }

    public Double getBearing() {
        return this.bearing;
    }

    public int hashCode() {
        return Objects.hash(this.bearing);
    }

    public String toString() {
        return "[bearing: " + RecordUtils.fieldToString(this.bearing) + "]";
    }
}
