package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Metrics implements Serializable {
    private final String name;
    private final Value value;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Metrics(String str, Value value) {
        this.name = str;
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metrics.class != obj.getClass()) {
            return false;
        }
        Metrics metrics = (Metrics) obj;
        return Objects.equals(this.name, metrics.name) && Objects.equals(this.value, metrics.value);
    }

    public String getName() {
        return this.name;
    }

    public Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[name: ");
        h.z(sb2, this.name, ", value: ");
        sb2.append(RecordUtils.fieldToString(this.value));
        sb2.append("]");
        return sb2.toString();
    }
}
