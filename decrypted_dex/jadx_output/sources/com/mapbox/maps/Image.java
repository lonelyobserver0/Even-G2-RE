package com.mapbox.maps;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Image implements Serializable {
    private final DataRef data;
    private final int height;
    private final int width;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Image(int i3, int i10, DataRef dataRef) {
        this.width = i3;
        this.height = i10;
        this.data = dataRef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Image.class != obj.getClass()) {
            return false;
        }
        Image image = (Image) obj;
        return this.width == image.width && this.height == image.height && Objects.equals(this.data, image.data);
    }

    public DataRef getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.width), Integer.valueOf(this.height), this.data);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[width: ");
        com.mapbox.common.b.o(this.width, ", height: ", sb2);
        com.mapbox.common.b.o(this.height, ", data: ", sb2);
        sb2.append(RecordUtils.fieldToString(this.data));
        sb2.append("]");
        return sb2.toString();
    }
}
