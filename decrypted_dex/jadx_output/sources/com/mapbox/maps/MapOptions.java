package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapOptions implements Serializable {
    private final ConstrainMode constrainMode;
    private final ContextMode contextMode;
    private final Boolean crossSourceCollisions;
    private final GlyphsRasterizationOptions glyphsRasterizationOptions;
    private final NorthOrientation orientation;
    private final float pixelRatio;
    private final Size size;
    private final ViewportMode viewportMode;

    /* renamed from: com.mapbox.maps.MapOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private ConstrainMode constrainMode;
        private ContextMode contextMode;
        private Boolean crossSourceCollisions;
        private GlyphsRasterizationOptions glyphsRasterizationOptions;
        private NorthOrientation orientation;
        private float pixelRatio = 1.0f;
        private Size size;
        private ViewportMode viewportMode;

        public MapOptions build() {
            return new MapOptions(this.contextMode, this.constrainMode, this.viewportMode, this.orientation, this.crossSourceCollisions, this.size, this.pixelRatio, this.glyphsRasterizationOptions, null);
        }

        public Builder constrainMode(ConstrainMode constrainMode) {
            this.constrainMode = constrainMode;
            return this;
        }

        public Builder contextMode(ContextMode contextMode) {
            this.contextMode = contextMode;
            return this;
        }

        public Builder crossSourceCollisions(Boolean bool) {
            this.crossSourceCollisions = bool;
            return this;
        }

        public Builder glyphsRasterizationOptions(GlyphsRasterizationOptions glyphsRasterizationOptions) {
            this.glyphsRasterizationOptions = glyphsRasterizationOptions;
            return this;
        }

        public Builder orientation(NorthOrientation northOrientation) {
            this.orientation = northOrientation;
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

        public Builder viewportMode(ViewportMode viewportMode) {
            this.viewportMode = viewportMode;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ MapOptions(ContextMode contextMode, ConstrainMode constrainMode, ViewportMode viewportMode, NorthOrientation northOrientation, Boolean bool, Size size, float f10, GlyphsRasterizationOptions glyphsRasterizationOptions, AnonymousClass1 anonymousClass1) {
        this(contextMode, constrainMode, viewportMode, northOrientation, bool, size, f10, glyphsRasterizationOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapOptions.class != obj.getClass()) {
            return false;
        }
        MapOptions mapOptions = (MapOptions) obj;
        return Objects.equals(this.contextMode, mapOptions.contextMode) && Objects.equals(this.constrainMode, mapOptions.constrainMode) && Objects.equals(this.viewportMode, mapOptions.viewportMode) && Objects.equals(this.orientation, mapOptions.orientation) && Objects.equals(this.crossSourceCollisions, mapOptions.crossSourceCollisions) && Objects.equals(this.size, mapOptions.size) && PartialEq.compare(this.pixelRatio, mapOptions.pixelRatio) && Objects.equals(this.glyphsRasterizationOptions, mapOptions.glyphsRasterizationOptions);
    }

    public ConstrainMode getConstrainMode() {
        return this.constrainMode;
    }

    public ContextMode getContextMode() {
        return this.contextMode;
    }

    public Boolean getCrossSourceCollisions() {
        return this.crossSourceCollisions;
    }

    public GlyphsRasterizationOptions getGlyphsRasterizationOptions() {
        return this.glyphsRasterizationOptions;
    }

    public NorthOrientation getOrientation() {
        return this.orientation;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public Size getSize() {
        return this.size;
    }

    public ViewportMode getViewportMode() {
        return this.viewportMode;
    }

    public int hashCode() {
        return Objects.hash(this.contextMode, this.constrainMode, this.viewportMode, this.orientation, this.crossSourceCollisions, this.size, Float.valueOf(this.pixelRatio), this.glyphsRasterizationOptions);
    }

    public Builder toBuilder() {
        return new Builder().contextMode(this.contextMode).constrainMode(this.constrainMode).viewportMode(this.viewportMode).orientation(this.orientation).crossSourceCollisions(this.crossSourceCollisions).size(this.size).pixelRatio(this.pixelRatio).glyphsRasterizationOptions(this.glyphsRasterizationOptions);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[contextMode: ");
        sb2.append(RecordUtils.fieldToString(this.contextMode));
        sb2.append(", constrainMode: ");
        sb2.append(RecordUtils.fieldToString(this.constrainMode));
        sb2.append(", viewportMode: ");
        sb2.append(RecordUtils.fieldToString(this.viewportMode));
        sb2.append(", orientation: ");
        sb2.append(RecordUtils.fieldToString(this.orientation));
        sb2.append(", crossSourceCollisions: ");
        com.mapbox.common.b.w(sb2, ", size: ", this.crossSourceCollisions);
        sb2.append(RecordUtils.fieldToString(this.size));
        sb2.append(", pixelRatio: ");
        com.mapbox.common.b.n(this.pixelRatio, sb2, ", glyphsRasterizationOptions: ");
        sb2.append(RecordUtils.fieldToString(this.glyphsRasterizationOptions));
        sb2.append("]");
        return sb2.toString();
    }

    private MapOptions(ContextMode contextMode, ConstrainMode constrainMode, ViewportMode viewportMode, NorthOrientation northOrientation, Boolean bool, Size size, float f10, GlyphsRasterizationOptions glyphsRasterizationOptions) {
        this.contextMode = contextMode;
        this.constrainMode = constrainMode;
        this.viewportMode = viewportMode;
        this.orientation = northOrientation;
        this.crossSourceCollisions = bool;
        this.size = size;
        this.pixelRatio = f10;
        this.glyphsRasterizationOptions = glyphsRasterizationOptions;
    }

    private MapOptions(ContextMode contextMode, ConstrainMode constrainMode, ViewportMode viewportMode, NorthOrientation northOrientation, Boolean bool, Size size, GlyphsRasterizationOptions glyphsRasterizationOptions) {
        this.contextMode = contextMode;
        this.constrainMode = constrainMode;
        this.viewportMode = viewportMode;
        this.orientation = northOrientation;
        this.crossSourceCollisions = bool;
        this.size = size;
        this.glyphsRasterizationOptions = glyphsRasterizationOptions;
        this.pixelRatio = 1.0f;
    }
}
