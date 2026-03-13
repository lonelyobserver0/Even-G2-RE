package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class DepthRange implements Serializable {
    private final float max;
    private final float min;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public DepthRange(float f10, float f11) {
        this.min = f10;
        this.max = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DepthRange.class != obj.getClass()) {
            return false;
        }
        DepthRange depthRange = (DepthRange) obj;
        return PartialEq.compare(this.min, depthRange.min) && PartialEq.compare(this.max, depthRange.max);
    }

    public float getMax() {
        return this.max;
    }

    public float getMin() {
        return this.min;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.min), Float.valueOf(this.max));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[min: ");
        com.mapbox.common.b.n(this.min, sb2, ", max: ");
        sb2.append(RecordUtils.fieldToString(Float.valueOf(this.max)));
        sb2.append("]");
        return sb2.toString();
    }
}
