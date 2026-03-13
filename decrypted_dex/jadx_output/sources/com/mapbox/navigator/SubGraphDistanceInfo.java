package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SubGraphDistanceInfo implements Serializable {
    private final List<Gate> entrances;
    private final List<Gate> exits;
    private final boolean inside;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SubGraphDistanceInfo(boolean z2, List<Gate> list, List<Gate> list2) {
        this.inside = z2;
        this.entrances = list;
        this.exits = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubGraphDistanceInfo subGraphDistanceInfo = (SubGraphDistanceInfo) obj;
        return this.inside == subGraphDistanceInfo.inside && Objects.equals(this.entrances, subGraphDistanceInfo.entrances) && Objects.equals(this.exits, subGraphDistanceInfo.exits);
    }

    public List<Gate> getEntrances() {
        return this.entrances;
    }

    public List<Gate> getExits() {
        return this.exits;
    }

    public boolean getInside() {
        return this.inside;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.inside), this.entrances, this.exits);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[inside: ");
        h.A(this.inside, sb2, ", entrances: ");
        b.v(", exits: ", sb2, this.entrances);
        return b.i("]", sb2, this.exits);
    }
}
