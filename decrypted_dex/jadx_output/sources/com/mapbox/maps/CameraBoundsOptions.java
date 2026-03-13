package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CameraBoundsOptions implements Serializable {
    private final CoordinateBounds bounds;
    private final Double maxPitch;
    private final Double maxZoom;
    private final Double minPitch;
    private final Double minZoom;

    /* renamed from: com.mapbox.maps.CameraBoundsOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private CoordinateBounds bounds;
        private Double maxPitch;
        private Double maxZoom;
        private Double minPitch;
        private Double minZoom;

        public Builder bounds(CoordinateBounds coordinateBounds) {
            this.bounds = coordinateBounds;
            return this;
        }

        public CameraBoundsOptions build() {
            return new CameraBoundsOptions(this.bounds, this.maxZoom, this.minZoom, this.maxPitch, this.minPitch, null);
        }

        public Builder maxPitch(Double d8) {
            this.maxPitch = d8;
            return this;
        }

        public Builder maxZoom(Double d8) {
            this.maxZoom = d8;
            return this;
        }

        public Builder minPitch(Double d8) {
            this.minPitch = d8;
            return this;
        }

        public Builder minZoom(Double d8) {
            this.minZoom = d8;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ CameraBoundsOptions(CoordinateBounds coordinateBounds, Double d8, Double d10, Double d11, Double d12, AnonymousClass1 anonymousClass1) {
        this(coordinateBounds, d8, d10, d11, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CameraBoundsOptions cameraBoundsOptions = (CameraBoundsOptions) obj;
        return Objects.equals(this.bounds, cameraBoundsOptions.bounds) && Objects.equals(this.maxZoom, cameraBoundsOptions.maxZoom) && Objects.equals(this.minZoom, cameraBoundsOptions.minZoom) && Objects.equals(this.maxPitch, cameraBoundsOptions.maxPitch) && Objects.equals(this.minPitch, cameraBoundsOptions.minPitch);
    }

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public Double getMaxPitch() {
        return this.maxPitch;
    }

    public Double getMaxZoom() {
        return this.maxZoom;
    }

    public Double getMinPitch() {
        return this.minPitch;
    }

    public Double getMinZoom() {
        return this.minZoom;
    }

    public int hashCode() {
        return Objects.hash(this.bounds, this.maxZoom, this.minZoom, this.maxPitch, this.minPitch);
    }

    public Builder toBuilder() {
        return new Builder().bounds(this.bounds).maxZoom(this.maxZoom).minZoom(this.minZoom).maxPitch(this.maxPitch).minPitch(this.minPitch);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[bounds: ");
        sb2.append(RecordUtils.fieldToString(this.bounds));
        sb2.append(", maxZoom: ");
        com.mapbox.common.b.r(this.maxZoom, sb2, ", minZoom: ");
        com.mapbox.common.b.r(this.minZoom, sb2, ", maxPitch: ");
        com.mapbox.common.b.r(this.maxPitch, sb2, ", minPitch: ");
        sb2.append(RecordUtils.fieldToString(this.minPitch));
        sb2.append("]");
        return sb2.toString();
    }

    private CameraBoundsOptions(CoordinateBounds coordinateBounds, Double d8, Double d10, Double d11, Double d12) {
        this.bounds = coordinateBounds;
        this.maxZoom = d8;
        this.minZoom = d10;
        this.maxPitch = d11;
        this.minPitch = d12;
    }
}
