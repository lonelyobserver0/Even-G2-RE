package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class MatchedRouteObject implements Serializable {
    private final LaneGroupPosition firstPointPosition;
    private final String id;
    private final LaneGroupPosition lastPointPosition;
    private final Geometry shape;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchedRouteObject(String str, Geometry geometry, LaneGroupPosition laneGroupPosition, LaneGroupPosition laneGroupPosition2) {
        this.id = str;
        this.shape = geometry;
        this.firstPointPosition = laneGroupPosition;
        this.lastPointPosition = laneGroupPosition2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchedRouteObject matchedRouteObject = (MatchedRouteObject) obj;
        return Objects.equals(this.id, matchedRouteObject.id) && Objects.equals(this.shape, matchedRouteObject.shape) && Objects.equals(this.firstPointPosition, matchedRouteObject.firstPointPosition) && Objects.equals(this.lastPointPosition, matchedRouteObject.lastPointPosition);
    }

    public LaneGroupPosition getFirstPointPosition() {
        return this.firstPointPosition;
    }

    public String getId() {
        return this.id;
    }

    public LaneGroupPosition getLastPointPosition() {
        return this.lastPointPosition;
    }

    public Geometry getShape() {
        return this.shape;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.shape, this.firstPointPosition, this.lastPointPosition);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", shape: ");
        sb2.append(RecordUtils.fieldToString(this.shape));
        sb2.append(", firstPointPosition: ");
        sb2.append(RecordUtils.fieldToString(this.firstPointPosition));
        sb2.append(", lastPointPosition: ");
        sb2.append(RecordUtils.fieldToString(this.lastPointPosition));
        sb2.append("]");
        return sb2.toString();
    }
}
