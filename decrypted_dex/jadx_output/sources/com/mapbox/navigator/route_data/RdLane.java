package com.mapbox.navigator.route_data;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RdLane implements Serializable {
    private final boolean active;
    private final List<RdLaneIndication> indications;
    private final boolean valid;
    private final RdLaneIndication validIndication;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdLane(boolean z2, boolean z10, RdLaneIndication rdLaneIndication, List<RdLaneIndication> list) {
        this.valid = z2;
        this.active = z10;
        this.validIndication = rdLaneIndication;
        this.indications = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdLane rdLane = (RdLane) obj;
        return this.valid == rdLane.valid && this.active == rdLane.active && Objects.equals(this.validIndication, rdLane.validIndication) && Objects.equals(this.indications, rdLane.indications);
    }

    public boolean getActive() {
        return this.active;
    }

    public List<RdLaneIndication> getIndications() {
        return this.indications;
    }

    public boolean getValid() {
        return this.valid;
    }

    public RdLaneIndication getValidIndication() {
        return this.validIndication;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.valid), Boolean.valueOf(this.active), this.validIndication, this.indications);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[valid: ");
        h.A(this.valid, sb2, ", active: ");
        h.A(this.active, sb2, ", validIndication: ");
        sb2.append(RecordUtils.fieldToString(this.validIndication));
        sb2.append(", indications: ");
        return b.i("]", sb2, this.indications);
    }
}
