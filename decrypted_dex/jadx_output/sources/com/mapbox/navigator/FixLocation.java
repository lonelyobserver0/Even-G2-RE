package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FixLocation implements Serializable {
    private final Float accuracyHorizontal;
    private final Float altitude;
    private final Float bearing;
    private final Float bearingAccuracy;
    private final Point coordinate;
    private final HashMap<String, Value> extras;
    private final boolean isMock;
    private final long monotonicTimestampNanoseconds;
    private final String provider;
    private final Float speed;
    private final Float speedAccuracy;
    private final Date time;
    private final Float verticalAccuracy;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public FixLocation(Point point, long j, Date date, Float f10, Float f11, Float f12, Float f13, String str, Float f14, Float f15, Float f16, HashMap<String, Value> hashMap, boolean z2) {
        this.coordinate = point;
        this.monotonicTimestampNanoseconds = j;
        this.time = date;
        this.speed = f10;
        this.bearing = f11;
        this.altitude = f12;
        this.accuracyHorizontal = f13;
        this.provider = str;
        this.bearingAccuracy = f14;
        this.speedAccuracy = f15;
        this.verticalAccuracy = f16;
        this.extras = hashMap;
        this.isMock = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FixLocation fixLocation = (FixLocation) obj;
        return Objects.equals(this.coordinate, fixLocation.coordinate) && this.monotonicTimestampNanoseconds == fixLocation.monotonicTimestampNanoseconds && Objects.equals(this.time, fixLocation.time) && Objects.equals(this.speed, fixLocation.speed) && Objects.equals(this.bearing, fixLocation.bearing) && Objects.equals(this.altitude, fixLocation.altitude) && Objects.equals(this.accuracyHorizontal, fixLocation.accuracyHorizontal) && Objects.equals(this.provider, fixLocation.provider) && Objects.equals(this.bearingAccuracy, fixLocation.bearingAccuracy) && Objects.equals(this.speedAccuracy, fixLocation.speedAccuracy) && Objects.equals(this.verticalAccuracy, fixLocation.verticalAccuracy) && Objects.equals(this.extras, fixLocation.extras) && this.isMock == fixLocation.isMock;
    }

    public Float getAccuracyHorizontal() {
        return this.accuracyHorizontal;
    }

    public Float getAltitude() {
        return this.altitude;
    }

    public Float getBearing() {
        return this.bearing;
    }

    public Float getBearingAccuracy() {
        return this.bearingAccuracy;
    }

    public Point getCoordinate() {
        return this.coordinate;
    }

    public HashMap<String, Value> getExtras() {
        return this.extras;
    }

    public boolean getIsMock() {
        return this.isMock;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public String getProvider() {
        return this.provider;
    }

    public Float getSpeed() {
        return this.speed;
    }

    public Float getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    public Date getTime() {
        return this.time;
    }

    public Float getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public int hashCode() {
        return Objects.hash(this.coordinate, Long.valueOf(this.monotonicTimestampNanoseconds), this.time, this.speed, this.bearing, this.altitude, this.accuracyHorizontal, this.provider, this.bearingAccuracy, this.speedAccuracy, this.verticalAccuracy, this.extras, Boolean.valueOf(this.isMock));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[coordinate: ");
        b.q(this.coordinate, sb2, ", monotonicTimestampNanoseconds: ");
        b.p(this.monotonicTimestampNanoseconds, sb2, ", time: ");
        sb2.append(RecordUtils.fieldToString(this.time));
        sb2.append(", speed: ");
        b.s(this.speed, sb2, ", bearing: ");
        b.s(this.bearing, sb2, ", altitude: ");
        b.s(this.altitude, sb2, ", accuracyHorizontal: ");
        b.s(this.accuracyHorizontal, sb2, ", provider: ");
        h.z(sb2, this.provider, ", bearingAccuracy: ");
        b.s(this.bearingAccuracy, sb2, ", speedAccuracy: ");
        b.s(this.speedAccuracy, sb2, ", verticalAccuracy: ");
        b.s(this.verticalAccuracy, sb2, ", extras: ");
        sb2.append(RecordUtils.fieldToString(this.extras));
        sb2.append(", isMock: ");
        return b.k(this.isMock, sb2, "]");
    }
}
