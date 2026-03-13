package com.mapbox.common.location;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Location implements Serializable {
    private Double altitude;
    private Double bearing;
    private Double bearingAccuracy;
    private final Value extra;
    private Long floor;
    private Double horizontalAccuracy;
    private final double latitude;
    private final double longitude;
    private Long monotonicTimestamp;
    private String source;
    private Double speed;
    private Double speedAccuracy;
    private final long timestamp;
    private Double verticalAccuracy;

    /* renamed from: com.mapbox.common.location.Location$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Double altitude;
        private Double bearing;
        private Double bearingAccuracy;
        private Value extra;
        private Long floor;
        private Double horizontalAccuracy;
        private double latitude;
        private double longitude;
        private Long monotonicTimestamp;
        private String source;
        private Double speed;
        private Double speedAccuracy;
        private long timestamp;
        private Double verticalAccuracy;

        public Builder altitude(Double d8) {
            this.altitude = d8;
            return this;
        }

        public Builder bearing(Double d8) {
            this.bearing = d8;
            return this;
        }

        public Builder bearingAccuracy(Double d8) {
            this.bearingAccuracy = d8;
            return this;
        }

        public Location build() {
            return new Location(this.latitude, this.longitude, this.timestamp, this.monotonicTimestamp, this.altitude, this.horizontalAccuracy, this.verticalAccuracy, this.speed, this.speedAccuracy, this.bearing, this.bearingAccuracy, this.floor, this.source, this.extra, null);
        }

        public Builder extra(Value value) {
            this.extra = value;
            return this;
        }

        public Builder floor(Long l9) {
            this.floor = l9;
            return this;
        }

        public Builder horizontalAccuracy(Double d8) {
            this.horizontalAccuracy = d8;
            return this;
        }

        public Builder latitude(double d8) {
            this.latitude = d8;
            return this;
        }

        public Builder longitude(double d8) {
            this.longitude = d8;
            return this;
        }

        public Builder monotonicTimestamp(Long l9) {
            this.monotonicTimestamp = l9;
            return this;
        }

        public Builder source(String str) {
            this.source = str;
            return this;
        }

        public Builder speed(Double d8) {
            this.speed = d8;
            return this;
        }

        public Builder speedAccuracy(Double d8) {
            this.speedAccuracy = d8;
            return this;
        }

        public Builder timestamp(long j) {
            this.timestamp = j;
            return this;
        }

        public Builder verticalAccuracy(Double d8) {
            this.verticalAccuracy = d8;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public /* synthetic */ Location(double d8, double d10, long j, Long l9, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Long l10, String str, Value value, AnonymousClass1 anonymousClass1) {
        this(d8, d10, j, l9, d11, d12, d13, d14, d15, d16, d17, l10, str, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Location location = (Location) obj;
        return PartialEq.compare(this.latitude, location.latitude) && PartialEq.compare(this.longitude, location.longitude) && this.timestamp == location.timestamp && Objects.equals(this.monotonicTimestamp, location.monotonicTimestamp) && Objects.equals(this.altitude, location.altitude) && Objects.equals(this.horizontalAccuracy, location.horizontalAccuracy) && Objects.equals(this.verticalAccuracy, location.verticalAccuracy) && Objects.equals(this.speed, location.speed) && Objects.equals(this.speedAccuracy, location.speedAccuracy) && Objects.equals(this.bearing, location.bearing) && Objects.equals(this.bearingAccuracy, location.bearingAccuracy) && Objects.equals(this.floor, location.floor) && Objects.equals(this.source, location.source) && Objects.equals(this.extra, location.extra);
    }

    public Double getAltitude() {
        return this.altitude;
    }

    public Double getBearing() {
        return this.bearing;
    }

    public Double getBearingAccuracy() {
        return this.bearingAccuracy;
    }

    public Value getExtra() {
        return this.extra;
    }

    public Long getFloor() {
        return this.floor;
    }

    public Double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public Long getMonotonicTimestamp() {
        return this.monotonicTimestamp;
    }

    public String getSource() {
        return this.source;
    }

    public Double getSpeed() {
        return this.speed;
    }

    public Double getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public Double getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.latitude), Double.valueOf(this.longitude), Long.valueOf(this.timestamp), this.monotonicTimestamp, this.altitude, this.horizontalAccuracy, this.verticalAccuracy, this.speed, this.speedAccuracy, this.bearing, this.bearingAccuracy, this.floor, this.source, this.extra);
    }

    public void setAltitude(Double d8) {
        this.altitude = d8;
    }

    public void setBearing(Double d8) {
        this.bearing = d8;
    }

    public void setBearingAccuracy(Double d8) {
        this.bearingAccuracy = d8;
    }

    public void setFloor(Long l9) {
        this.floor = l9;
    }

    public void setHorizontalAccuracy(Double d8) {
        this.horizontalAccuracy = d8;
    }

    public void setMonotonicTimestamp(Long l9) {
        this.monotonicTimestamp = l9;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSpeed(Double d8) {
        this.speed = d8;
    }

    public void setSpeedAccuracy(Double d8) {
        this.speedAccuracy = d8;
    }

    public void setVerticalAccuracy(Double d8) {
        this.verticalAccuracy = d8;
    }

    public Builder toBuilder() {
        return new Builder().latitude(this.latitude).longitude(this.longitude).timestamp(this.timestamp).monotonicTimestamp(this.monotonicTimestamp).altitude(this.altitude).horizontalAccuracy(this.horizontalAccuracy).verticalAccuracy(this.verticalAccuracy).speed(this.speed).speedAccuracy(this.speedAccuracy).bearing(this.bearing).bearingAccuracy(this.bearingAccuracy).floor(this.floor).source(this.source).extra(this.extra);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[latitude: ");
        com.mapbox.common.b.m(this.latitude, sb2, ", longitude: ");
        com.mapbox.common.b.m(this.longitude, sb2, ", timestamp: ");
        com.mapbox.common.b.p(this.timestamp, sb2, ", monotonicTimestamp: ");
        com.mapbox.common.b.u(this.monotonicTimestamp, sb2, ", altitude: ");
        com.mapbox.common.b.r(this.altitude, sb2, ", horizontalAccuracy: ");
        com.mapbox.common.b.r(this.horizontalAccuracy, sb2, ", verticalAccuracy: ");
        com.mapbox.common.b.r(this.verticalAccuracy, sb2, ", speed: ");
        com.mapbox.common.b.r(this.speed, sb2, ", speedAccuracy: ");
        com.mapbox.common.b.r(this.speedAccuracy, sb2, ", bearing: ");
        com.mapbox.common.b.r(this.bearing, sb2, ", bearingAccuracy: ");
        com.mapbox.common.b.r(this.bearingAccuracy, sb2, ", floor: ");
        com.mapbox.common.b.u(this.floor, sb2, ", source: ");
        h.z(sb2, this.source, ", extra: ");
        sb2.append(RecordUtils.fieldToString(this.extra));
        sb2.append("]");
        return sb2.toString();
    }

    private Location(double d8, double d10, long j, Long l9, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Long l10, String str, Value value) {
        this.latitude = d8;
        this.longitude = d10;
        this.timestamp = j;
        this.monotonicTimestamp = l9;
        this.altitude = d11;
        this.horizontalAccuracy = d12;
        this.verticalAccuracy = d13;
        this.speed = d14;
        this.speedAccuracy = d15;
        this.bearing = d16;
        this.bearingAccuracy = d17;
        this.floor = l10;
        this.source = str;
        this.extra = value;
    }
}
