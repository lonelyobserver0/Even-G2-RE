package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoutesLaneGuidance implements Serializable {
    private final List<RouteLaneGuidance> alternatives;
    private final RouteLaneGuidance current;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoutesLaneGuidance(RouteLaneGuidance routeLaneGuidance, List<RouteLaneGuidance> list) {
        this.current = routeLaneGuidance;
        this.alternatives = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoutesLaneGuidance routesLaneGuidance = (RoutesLaneGuidance) obj;
        return Objects.equals(this.current, routesLaneGuidance.current) && Objects.equals(this.alternatives, routesLaneGuidance.alternatives);
    }

    public List<RouteLaneGuidance> getAlternatives() {
        return this.alternatives;
    }

    public RouteLaneGuidance getCurrent() {
        return this.current;
    }

    public int hashCode() {
        return Objects.hash(this.current, this.alternatives);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[current: ");
        sb2.append(RecordUtils.fieldToString(this.current));
        sb2.append(", alternatives: ");
        return b.i("]", sb2, this.alternatives);
    }
}
