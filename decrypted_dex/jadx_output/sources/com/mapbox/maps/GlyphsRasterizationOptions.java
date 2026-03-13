package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class GlyphsRasterizationOptions implements Serializable {
    private final String fontFamily;
    private final GlyphsRasterizationMode rasterizationMode;

    /* renamed from: com.mapbox.maps.GlyphsRasterizationOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private String fontFamily;
        private GlyphsRasterizationMode rasterizationMode;

        public GlyphsRasterizationOptions build() {
            if (this.rasterizationMode != null) {
                return new GlyphsRasterizationOptions(this.rasterizationMode, this.fontFamily, null);
            }
            throw new NullPointerException(StubApp.getString2(13923));
        }

        public Builder fontFamily(String str) {
            this.fontFamily = str;
            return this;
        }

        public Builder rasterizationMode(GlyphsRasterizationMode glyphsRasterizationMode) {
            this.rasterizationMode = glyphsRasterizationMode;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ GlyphsRasterizationOptions(GlyphsRasterizationMode glyphsRasterizationMode, String str, AnonymousClass1 anonymousClass1) {
        this(glyphsRasterizationMode, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GlyphsRasterizationOptions.class != obj.getClass()) {
            return false;
        }
        GlyphsRasterizationOptions glyphsRasterizationOptions = (GlyphsRasterizationOptions) obj;
        return Objects.equals(this.rasterizationMode, glyphsRasterizationOptions.rasterizationMode) && Objects.equals(this.fontFamily, glyphsRasterizationOptions.fontFamily);
    }

    public String getFontFamily() {
        return this.fontFamily;
    }

    public GlyphsRasterizationMode getRasterizationMode() {
        return this.rasterizationMode;
    }

    public int hashCode() {
        return Objects.hash(this.rasterizationMode, this.fontFamily);
    }

    public Builder toBuilder() {
        return new Builder().rasterizationMode(this.rasterizationMode).fontFamily(this.fontFamily);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[rasterizationMode: ");
        sb2.append(RecordUtils.fieldToString(this.rasterizationMode));
        sb2.append(", fontFamily: ");
        return Xa.h.t(sb2, this.fontFamily, "]");
    }

    private GlyphsRasterizationOptions(GlyphsRasterizationMode glyphsRasterizationMode, String str) {
        this.rasterizationMode = glyphsRasterizationMode;
        this.fontFamily = str;
    }
}
