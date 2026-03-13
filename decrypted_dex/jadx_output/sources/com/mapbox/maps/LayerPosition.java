package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LayerPosition implements Serializable {
    private final String above;
    private final Integer at;
    private final String below;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public LayerPosition(String str, String str2, Integer num) {
        this.above = str;
        this.below = str2;
        this.at = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LayerPosition.class != obj.getClass()) {
            return false;
        }
        LayerPosition layerPosition = (LayerPosition) obj;
        return Objects.equals(this.above, layerPosition.above) && Objects.equals(this.below, layerPosition.below) && Objects.equals(this.at, layerPosition.at);
    }

    public String getAbove() {
        return this.above;
    }

    public Integer getAt() {
        return this.at;
    }

    public String getBelow() {
        return this.below;
    }

    public int hashCode() {
        return Objects.hash(this.above, this.below, this.at);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[above: ");
        Xa.h.z(sb2, this.above, ", below: ");
        Xa.h.z(sb2, this.below, ", at: ");
        sb2.append(RecordUtils.fieldToString(this.at));
        sb2.append("]");
        return sb2.toString();
    }
}
