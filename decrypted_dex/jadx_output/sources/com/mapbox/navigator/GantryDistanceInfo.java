package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GantryDistanceInfo implements Serializable {
    private final double distance;
    private final Position position;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GantryDistanceInfo(double d8, Position position) {
        this.distance = d8;
        this.position = position;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GantryDistanceInfo gantryDistanceInfo = (GantryDistanceInfo) obj;
        return PartialEq.compare(this.distance, gantryDistanceInfo.distance) && Objects.equals(this.position, gantryDistanceInfo.position);
    }

    public double getDistance() {
        return this.distance;
    }

    public Position getPosition() {
        return this.position;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.distance), this.position);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[distance: ");
        b.m(this.distance, sb2, ", position: ");
        sb2.append(RecordUtils.fieldToString(this.position));
        sb2.append("]");
        return sb2.toString();
    }
}
