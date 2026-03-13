package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.TileDataDomain;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadObjectMatcherConfig implements Serializable {
    private final TileDataDomain matchingGraphType;
    private final Double openlrMaxDistanceToNode;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadObjectMatcherConfig(Double d8, TileDataDomain tileDataDomain) {
        this.openlrMaxDistanceToNode = d8;
        this.matchingGraphType = tileDataDomain;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadObjectMatcherConfig roadObjectMatcherConfig = (RoadObjectMatcherConfig) obj;
        return Objects.equals(this.openlrMaxDistanceToNode, roadObjectMatcherConfig.openlrMaxDistanceToNode) && Objects.equals(this.matchingGraphType, roadObjectMatcherConfig.matchingGraphType);
    }

    public TileDataDomain getMatchingGraphType() {
        return this.matchingGraphType;
    }

    public Double getOpenlrMaxDistanceToNode() {
        return this.openlrMaxDistanceToNode;
    }

    public int hashCode() {
        return Objects.hash(this.openlrMaxDistanceToNode, this.matchingGraphType);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[openlrMaxDistanceToNode: ");
        b.r(this.openlrMaxDistanceToNode, sb2, ", matchingGraphType: ");
        sb2.append(RecordUtils.fieldToString(this.matchingGraphType));
        sb2.append("]");
        return sb2.toString();
    }
}
