package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapSnapshotOptions implements Serializable {
    private final GlyphsRasterizationOptions glyphsRasterizationOptions;
    private final float pixelRatio;
    private final Size size;

    /* renamed from: com.mapbox.maps.MapSnapshotOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private GlyphsRasterizationOptions glyphsRasterizationOptions;
        private float pixelRatio = 1.0f;
        private Size size;

        public MapSnapshotOptions build() {
            if (this.size != null) {
                return new MapSnapshotOptions(this.size, this.pixelRatio, this.glyphsRasterizationOptions, null);
            }
            throw new NullPointerException(StubApp.getString2(13988));
        }

        public Builder glyphsRasterizationOptions(GlyphsRasterizationOptions glyphsRasterizationOptions) {
            this.glyphsRasterizationOptions = glyphsRasterizationOptions;
            return this;
        }

        public Builder pixelRatio(float f10) {
            this.pixelRatio = f10;
            return this;
        }

        public Builder size(Size size) {
            this.size = size;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ MapSnapshotOptions(Size size, float f10, GlyphsRasterizationOptions glyphsRasterizationOptions, AnonymousClass1 anonymousClass1) {
        this(size, f10, glyphsRasterizationOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapSnapshotOptions.class != obj.getClass()) {
            return false;
        }
        MapSnapshotOptions mapSnapshotOptions = (MapSnapshotOptions) obj;
        return Objects.equals(this.size, mapSnapshotOptions.size) && PartialEq.compare(this.pixelRatio, mapSnapshotOptions.pixelRatio) && Objects.equals(this.glyphsRasterizationOptions, mapSnapshotOptions.glyphsRasterizationOptions);
    }

    public GlyphsRasterizationOptions getGlyphsRasterizationOptions() {
        return this.glyphsRasterizationOptions;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public Size getSize() {
        return this.size;
    }

    public int hashCode() {
        return Objects.hash(this.size, Float.valueOf(this.pixelRatio), this.glyphsRasterizationOptions);
    }

    public Builder toBuilder() {
        return new Builder().size(this.size).pixelRatio(this.pixelRatio).glyphsRasterizationOptions(this.glyphsRasterizationOptions);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[size: ");
        sb2.append(RecordUtils.fieldToString(this.size));
        sb2.append(", pixelRatio: ");
        com.mapbox.common.b.n(this.pixelRatio, sb2, ", glyphsRasterizationOptions: ");
        sb2.append(RecordUtils.fieldToString(this.glyphsRasterizationOptions));
        sb2.append("]");
        return sb2.toString();
    }

    private MapSnapshotOptions(Size size, float f10, GlyphsRasterizationOptions glyphsRasterizationOptions) {
        this.size = size;
        this.pixelRatio = f10;
        this.glyphsRasterizationOptions = glyphsRasterizationOptions;
    }

    private MapSnapshotOptions(Size size, GlyphsRasterizationOptions glyphsRasterizationOptions) {
        this.size = size;
        this.glyphsRasterizationOptions = glyphsRasterizationOptions;
        this.pixelRatio = 1.0f;
    }
}
