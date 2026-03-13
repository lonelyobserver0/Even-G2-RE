package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class IncidentCongestion implements Serializable {
    private final IncidentCongestionDescription description;
    private final Integer value;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public IncidentCongestion(Integer num, IncidentCongestionDescription incidentCongestionDescription) {
        this.value = num;
        this.description = incidentCongestionDescription;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentCongestion incidentCongestion = (IncidentCongestion) obj;
        return Objects.equals(this.value, incidentCongestion.value) && Objects.equals(this.description, incidentCongestion.description);
    }

    public IncidentCongestionDescription getDescription() {
        return this.description;
    }

    public Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.value, this.description);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[value: ");
        b.t(this.value, sb2, ", description: ");
        sb2.append(RecordUtils.fieldToString(this.description));
        sb2.append("]");
        return sb2.toString();
    }
}
