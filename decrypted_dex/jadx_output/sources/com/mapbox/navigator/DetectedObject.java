package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DetectedObject implements Serializable {
    private final Point center;
    private final Float heading;
    private final long id;
    private final Integer laneIndex;
    private final Float laneOffset;
    private final Float speed;
    private final String type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public DetectedObject(long j, String str, Point point, Float f10, Float f11, Integer num, Float f12) {
        this.id = j;
        this.type = str;
        this.center = point;
        this.heading = f10;
        this.speed = f11;
        this.laneIndex = num;
        this.laneOffset = f12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectedObject detectedObject = (DetectedObject) obj;
        return this.id == detectedObject.id && Objects.equals(this.type, detectedObject.type) && Objects.equals(this.center, detectedObject.center) && Objects.equals(this.heading, detectedObject.heading) && Objects.equals(this.speed, detectedObject.speed) && Objects.equals(this.laneIndex, detectedObject.laneIndex) && Objects.equals(this.laneOffset, detectedObject.laneOffset);
    }

    public Point getCenter() {
        return this.center;
    }

    public Float getHeading() {
        return this.heading;
    }

    public long getId() {
        return this.id;
    }

    public Integer getLaneIndex() {
        return this.laneIndex;
    }

    public Float getLaneOffset() {
        return this.laneOffset;
    }

    public Float getSpeed() {
        return this.speed;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.id), this.type, this.center, this.heading, this.speed, this.laneIndex, this.laneOffset);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        b.p(this.id, sb2, ", type: ");
        h.z(sb2, this.type, ", center: ");
        b.q(this.center, sb2, ", heading: ");
        b.s(this.heading, sb2, ", speed: ");
        b.s(this.speed, sb2, ", laneIndex: ");
        b.t(this.laneIndex, sb2, ", laneOffset: ");
        sb2.append(RecordUtils.fieldToString(this.laneOffset));
        sb2.append("]");
        return sb2.toString();
    }
}
