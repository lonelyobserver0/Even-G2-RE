package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MapMatcherOutput implements Serializable {
    private final boolean isTeleport;
    private final List<MapMatch> matches;
    private final int totalCandidatesCount;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MapMatcherOutput(List<MapMatch> list, boolean z2, int i3) {
        this.matches = list;
        this.isTeleport = z2;
        this.totalCandidatesCount = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MapMatcherOutput mapMatcherOutput = (MapMatcherOutput) obj;
        return Objects.equals(this.matches, mapMatcherOutput.matches) && this.isTeleport == mapMatcherOutput.isTeleport && this.totalCandidatesCount == mapMatcherOutput.totalCandidatesCount;
    }

    public boolean getIsTeleport() {
        return this.isTeleport;
    }

    public List<MapMatch> getMatches() {
        return this.matches;
    }

    public int getTotalCandidatesCount() {
        return this.totalCandidatesCount;
    }

    public int hashCode() {
        return Objects.hash(this.matches, Boolean.valueOf(this.isTeleport), Integer.valueOf(this.totalCandidatesCount));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[matches: ");
        b.v(", isTeleport: ", sb2, this.matches);
        h.A(this.isTeleport, sb2, ", totalCandidatesCount: ");
        return b.g(this.totalCandidatesCount, "]", sb2);
    }
}
