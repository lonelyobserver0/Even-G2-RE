package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GraphPath implements Serializable {
    private final List<Long> edges;
    private final double length;
    private final double percentAlongBegin;
    private final double percentAlongEnd;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GraphPath(List<Long> list, double d8, double d10, double d11) {
        this.edges = list;
        this.percentAlongBegin = d8;
        this.percentAlongEnd = d10;
        this.length = d11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GraphPath graphPath = (GraphPath) obj;
        return Objects.equals(this.edges, graphPath.edges) && PartialEq.compare(this.percentAlongBegin, graphPath.percentAlongBegin) && PartialEq.compare(this.percentAlongEnd, graphPath.percentAlongEnd) && PartialEq.compare(this.length, graphPath.length);
    }

    public List<Long> getEdges() {
        return this.edges;
    }

    public double getLength() {
        return this.length;
    }

    public double getPercentAlongBegin() {
        return this.percentAlongBegin;
    }

    public double getPercentAlongEnd() {
        return this.percentAlongEnd;
    }

    public int hashCode() {
        return Objects.hash(this.edges, Double.valueOf(this.percentAlongBegin), Double.valueOf(this.percentAlongEnd), Double.valueOf(this.length));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[edges: ");
        b.v(", percentAlongBegin: ", sb2, this.edges);
        b.m(this.percentAlongBegin, sb2, ", percentAlongEnd: ");
        b.m(this.percentAlongEnd, sb2, ", length: ");
        return b.f(this.length, sb2, "]");
    }
}
