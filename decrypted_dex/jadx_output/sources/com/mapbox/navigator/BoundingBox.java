package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BoundingBox implements Serializable {
    private final Point max;
    private final Point min;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public BoundingBox(Point point, Point point2) {
        this.min = point;
        this.max = point2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) obj;
        return Objects.equals(this.min, boundingBox.min) && Objects.equals(this.max, boundingBox.max);
    }

    public Point getMax() {
        return this.max;
    }

    public Point getMin() {
        return this.min;
    }

    public int hashCode() {
        return Objects.hash(this.min, this.max);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[min: ");
        b.q(this.min, sb2, ", max: ");
        sb2.append(RecordUtils.fieldToString(this.max));
        sb2.append("]");
        return sb2.toString();
    }
}
