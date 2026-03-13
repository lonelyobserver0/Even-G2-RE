package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StyleObjectInfo implements Serializable {
    private final String id;
    private final String type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StyleObjectInfo(String str, String str2) {
        this.id = str;
        this.type = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleObjectInfo.class != obj.getClass()) {
            return false;
        }
        StyleObjectInfo styleObjectInfo = (StyleObjectInfo) obj;
        return Objects.equals(this.id, styleObjectInfo.id) && Objects.equals(this.type, styleObjectInfo.type);
    }

    public String getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.type);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        Xa.h.z(sb2, this.id, ", type: ");
        return Xa.h.t(sb2, this.type, "]");
    }
}
