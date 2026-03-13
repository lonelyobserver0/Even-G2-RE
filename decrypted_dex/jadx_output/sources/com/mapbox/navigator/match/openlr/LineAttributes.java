package com.mapbox.navigator.match.openlr;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.navigator.FormOfWay;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class LineAttributes implements Serializable {
    private final int bearing;
    private final FormOfWay formOfWay;
    private final OpenLRFunctionalRoadClass functionalRoadClass;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LineAttributes(OpenLRFunctionalRoadClass openLRFunctionalRoadClass, FormOfWay formOfWay, int i3) {
        this.functionalRoadClass = openLRFunctionalRoadClass;
        this.formOfWay = formOfWay;
        this.bearing = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAttributes lineAttributes = (LineAttributes) obj;
        return Objects.equals(this.functionalRoadClass, lineAttributes.functionalRoadClass) && Objects.equals(this.formOfWay, lineAttributes.formOfWay) && this.bearing == lineAttributes.bearing;
    }

    public int getBearing() {
        return this.bearing;
    }

    public FormOfWay getFormOfWay() {
        return this.formOfWay;
    }

    public OpenLRFunctionalRoadClass getFunctionalRoadClass() {
        return this.functionalRoadClass;
    }

    public int hashCode() {
        return Objects.hash(this.functionalRoadClass, this.formOfWay, Integer.valueOf(this.bearing));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[functionalRoadClass: ");
        sb2.append(RecordUtils.fieldToString(this.functionalRoadClass));
        sb2.append(", formOfWay: ");
        sb2.append(RecordUtils.fieldToString(this.formOfWay));
        sb2.append(", bearing: ");
        return b.g(this.bearing, "]", sb2);
    }
}
