package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ElectronicHorizon360Graph implements Serializable {
    private final HashMap<Long, ElectronicHorizon360Edge> graph;
    private final long origin;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ElectronicHorizon360Graph(long j, HashMap<Long, ElectronicHorizon360Edge> hashMap) {
        this.origin = j;
        this.graph = hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElectronicHorizon360Graph electronicHorizon360Graph = (ElectronicHorizon360Graph) obj;
        return this.origin == electronicHorizon360Graph.origin && Objects.equals(this.graph, electronicHorizon360Graph.graph);
    }

    public HashMap<Long, ElectronicHorizon360Edge> getGraph() {
        return this.graph;
    }

    public long getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.origin), this.graph);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[origin: ");
        b.p(this.origin, sb2, ", graph: ");
        sb2.append(RecordUtils.fieldToString(this.graph));
        sb2.append("]");
        return sb2.toString();
    }
}
