package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ElectronicHorizon implements Serializable {
    private final ElectronicHorizonEdge start;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ElectronicHorizon(ElectronicHorizonEdge electronicHorizonEdge) {
        this.start = electronicHorizonEdge;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.start, ((ElectronicHorizon) obj).start);
    }

    public ElectronicHorizonEdge getStart() {
        return this.start;
    }

    public int hashCode() {
        return Objects.hash(this.start);
    }

    public String toString() {
        return "[start: " + RecordUtils.fieldToString(this.start) + "]";
    }
}
