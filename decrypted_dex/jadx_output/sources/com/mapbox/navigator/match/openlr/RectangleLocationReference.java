package com.mapbox.navigator.match.openlr;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RectangleLocationReference implements Serializable {
    private final Point lowerLeft;
    private final Point upperRight;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RectangleLocationReference(Point point, Point point2) {
        this.lowerLeft = point;
        this.upperRight = point2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RectangleLocationReference rectangleLocationReference = (RectangleLocationReference) obj;
        return Objects.equals(this.lowerLeft, rectangleLocationReference.lowerLeft) && Objects.equals(this.upperRight, rectangleLocationReference.upperRight);
    }

    public Point getLowerLeft() {
        return this.lowerLeft;
    }

    public Point getUpperRight() {
        return this.upperRight;
    }

    public int hashCode() {
        return Objects.hash(this.lowerLeft, this.upperRight);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[lowerLeft: ");
        b.q(this.lowerLeft, sb2, ", upperRight: ");
        sb2.append(RecordUtils.fieldToString(this.upperRight));
        sb2.append("]");
        return sb2.toString();
    }
}
