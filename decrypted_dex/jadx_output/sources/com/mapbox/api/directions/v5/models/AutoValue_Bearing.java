package com.mapbox.api.directions.v5.models;

import com.mapbox.api.directions.v5.models.Bearing;
import com.mapbox.auto.value.gson.b;
import com.stub.StubApp;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValue_Bearing extends Bearing {
    private final double angle;
    private final double degrees;
    private final Map<String, b> unrecognized;

    /* renamed from: com.mapbox.api.directions.v5.models.AutoValue_Bearing$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder extends Bearing.Builder {
        private Double angle;
        private Double degrees;
        private Map<String, b> unrecognized;

        @Override // com.mapbox.api.directions.v5.models.Bearing.Builder
        public Bearing.Builder angle(double d8) {
            this.angle = Double.valueOf(d8);
            return this;
        }

        @Override // com.mapbox.api.directions.v5.models.Bearing.Builder
        public Bearing build() {
            String string2 = this.angle == null ? StubApp.getString2(12964) : "";
            if (this.degrees == null) {
                string2 = AbstractC1482f.g(string2, StubApp.getString2(12965));
            }
            if (string2.isEmpty()) {
                return new AutoValue_Bearing(this.unrecognized, this.angle.doubleValue(), this.degrees.doubleValue(), null);
            }
            throw new IllegalStateException(StubApp.getString2(555).concat(string2));
        }

        @Override // com.mapbox.api.directions.v5.models.Bearing.Builder
        public Bearing.Builder degrees(double d8) {
            this.degrees = Double.valueOf(d8);
            return this;
        }

        @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
        public /* bridge */ /* synthetic */ Bearing.Builder unrecognized(Map map) {
            return unrecognized((Map<String, b>) map);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
        public Bearing.Builder unrecognized(Map<String, b> map) {
            this.unrecognized = map;
            return this;
        }
    }

    public /* synthetic */ AutoValue_Bearing(Map map, double d8, double d10, AnonymousClass1 anonymousClass1) {
        this(map, d8, d10);
    }

    @Override // com.mapbox.api.directions.v5.models.Bearing
    public double angle() {
        return this.angle;
    }

    @Override // com.mapbox.api.directions.v5.models.Bearing
    public double degrees() {
        return this.degrees;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Bearing) {
            Bearing bearing = (Bearing) obj;
            Map<String, b> map = this.unrecognized;
            if (map != null ? map.equals(bearing.unrecognized()) : bearing.unrecognized() == null) {
                if (Double.doubleToLongBits(this.angle) == Double.doubleToLongBits(bearing.angle()) && Double.doubleToLongBits(this.degrees) == Double.doubleToLongBits(bearing.degrees())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Map<String, b> map = this.unrecognized;
        return (((((map == null ? 0 : map.hashCode()) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.angle) >>> 32) ^ Double.doubleToLongBits(this.angle)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.degrees) >>> 32) ^ Double.doubleToLongBits(this.degrees)));
    }

    public String toString() {
        return StubApp.getString2(12966) + this.unrecognized + StubApp.getString2(12967) + this.angle + StubApp.getString2(12711) + this.degrees + StubApp.getString2(265);
    }

    @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
    public Map<String, b> unrecognized() {
        return this.unrecognized;
    }

    private AutoValue_Bearing(Map<String, b> map, double d8, double d10) {
        this.unrecognized = map;
        this.angle = d8;
        this.degrees = d10;
    }
}
