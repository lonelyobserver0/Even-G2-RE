package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapIdle implements Serializable {
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapIdle(Date date) {
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && MapIdle.class == obj.getClass() && Objects.equals(this.timestamp, ((MapIdle) obj).timestamp);
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.timestamp);
    }

    public String toString() {
        return "[timestamp: " + RecordUtils.fieldToString(this.timestamp) + "]";
    }
}
