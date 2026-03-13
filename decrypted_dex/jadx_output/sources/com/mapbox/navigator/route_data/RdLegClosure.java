package com.mapbox.navigator.route_data;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RdLegClosure implements Serializable {
    private final int geometryIndexEnd;
    private final int geometryIndexStart;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdLegClosure(int i3, int i10) {
        this.geometryIndexStart = i3;
        this.geometryIndexEnd = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdLegClosure rdLegClosure = (RdLegClosure) obj;
        return this.geometryIndexStart == rdLegClosure.geometryIndexStart && this.geometryIndexEnd == rdLegClosure.geometryIndexEnd;
    }

    public int getGeometryIndexEnd() {
        return this.geometryIndexEnd;
    }

    public int getGeometryIndexStart() {
        return this.geometryIndexStart;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.geometryIndexStart), Integer.valueOf(this.geometryIndexEnd));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[geometryIndexStart: ");
        b.o(this.geometryIndexStart, ", geometryIndexEnd: ", sb2);
        return b.g(this.geometryIndexEnd, "]", sb2);
    }
}
