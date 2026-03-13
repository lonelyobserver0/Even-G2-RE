package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GraphPosition implements Serializable {
    private final long edgeId;
    private final double percentAlong;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GraphPosition(long j, double d8) {
        this.edgeId = j;
        this.percentAlong = d8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GraphPosition graphPosition = (GraphPosition) obj;
        return this.edgeId == graphPosition.edgeId && PartialEq.compare(this.percentAlong, graphPosition.percentAlong);
    }

    public long getEdgeId() {
        return this.edgeId;
    }

    public double getPercentAlong() {
        return this.percentAlong;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.edgeId), Double.valueOf(this.percentAlong));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[edgeId: ");
        b.p(this.edgeId, sb2, ", percentAlong: ");
        return b.f(this.percentAlong, sb2, "]");
    }
}
