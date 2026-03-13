package com.mapbox.navigator.match.openlr;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ClosedLineLocationReference implements Serializable {
    private final LineAttributes lastLine;
    private final List<LocationReferencePoint> points;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ClosedLineLocationReference(List<LocationReferencePoint> list, LineAttributes lineAttributes) {
        this.points = list;
        this.lastLine = lineAttributes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClosedLineLocationReference closedLineLocationReference = (ClosedLineLocationReference) obj;
        return Objects.equals(this.points, closedLineLocationReference.points) && Objects.equals(this.lastLine, closedLineLocationReference.lastLine);
    }

    public LineAttributes getLastLine() {
        return this.lastLine;
    }

    public List<LocationReferencePoint> getPoints() {
        return this.points;
    }

    public int hashCode() {
        return Objects.hash(this.points, this.lastLine);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[points: ");
        b.v(", lastLine: ", sb2, this.points);
        sb2.append(RecordUtils.fieldToString(this.lastLine));
        sb2.append("]");
        return sb2.toString();
    }
}
