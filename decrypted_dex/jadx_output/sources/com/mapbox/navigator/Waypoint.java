package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class Waypoint implements Serializable {
    private final Double distance;
    private final Point location;
    private final String metadata;
    private final String name;
    private final Point target;
    private final TimeZone timeZone;
    private final WaypointType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Waypoint(String str, Point point, Double d8, String str2, Point point2, WaypointType waypointType, TimeZone timeZone) {
        this.name = str;
        this.location = point;
        this.distance = d8;
        this.metadata = str2;
        this.target = point2;
        this.type = waypointType;
        this.timeZone = timeZone;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Waypoint waypoint = (Waypoint) obj;
        return Objects.equals(this.name, waypoint.name) && Objects.equals(this.location, waypoint.location) && Objects.equals(this.distance, waypoint.distance) && Objects.equals(this.metadata, waypoint.metadata) && Objects.equals(this.target, waypoint.target) && Objects.equals(this.type, waypoint.type) && Objects.equals(this.timeZone, waypoint.timeZone);
    }

    public Double getDistance() {
        return this.distance;
    }

    public Point getLocation() {
        return this.location;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public String getName() {
        return this.name;
    }

    public Point getTarget() {
        return this.target;
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public WaypointType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.location, this.distance, this.metadata, this.target, this.type, this.timeZone);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[name: ");
        h.z(sb2, this.name, ", location: ");
        b.q(this.location, sb2, ", distance: ");
        b.r(this.distance, sb2, ", metadata: ");
        h.z(sb2, this.metadata, ", target: ");
        b.q(this.target, sb2, ", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", timeZone: ");
        sb2.append(RecordUtils.fieldToString(this.timeZone));
        sb2.append("]");
        return sb2.toString();
    }
}
