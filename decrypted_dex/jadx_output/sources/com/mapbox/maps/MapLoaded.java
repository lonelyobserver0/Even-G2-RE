package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapLoaded implements Serializable {
    private final EventTimeInterval timeInterval;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapLoaded(EventTimeInterval eventTimeInterval) {
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && MapLoaded.class == obj.getClass() && Objects.equals(this.timeInterval, ((MapLoaded) obj).timeInterval);
    }

    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    public int hashCode() {
        return Objects.hash(this.timeInterval);
    }

    public String toString() {
        return "[timeInterval: " + RecordUtils.fieldToString(this.timeInterval) + "]";
    }
}
