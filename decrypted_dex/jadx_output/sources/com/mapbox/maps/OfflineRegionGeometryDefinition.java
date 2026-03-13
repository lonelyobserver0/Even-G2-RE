package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Objects;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class OfflineRegionGeometryDefinition implements Serializable {
    private final Geometry geometry;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final double maxZoom;
    private final double minZoom;
    private final float pixelRatio;
    private final String styleURL;

    /* renamed from: com.mapbox.maps.OfflineRegionGeometryDefinition$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Geometry geometry;
        private GlyphsRasterizationMode glyphsRasterizationMode;
        private double maxZoom;
        private double minZoom;
        private float pixelRatio;
        private String styleURL;

        public OfflineRegionGeometryDefinition build() {
            if (this.styleURL == null) {
                throw new NullPointerException(StubApp.getString2(14141));
            }
            if (this.geometry == null) {
                throw new NullPointerException(StubApp.getString2(14140));
            }
            if (this.glyphsRasterizationMode != null) {
                return new OfflineRegionGeometryDefinition(this.styleURL, this.geometry, this.minZoom, this.maxZoom, this.pixelRatio, this.glyphsRasterizationMode, null);
            }
            throw new NullPointerException(StubApp.getString2(14139));
        }

        public Builder geometry(Geometry geometry) {
            this.geometry = geometry;
            return this;
        }

        public Builder glyphsRasterizationMode(GlyphsRasterizationMode glyphsRasterizationMode) {
            this.glyphsRasterizationMode = glyphsRasterizationMode;
            return this;
        }

        public Builder maxZoom(double d8) {
            this.maxZoom = d8;
            return this;
        }

        public Builder minZoom(double d8) {
            this.minZoom = d8;
            return this;
        }

        public Builder pixelRatio(float f10) {
            this.pixelRatio = f10;
            return this;
        }

        public Builder styleURL(String str) {
            this.styleURL = str;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ OfflineRegionGeometryDefinition(String str, Geometry geometry, double d8, double d10, float f10, GlyphsRasterizationMode glyphsRasterizationMode, AnonymousClass1 anonymousClass1) {
        this(str, geometry, d8, d10, f10, glyphsRasterizationMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OfflineRegionGeometryDefinition.class != obj.getClass()) {
            return false;
        }
        OfflineRegionGeometryDefinition offlineRegionGeometryDefinition = (OfflineRegionGeometryDefinition) obj;
        return Objects.equals(this.styleURL, offlineRegionGeometryDefinition.styleURL) && Objects.equals(this.geometry, offlineRegionGeometryDefinition.geometry) && PartialEq.compare(this.minZoom, offlineRegionGeometryDefinition.minZoom) && PartialEq.compare(this.maxZoom, offlineRegionGeometryDefinition.maxZoom) && PartialEq.compare(this.pixelRatio, offlineRegionGeometryDefinition.pixelRatio) && Objects.equals(this.glyphsRasterizationMode, offlineRegionGeometryDefinition.glyphsRasterizationMode);
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public GlyphsRasterizationMode getGlyphsRasterizationMode() {
        return this.glyphsRasterizationMode;
    }

    public double getMaxZoom() {
        return this.maxZoom;
    }

    public double getMinZoom() {
        return this.minZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public String getStyleURL() {
        return this.styleURL;
    }

    public int hashCode() {
        return Objects.hash(this.styleURL, this.geometry, Double.valueOf(this.minZoom), Double.valueOf(this.maxZoom), Float.valueOf(this.pixelRatio), this.glyphsRasterizationMode);
    }

    public Builder toBuilder() {
        return new Builder().styleURL(this.styleURL).geometry(this.geometry).minZoom(this.minZoom).maxZoom(this.maxZoom).pixelRatio(this.pixelRatio).glyphsRasterizationMode(this.glyphsRasterizationMode);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[styleURL: ");
        Xa.h.z(sb2, this.styleURL, ", geometry: ");
        sb2.append(RecordUtils.fieldToString(this.geometry));
        sb2.append(", minZoom: ");
        com.mapbox.common.b.m(this.minZoom, sb2, ", maxZoom: ");
        com.mapbox.common.b.m(this.maxZoom, sb2, ", pixelRatio: ");
        com.mapbox.common.b.n(this.pixelRatio, sb2, ", glyphsRasterizationMode: ");
        sb2.append(RecordUtils.fieldToString(this.glyphsRasterizationMode));
        sb2.append("]");
        return sb2.toString();
    }

    private OfflineRegionGeometryDefinition(String str, Geometry geometry, double d8, double d10, float f10, GlyphsRasterizationMode glyphsRasterizationMode) {
        this.styleURL = str;
        this.geometry = geometry;
        this.minZoom = d8;
        this.maxZoom = d10;
        this.pixelRatio = f10;
        this.glyphsRasterizationMode = glyphsRasterizationMode;
    }
}
