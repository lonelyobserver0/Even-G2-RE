package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ElectronicHorizon360Edge implements Serializable {
    private final List<Long> branchLinks;
    private final double length;
    private final List<String> roadObjectsOnEdge;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ElectronicHorizon360Edge(List<Long> list, double d8, List<String> list2) {
        this.branchLinks = list;
        this.length = d8;
        this.roadObjectsOnEdge = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElectronicHorizon360Edge electronicHorizon360Edge = (ElectronicHorizon360Edge) obj;
        return Objects.equals(this.branchLinks, electronicHorizon360Edge.branchLinks) && PartialEq.compare(this.length, electronicHorizon360Edge.length) && Objects.equals(this.roadObjectsOnEdge, electronicHorizon360Edge.roadObjectsOnEdge);
    }

    public List<Long> getBranchLinks() {
        return this.branchLinks;
    }

    public double getLength() {
        return this.length;
    }

    public List<String> getRoadObjectsOnEdge() {
        return this.roadObjectsOnEdge;
    }

    public int hashCode() {
        return Objects.hash(this.branchLinks, Double.valueOf(this.length), this.roadObjectsOnEdge);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[branchLinks: ");
        b.v(", length: ", sb2, this.branchLinks);
        b.m(this.length, sb2, ", roadObjectsOnEdge: ");
        return b.i("]", sb2, this.roadObjectsOnEdge);
    }
}
