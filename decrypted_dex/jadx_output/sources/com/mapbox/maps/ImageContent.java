package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ImageContent implements Serializable {
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ImageContent(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ImageContent.class != obj.getClass()) {
            return false;
        }
        ImageContent imageContent = (ImageContent) obj;
        return PartialEq.compare(this.left, imageContent.left) && PartialEq.compare(this.top, imageContent.top) && PartialEq.compare(this.right, imageContent.right) && PartialEq.compare(this.bottom, imageContent.bottom);
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getLeft() {
        return this.left;
    }

    public float getRight() {
        return this.right;
    }

    public float getTop() {
        return this.top;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.left), Float.valueOf(this.top), Float.valueOf(this.right), Float.valueOf(this.bottom));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[left: ");
        com.mapbox.common.b.n(this.left, sb2, ", top: ");
        com.mapbox.common.b.n(this.top, sb2, ", right: ");
        com.mapbox.common.b.n(this.right, sb2, ", bottom: ");
        sb2.append(RecordUtils.fieldToString(Float.valueOf(this.bottom)));
        sb2.append("]");
        return sb2.toString();
    }
}
