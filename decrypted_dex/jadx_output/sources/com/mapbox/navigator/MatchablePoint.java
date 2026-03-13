package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MatchablePoint implements Serializable {
    private final Point coordinate;
    private final Double heading;
    private final String id;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchablePoint(String str, Point point, Double d8) {
        this.id = str;
        this.coordinate = point;
        this.heading = d8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchablePoint matchablePoint = (MatchablePoint) obj;
        return Objects.equals(this.id, matchablePoint.id) && Objects.equals(this.coordinate, matchablePoint.coordinate) && Objects.equals(this.heading, matchablePoint.heading);
    }

    public Point getCoordinate() {
        return this.coordinate;
    }

    public Double getHeading() {
        return this.heading;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.coordinate, this.heading);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", coordinate: ");
        b.q(this.coordinate, sb2, ", heading: ");
        sb2.append(RecordUtils.fieldToString(this.heading));
        sb2.append("]");
        return sb2.toString();
    }
}
