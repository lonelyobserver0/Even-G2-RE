package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Size implements Serializable {
    private final float height;
    private final float width;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Size(float f10, float f11) {
        this.width = f10;
        this.height = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Size.class != obj.getClass()) {
            return false;
        }
        Size size = (Size) obj;
        return PartialEq.compare(this.width, size.width) && PartialEq.compare(this.height, size.height);
    }

    public float getHeight() {
        return this.height;
    }

    public float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.width), Float.valueOf(this.height));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[width: ");
        com.mapbox.common.b.n(this.width, sb2, ", height: ");
        sb2.append(RecordUtils.fieldToString(Float.valueOf(this.height)));
        sb2.append("]");
        return sb2.toString();
    }
}
