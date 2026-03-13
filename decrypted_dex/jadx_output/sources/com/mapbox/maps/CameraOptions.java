package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CameraOptions implements Serializable {
    private final ScreenCoordinate anchor;
    private final Double bearing;
    private final Point center;
    private final EdgeInsets padding;
    private final Double pitch;
    private final Double zoom;

    /* renamed from: com.mapbox.maps.CameraOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private ScreenCoordinate anchor;
        private Double bearing;
        private Point center;
        private EdgeInsets padding;
        private Double pitch;
        private Double zoom;

        public Builder anchor(ScreenCoordinate screenCoordinate) {
            this.anchor = screenCoordinate;
            return this;
        }

        public Builder bearing(Double d8) {
            this.bearing = d8;
            return this;
        }

        public CameraOptions build() {
            return new CameraOptions(this.center, this.padding, this.anchor, this.zoom, this.bearing, this.pitch, null);
        }

        public Builder center(Point point) {
            this.center = point;
            return this;
        }

        public Builder padding(EdgeInsets edgeInsets) {
            this.padding = edgeInsets;
            return this;
        }

        public Builder pitch(Double d8) {
            this.pitch = d8;
            return this;
        }

        public Builder zoom(Double d8) {
            this.zoom = d8;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ CameraOptions(Point point, EdgeInsets edgeInsets, ScreenCoordinate screenCoordinate, Double d8, Double d10, Double d11, AnonymousClass1 anonymousClass1) {
        this(point, edgeInsets, screenCoordinate, d8, d10, d11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraOptions.class != obj.getClass()) {
            return false;
        }
        CameraOptions cameraOptions = (CameraOptions) obj;
        return Objects.equals(this.center, cameraOptions.center) && Objects.equals(this.padding, cameraOptions.padding) && Objects.equals(this.anchor, cameraOptions.anchor) && Objects.equals(this.zoom, cameraOptions.zoom) && Objects.equals(this.bearing, cameraOptions.bearing) && Objects.equals(this.pitch, cameraOptions.pitch);
    }

    public ScreenCoordinate getAnchor() {
        return this.anchor;
    }

    public Double getBearing() {
        return this.bearing;
    }

    public Point getCenter() {
        return this.center;
    }

    public EdgeInsets getPadding() {
        return this.padding;
    }

    public Double getPitch() {
        return this.pitch;
    }

    public Double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(this.center, this.padding, this.anchor, this.zoom, this.bearing, this.pitch);
    }

    public Builder toBuilder() {
        return new Builder().center(this.center).padding(this.padding).anchor(this.anchor).zoom(this.zoom).bearing(this.bearing).pitch(this.pitch);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[center: ");
        com.mapbox.common.b.q(this.center, sb2, ", padding: ");
        sb2.append(RecordUtils.fieldToString(this.padding));
        sb2.append(", anchor: ");
        sb2.append(RecordUtils.fieldToString(this.anchor));
        sb2.append(", zoom: ");
        com.mapbox.common.b.r(this.zoom, sb2, ", bearing: ");
        com.mapbox.common.b.r(this.bearing, sb2, ", pitch: ");
        sb2.append(RecordUtils.fieldToString(this.pitch));
        sb2.append("]");
        return sb2.toString();
    }

    private CameraOptions(Point point, EdgeInsets edgeInsets, ScreenCoordinate screenCoordinate, Double d8, Double d10, Double d11) {
        this.center = point;
        this.padding = edgeInsets;
        this.anchor = screenCoordinate;
        this.zoom = d8;
        this.bearing = d10;
        this.pitch = d11;
    }
}
