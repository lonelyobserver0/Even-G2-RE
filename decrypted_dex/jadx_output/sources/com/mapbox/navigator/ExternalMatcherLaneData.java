package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ExternalMatcherLaneData implements Serializable {
    private final Point coordinate;
    private final Integer currentLaneIndex;
    private final Float currentLaneOffset;
    private final Float currentLaneWidth;
    private final Float heading;
    private final Integer laneCount;
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ExternalMatcherLaneData(Integer num, Integer num2, Float f10, Float f11, Point point, Float f12, Date date) {
        this.laneCount = num;
        this.currentLaneIndex = num2;
        this.currentLaneWidth = f10;
        this.currentLaneOffset = f11;
        this.coordinate = point;
        this.heading = f12;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalMatcherLaneData externalMatcherLaneData = (ExternalMatcherLaneData) obj;
        return Objects.equals(this.laneCount, externalMatcherLaneData.laneCount) && Objects.equals(this.currentLaneIndex, externalMatcherLaneData.currentLaneIndex) && Objects.equals(this.currentLaneWidth, externalMatcherLaneData.currentLaneWidth) && Objects.equals(this.currentLaneOffset, externalMatcherLaneData.currentLaneOffset) && Objects.equals(this.coordinate, externalMatcherLaneData.coordinate) && Objects.equals(this.heading, externalMatcherLaneData.heading) && Objects.equals(this.timestamp, externalMatcherLaneData.timestamp);
    }

    public Point getCoordinate() {
        return this.coordinate;
    }

    public Integer getCurrentLaneIndex() {
        return this.currentLaneIndex;
    }

    public Float getCurrentLaneOffset() {
        return this.currentLaneOffset;
    }

    public Float getCurrentLaneWidth() {
        return this.currentLaneWidth;
    }

    public Float getHeading() {
        return this.heading;
    }

    public Integer getLaneCount() {
        return this.laneCount;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.laneCount, this.currentLaneIndex, this.currentLaneWidth, this.currentLaneOffset, this.coordinate, this.heading, this.timestamp);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[laneCount: ");
        b.t(this.laneCount, sb2, ", currentLaneIndex: ");
        b.t(this.currentLaneIndex, sb2, ", currentLaneWidth: ");
        b.s(this.currentLaneWidth, sb2, ", currentLaneOffset: ");
        b.s(this.currentLaneOffset, sb2, ", coordinate: ");
        b.q(this.coordinate, sb2, ", heading: ");
        b.s(this.heading, sb2, ", timestamp: ");
        sb2.append(RecordUtils.fieldToString(this.timestamp));
        sb2.append("]");
        return sb2.toString();
    }
}
