package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ElectronicHorizonEdge implements Serializable {
    private final long id;
    private final boolean isOnRoute;
    private final byte level;
    private final List<ElectronicHorizonEdge> out;
    private final double probability;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ElectronicHorizonEdge(long j, byte b2, double d8, boolean z2, List<ElectronicHorizonEdge> list) {
        this.id = j;
        this.level = b2;
        this.probability = d8;
        this.isOnRoute = z2;
        this.out = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElectronicHorizonEdge electronicHorizonEdge = (ElectronicHorizonEdge) obj;
        return this.id == electronicHorizonEdge.id && this.level == electronicHorizonEdge.level && PartialEq.compare(this.probability, electronicHorizonEdge.probability) && this.isOnRoute == electronicHorizonEdge.isOnRoute && Objects.equals(this.out, electronicHorizonEdge.out);
    }

    public long getId() {
        return this.id;
    }

    public boolean getIsOnRoute() {
        return this.isOnRoute;
    }

    public byte getLevel() {
        return this.level;
    }

    public List<ElectronicHorizonEdge> getOut() {
        return this.out;
    }

    public double getProbability() {
        return this.probability;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.id), Byte.valueOf(this.level), Double.valueOf(this.probability), Boolean.valueOf(this.isOnRoute), this.out);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        b.p(this.id, sb2, ", level: ");
        sb2.append(RecordUtils.fieldToString(Byte.valueOf(this.level)));
        sb2.append(", probability: ");
        b.m(this.probability, sb2, ", isOnRoute: ");
        h.A(this.isOnRoute, sb2, ", out: ");
        return b.i("]", sb2, this.out);
    }
}
