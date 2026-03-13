package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class EdgeAdasAttributes implements Serializable {
    private final List<ValueOnEdge> curvatures;
    private final List<ValueOnEdge> elevations;
    private final ETC2RoadType etc2;
    private final FormOfWay formOfWay;
    private final Boolean isBuiltUpArea;
    private final Boolean isDividedRoad;
    private final List<RoadItemOnEdge> roadItems;
    private final List<ValueOnEdge> slopes;
    private final List<SpeedLimitInfo> speedLimit;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public EdgeAdasAttributes(List<SpeedLimitInfo> list, List<ValueOnEdge> list2, List<ValueOnEdge> list3, List<ValueOnEdge> list4, Boolean bool, Boolean bool2, FormOfWay formOfWay, ETC2RoadType eTC2RoadType, List<RoadItemOnEdge> list5) {
        this.speedLimit = list;
        this.slopes = list2;
        this.elevations = list3;
        this.curvatures = list4;
        this.isDividedRoad = bool;
        this.isBuiltUpArea = bool2;
        this.formOfWay = formOfWay;
        this.etc2 = eTC2RoadType;
        this.roadItems = list5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EdgeAdasAttributes edgeAdasAttributes = (EdgeAdasAttributes) obj;
        return Objects.equals(this.speedLimit, edgeAdasAttributes.speedLimit) && Objects.equals(this.slopes, edgeAdasAttributes.slopes) && Objects.equals(this.elevations, edgeAdasAttributes.elevations) && Objects.equals(this.curvatures, edgeAdasAttributes.curvatures) && Objects.equals(this.isDividedRoad, edgeAdasAttributes.isDividedRoad) && Objects.equals(this.isBuiltUpArea, edgeAdasAttributes.isBuiltUpArea) && Objects.equals(this.formOfWay, edgeAdasAttributes.formOfWay) && Objects.equals(this.etc2, edgeAdasAttributes.etc2) && Objects.equals(this.roadItems, edgeAdasAttributes.roadItems);
    }

    public List<ValueOnEdge> getCurvatures() {
        return this.curvatures;
    }

    public List<ValueOnEdge> getElevations() {
        return this.elevations;
    }

    public ETC2RoadType getEtc2() {
        return this.etc2;
    }

    public FormOfWay getFormOfWay() {
        return this.formOfWay;
    }

    public Boolean getIsBuiltUpArea() {
        return this.isBuiltUpArea;
    }

    public Boolean getIsDividedRoad() {
        return this.isDividedRoad;
    }

    public List<RoadItemOnEdge> getRoadItems() {
        return this.roadItems;
    }

    public List<ValueOnEdge> getSlopes() {
        return this.slopes;
    }

    public List<SpeedLimitInfo> getSpeedLimit() {
        return this.speedLimit;
    }

    public int hashCode() {
        return Objects.hash(this.speedLimit, this.slopes, this.elevations, this.curvatures, this.isDividedRoad, this.isBuiltUpArea, this.formOfWay, this.etc2, this.roadItems);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[speedLimit: ");
        b.v(", slopes: ", sb2, this.speedLimit);
        b.v(", elevations: ", sb2, this.slopes);
        b.v(", curvatures: ", sb2, this.elevations);
        b.v(", isDividedRoad: ", sb2, this.curvatures);
        b.w(sb2, ", isBuiltUpArea: ", this.isDividedRoad);
        b.w(sb2, ", formOfWay: ", this.isBuiltUpArea);
        sb2.append(RecordUtils.fieldToString(this.formOfWay));
        sb2.append(", etc2: ");
        sb2.append(RecordUtils.fieldToString(this.etc2));
        sb2.append(", roadItems: ");
        return b.i("]", sb2, this.roadItems);
    }
}
