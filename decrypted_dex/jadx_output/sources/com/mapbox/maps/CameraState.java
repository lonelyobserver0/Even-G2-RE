package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CameraState implements Serializable {
    private final double bearing;
    private final Point center;
    private final EdgeInsets padding;
    private final double pitch;
    private final double zoom;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CameraState(Point point, EdgeInsets edgeInsets, double d8, double d10, double d11) {
        this.center = point;
        this.padding = edgeInsets;
        this.zoom = d8;
        this.bearing = d10;
        this.pitch = d11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraState.class != obj.getClass()) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        return Objects.equals(this.center, cameraState.center) && Objects.equals(this.padding, cameraState.padding) && PartialEq.compare(this.zoom, cameraState.zoom) && PartialEq.compare(this.bearing, cameraState.bearing) && PartialEq.compare(this.pitch, cameraState.pitch);
    }

    public double getBearing() {
        return this.bearing;
    }

    public Point getCenter() {
        return this.center;
    }

    public EdgeInsets getPadding() {
        return this.padding;
    }

    public double getPitch() {
        return this.pitch;
    }

    public double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(this.center, this.padding, Double.valueOf(this.zoom), Double.valueOf(this.bearing), Double.valueOf(this.pitch));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[center: ");
        com.mapbox.common.b.q(this.center, sb2, ", padding: ");
        sb2.append(RecordUtils.fieldToString(this.padding));
        sb2.append(", zoom: ");
        com.mapbox.common.b.m(this.zoom, sb2, ", bearing: ");
        com.mapbox.common.b.m(this.bearing, sb2, ", pitch: ");
        return com.mapbox.common.b.f(this.pitch, sb2, "]");
    }
}
