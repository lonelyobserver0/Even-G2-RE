package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteLane implements Serializable {
    private final int connectedLaneSequenceIndex;
    private final RouteLaneDivergency divergency;
    private final long laneId;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteLane(long j, RouteLaneDivergency routeLaneDivergency, int i3) {
        this.laneId = j;
        this.divergency = routeLaneDivergency;
        this.connectedLaneSequenceIndex = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteLane routeLane = (RouteLane) obj;
        return this.laneId == routeLane.laneId && Objects.equals(this.divergency, routeLane.divergency) && this.connectedLaneSequenceIndex == routeLane.connectedLaneSequenceIndex;
    }

    public int getConnectedLaneSequenceIndex() {
        return this.connectedLaneSequenceIndex;
    }

    public RouteLaneDivergency getDivergency() {
        return this.divergency;
    }

    public long getLaneId() {
        return this.laneId;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.laneId), this.divergency, Integer.valueOf(this.connectedLaneSequenceIndex));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[laneId: ");
        b.p(this.laneId, sb2, ", divergency: ");
        sb2.append(RecordUtils.fieldToString(this.divergency));
        sb2.append(", connectedLaneSequenceIndex: ");
        return b.g(this.connectedLaneSequenceIndex, "]", sb2);
    }
}
