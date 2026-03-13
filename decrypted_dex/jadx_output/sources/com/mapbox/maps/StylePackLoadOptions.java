package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StylePackLoadOptions implements Serializable {
    private final boolean acceptExpired;
    private final Value extraOptions;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final Value metadata;

    /* renamed from: com.mapbox.maps.StylePackLoadOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private boolean acceptExpired = false;
        private Value extraOptions;
        private GlyphsRasterizationMode glyphsRasterizationMode;
        private Value metadata;

        public Builder acceptExpired(boolean z2) {
            this.acceptExpired = z2;
            return this;
        }

        public StylePackLoadOptions build() {
            return new StylePackLoadOptions(this.glyphsRasterizationMode, this.metadata, this.acceptExpired, this.extraOptions, null);
        }

        public Builder extraOptions(Value value) {
            this.extraOptions = value;
            return this;
        }

        public Builder glyphsRasterizationMode(GlyphsRasterizationMode glyphsRasterizationMode) {
            this.glyphsRasterizationMode = glyphsRasterizationMode;
            return this;
        }

        public Builder metadata(Value value) {
            this.metadata = value;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ StylePackLoadOptions(GlyphsRasterizationMode glyphsRasterizationMode, Value value, boolean z2, Value value2, AnonymousClass1 anonymousClass1) {
        this(glyphsRasterizationMode, value, z2, value2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StylePackLoadOptions.class != obj.getClass()) {
            return false;
        }
        StylePackLoadOptions stylePackLoadOptions = (StylePackLoadOptions) obj;
        return Objects.equals(this.glyphsRasterizationMode, stylePackLoadOptions.glyphsRasterizationMode) && Objects.equals(this.metadata, stylePackLoadOptions.metadata) && this.acceptExpired == stylePackLoadOptions.acceptExpired && Objects.equals(this.extraOptions, stylePackLoadOptions.extraOptions);
    }

    public boolean getAcceptExpired() {
        return this.acceptExpired;
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public GlyphsRasterizationMode getGlyphsRasterizationMode() {
        return this.glyphsRasterizationMode;
    }

    public Value getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return Objects.hash(this.glyphsRasterizationMode, this.metadata, Boolean.valueOf(this.acceptExpired), this.extraOptions);
    }

    public Builder toBuilder() {
        return new Builder().glyphsRasterizationMode(this.glyphsRasterizationMode).metadata(this.metadata).acceptExpired(this.acceptExpired).extraOptions(this.extraOptions);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[glyphsRasterizationMode: ");
        sb2.append(RecordUtils.fieldToString(this.glyphsRasterizationMode));
        sb2.append(", metadata: ");
        sb2.append(RecordUtils.fieldToString(this.metadata));
        sb2.append(", acceptExpired: ");
        Xa.h.A(this.acceptExpired, sb2, ", extraOptions: ");
        sb2.append(RecordUtils.fieldToString(this.extraOptions));
        sb2.append("]");
        return sb2.toString();
    }

    private StylePackLoadOptions(GlyphsRasterizationMode glyphsRasterizationMode, Value value, boolean z2, Value value2) {
        this.glyphsRasterizationMode = glyphsRasterizationMode;
        this.metadata = value;
        this.acceptExpired = z2;
        this.extraOptions = value2;
    }

    private StylePackLoadOptions(GlyphsRasterizationMode glyphsRasterizationMode, Value value, Value value2) {
        this.glyphsRasterizationMode = glyphsRasterizationMode;
        this.metadata = value;
        this.extraOptions = value2;
        this.acceptExpired = false;
    }
}
