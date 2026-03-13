package com.mapbox.navigator.route_data;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RdIntersection implements Serializable {
    private final List<Integer> bearings;
    private final List<RdRoadClass> classes;
    private final List<Boolean> entry;
    private final Integer geometryIndex;
    private final Byte inIndex;
    private final List<RdLane> lanes;
    private final Point location;
    private final Byte outIndex;
    private final boolean railwayCrossing;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdIntersection(Integer num, Point point, List<RdLane> list, List<Integer> list2, List<Boolean> list3, boolean z2, Byte b2, Byte b10, List<RdRoadClass> list4) {
        this.geometryIndex = num;
        this.location = point;
        this.lanes = list;
        this.bearings = list2;
        this.entry = list3;
        this.railwayCrossing = z2;
        this.inIndex = b2;
        this.outIndex = b10;
        this.classes = list4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdIntersection rdIntersection = (RdIntersection) obj;
        return Objects.equals(this.geometryIndex, rdIntersection.geometryIndex) && Objects.equals(this.location, rdIntersection.location) && Objects.equals(this.lanes, rdIntersection.lanes) && Objects.equals(this.bearings, rdIntersection.bearings) && Objects.equals(this.entry, rdIntersection.entry) && this.railwayCrossing == rdIntersection.railwayCrossing && Objects.equals(this.inIndex, rdIntersection.inIndex) && Objects.equals(this.outIndex, rdIntersection.outIndex) && Objects.equals(this.classes, rdIntersection.classes);
    }

    public List<Integer> getBearings() {
        return this.bearings;
    }

    public List<RdRoadClass> getClasses() {
        return this.classes;
    }

    public List<Boolean> getEntry() {
        return this.entry;
    }

    public Integer getGeometryIndex() {
        return this.geometryIndex;
    }

    public Byte getInIndex() {
        return this.inIndex;
    }

    public List<RdLane> getLanes() {
        return this.lanes;
    }

    public Point getLocation() {
        return this.location;
    }

    public Byte getOutIndex() {
        return this.outIndex;
    }

    public boolean getRailwayCrossing() {
        return this.railwayCrossing;
    }

    public int hashCode() {
        return Objects.hash(this.geometryIndex, this.location, this.lanes, this.bearings, this.entry, Boolean.valueOf(this.railwayCrossing), this.inIndex, this.outIndex, this.classes);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[geometryIndex: ");
        b.t(this.geometryIndex, sb2, ", location: ");
        b.q(this.location, sb2, ", lanes: ");
        b.v(", bearings: ", sb2, this.lanes);
        b.v(", entry: ", sb2, this.bearings);
        b.v(", railwayCrossing: ", sb2, this.entry);
        h.A(this.railwayCrossing, sb2, ", inIndex: ");
        sb2.append(RecordUtils.fieldToString(this.inIndex));
        sb2.append(", outIndex: ");
        sb2.append(RecordUtils.fieldToString(this.outIndex));
        sb2.append(", classes: ");
        return b.i("]", sb2, this.classes);
    }
}
