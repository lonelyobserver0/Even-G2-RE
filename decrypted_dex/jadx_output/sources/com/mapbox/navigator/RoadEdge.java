package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadEdge implements Serializable {
    private final Float accuracy;
    private final Point offset;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadEdge(Point point, Float f10) {
        this.offset = point;
        this.accuracy = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadEdge roadEdge = (RoadEdge) obj;
        return Objects.equals(this.offset, roadEdge.offset) && Objects.equals(this.accuracy, roadEdge.accuracy);
    }

    public Float getAccuracy() {
        return this.accuracy;
    }

    public Point getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return Objects.hash(this.offset, this.accuracy);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[offset: ");
        b.q(this.offset, sb2, ", accuracy: ");
        sb2.append(RecordUtils.fieldToString(this.accuracy));
        sb2.append("]");
        return sb2.toString();
    }
}
