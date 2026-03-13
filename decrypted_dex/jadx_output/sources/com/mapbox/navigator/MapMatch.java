package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MapMatch implements Serializable {
    private final int fetchedCandidateIndex;
    private final GraphPosition position;
    private final float proba;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MapMatch(GraphPosition graphPosition, float f10, int i3) {
        this.position = graphPosition;
        this.proba = f10;
        this.fetchedCandidateIndex = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MapMatch mapMatch = (MapMatch) obj;
        return Objects.equals(this.position, mapMatch.position) && PartialEq.compare(this.proba, mapMatch.proba) && this.fetchedCandidateIndex == mapMatch.fetchedCandidateIndex;
    }

    public int getFetchedCandidateIndex() {
        return this.fetchedCandidateIndex;
    }

    public GraphPosition getPosition() {
        return this.position;
    }

    public float getProba() {
        return this.proba;
    }

    public int hashCode() {
        return Objects.hash(this.position, Float.valueOf(this.proba), Integer.valueOf(this.fetchedCandidateIndex));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[position: ");
        sb2.append(RecordUtils.fieldToString(this.position));
        sb2.append(", proba: ");
        b.n(this.proba, sb2, ", fetchedCandidateIndex: ");
        return b.g(this.fetchedCandidateIndex, "]", sb2);
    }
}
