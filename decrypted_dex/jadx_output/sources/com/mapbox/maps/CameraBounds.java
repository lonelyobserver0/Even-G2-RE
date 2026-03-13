package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CameraBounds implements Serializable {
    private final CoordinateBounds bounds;
    private final double maxPitch;
    private final double maxZoom;
    private final double minPitch;
    private final double minZoom;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CameraBounds(CoordinateBounds coordinateBounds, double d8, double d10, double d11, double d12) {
        this.bounds = coordinateBounds;
        this.maxZoom = d8;
        this.minZoom = d10;
        this.maxPitch = d11;
        this.minPitch = d12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraBounds.class != obj.getClass()) {
            return false;
        }
        CameraBounds cameraBounds = (CameraBounds) obj;
        return Objects.equals(this.bounds, cameraBounds.bounds) && PartialEq.compare(this.maxZoom, cameraBounds.maxZoom) && PartialEq.compare(this.minZoom, cameraBounds.minZoom) && PartialEq.compare(this.maxPitch, cameraBounds.maxPitch) && PartialEq.compare(this.minPitch, cameraBounds.minPitch);
    }

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public double getMaxPitch() {
        return this.maxPitch;
    }

    public double getMaxZoom() {
        return this.maxZoom;
    }

    public double getMinPitch() {
        return this.minPitch;
    }

    public double getMinZoom() {
        return this.minZoom;
    }

    public int hashCode() {
        return Objects.hash(this.bounds, Double.valueOf(this.maxZoom), Double.valueOf(this.minZoom), Double.valueOf(this.maxPitch), Double.valueOf(this.minPitch));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[bounds: ");
        sb2.append(RecordUtils.fieldToString(this.bounds));
        sb2.append(", maxZoom: ");
        com.mapbox.common.b.m(this.maxZoom, sb2, ", minZoom: ");
        com.mapbox.common.b.m(this.minZoom, sb2, ", maxPitch: ");
        com.mapbox.common.b.m(this.maxPitch, sb2, ", minPitch: ");
        return com.mapbox.common.b.f(this.minPitch, sb2, "]");
    }
}
