package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ImageStretches implements Serializable {
    private final float first;
    private final float second;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ImageStretches(float f10, float f11) {
        this.first = f10;
        this.second = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ImageStretches.class != obj.getClass()) {
            return false;
        }
        ImageStretches imageStretches = (ImageStretches) obj;
        return PartialEq.compare(this.first, imageStretches.first) && PartialEq.compare(this.second, imageStretches.second);
    }

    public float getFirst() {
        return this.first;
    }

    public float getSecond() {
        return this.second;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.first), Float.valueOf(this.second));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[first: ");
        com.mapbox.common.b.n(this.first, sb2, ", second: ");
        sb2.append(RecordUtils.fieldToString(Float.valueOf(this.second)));
        sb2.append("]");
        return sb2.toString();
    }
}
