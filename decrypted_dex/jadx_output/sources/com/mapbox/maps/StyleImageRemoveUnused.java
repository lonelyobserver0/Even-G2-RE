package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StyleImageRemoveUnused implements Serializable {
    private final String imageId;
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StyleImageRemoveUnused(String str, Date date) {
        this.imageId = str;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleImageRemoveUnused.class != obj.getClass()) {
            return false;
        }
        StyleImageRemoveUnused styleImageRemoveUnused = (StyleImageRemoveUnused) obj;
        return Objects.equals(this.imageId, styleImageRemoveUnused.imageId) && Objects.equals(this.timestamp, styleImageRemoveUnused.timestamp);
    }

    public String getImageId() {
        return this.imageId;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.imageId, this.timestamp);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[imageId: ");
        Xa.h.z(sb2, this.imageId, ", timestamp: ");
        sb2.append(RecordUtils.fieldToString(this.timestamp));
        sb2.append("]");
        return sb2.toString();
    }
}
