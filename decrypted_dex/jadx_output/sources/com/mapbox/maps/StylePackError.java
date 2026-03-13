package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class StylePackError implements Serializable {
    private final String message;
    private final StylePackErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StylePackError(StylePackErrorType stylePackErrorType, String str) {
        this.type = stylePackErrorType;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StylePackError stylePackError = (StylePackError) obj;
        return Objects.equals(this.type, stylePackError.type) && Objects.equals(this.message, stylePackError.message);
    }

    public String getMessage() {
        return this.message;
    }

    public StylePackErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", message: ");
        return Xa.h.t(sb2, this.message, "]");
    }
}
