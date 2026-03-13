package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Geometry;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SubgraphEdge implements Serializable {
    private final long id;
    private final List<Long> innerEdgeIds;
    private final double length;
    private final List<Long> outerEdgeIds;
    private final Geometry shape;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SubgraphEdge(long j, List<Long> list, List<Long> list2, Geometry geometry, double d8) {
        this.id = j;
        this.innerEdgeIds = list;
        this.outerEdgeIds = list2;
        this.shape = geometry;
        this.length = d8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubgraphEdge subgraphEdge = (SubgraphEdge) obj;
        return this.id == subgraphEdge.id && Objects.equals(this.innerEdgeIds, subgraphEdge.innerEdgeIds) && Objects.equals(this.outerEdgeIds, subgraphEdge.outerEdgeIds) && Objects.equals(this.shape, subgraphEdge.shape) && PartialEq.compare(this.length, subgraphEdge.length);
    }

    public long getId() {
        return this.id;
    }

    public List<Long> getInnerEdgeIds() {
        return this.innerEdgeIds;
    }

    public double getLength() {
        return this.length;
    }

    public List<Long> getOuterEdgeIds() {
        return this.outerEdgeIds;
    }

    public Geometry getShape() {
        return this.shape;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.id), this.innerEdgeIds, this.outerEdgeIds, this.shape, Double.valueOf(this.length));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        b.p(this.id, sb2, ", innerEdgeIds: ");
        b.v(", outerEdgeIds: ", sb2, this.innerEdgeIds);
        b.v(", shape: ", sb2, this.outerEdgeIds);
        sb2.append(RecordUtils.fieldToString(this.shape));
        sb2.append(", length: ");
        return b.f(this.length, sb2, "]");
    }
}
