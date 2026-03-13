package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StylePropertyValue implements Serializable {
    private final StylePropertyValueKind kind;
    private final Value value;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StylePropertyValue(Value value, StylePropertyValueKind stylePropertyValueKind) {
        this.value = value;
        this.kind = stylePropertyValueKind;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StylePropertyValue.class != obj.getClass()) {
            return false;
        }
        StylePropertyValue stylePropertyValue = (StylePropertyValue) obj;
        return Objects.equals(this.value, stylePropertyValue.value) && Objects.equals(this.kind, stylePropertyValue.kind);
    }

    public StylePropertyValueKind getKind() {
        return this.kind;
    }

    public Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.value, this.kind);
    }

    public String toString() {
        return "[value: " + RecordUtils.fieldToString(this.value) + ", kind: " + RecordUtils.fieldToString(this.kind) + "]";
    }
}
