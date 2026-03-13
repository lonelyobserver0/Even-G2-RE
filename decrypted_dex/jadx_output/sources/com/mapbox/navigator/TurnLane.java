package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TurnLane implements Serializable {
    private final LaneAccessability access;
    private final boolean active;
    private final List<LaneIndication> indications;
    private final boolean valid;
    private final LaneIndication validIndication;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public TurnLane(boolean z2, boolean z10, LaneIndication laneIndication, List<LaneIndication> list, LaneAccessability laneAccessability) {
        this.valid = z2;
        this.active = z10;
        this.validIndication = laneIndication;
        this.indications = list;
        this.access = laneAccessability;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TurnLane turnLane = (TurnLane) obj;
        return this.valid == turnLane.valid && this.active == turnLane.active && Objects.equals(this.validIndication, turnLane.validIndication) && Objects.equals(this.indications, turnLane.indications) && Objects.equals(this.access, turnLane.access);
    }

    public LaneAccessability getAccess() {
        return this.access;
    }

    public boolean getActive() {
        return this.active;
    }

    public List<LaneIndication> getIndications() {
        return this.indications;
    }

    public boolean getValid() {
        return this.valid;
    }

    public LaneIndication getValidIndication() {
        return this.validIndication;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.valid), Boolean.valueOf(this.active), this.validIndication, this.indications, this.access);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[valid: ");
        h.A(this.valid, sb2, ", active: ");
        h.A(this.active, sb2, ", validIndication: ");
        sb2.append(RecordUtils.fieldToString(this.validIndication));
        sb2.append(", indications: ");
        b.v(", access: ", sb2, this.indications);
        sb2.append(RecordUtils.fieldToString(this.access));
        sb2.append("]");
        return sb2.toString();
    }
}
