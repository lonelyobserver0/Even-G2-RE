package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadMarking implements Serializable {
    private final Float accuracy;
    private final RoadMarkingColor color;
    private final Point offset;
    private final Float probability;
    private final RoadMarkingType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadMarking(RoadMarkingType roadMarkingType, RoadMarkingColor roadMarkingColor, Point point, Float f10, Float f11) {
        this.type = roadMarkingType;
        this.color = roadMarkingColor;
        this.offset = point;
        this.probability = f10;
        this.accuracy = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadMarking roadMarking = (RoadMarking) obj;
        return Objects.equals(this.type, roadMarking.type) && Objects.equals(this.color, roadMarking.color) && Objects.equals(this.offset, roadMarking.offset) && Objects.equals(this.probability, roadMarking.probability) && Objects.equals(this.accuracy, roadMarking.accuracy);
    }

    public Float getAccuracy() {
        return this.accuracy;
    }

    public RoadMarkingColor getColor() {
        return this.color;
    }

    public Point getOffset() {
        return this.offset;
    }

    public Float getProbability() {
        return this.probability;
    }

    public RoadMarkingType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.color, this.offset, this.probability, this.accuracy);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", color: ");
        sb2.append(RecordUtils.fieldToString(this.color));
        sb2.append(", offset: ");
        b.q(this.offset, sb2, ", probability: ");
        b.s(this.probability, sb2, ", accuracy: ");
        sb2.append(RecordUtils.fieldToString(this.accuracy));
        sb2.append("]");
        return sb2.toString();
    }
}
