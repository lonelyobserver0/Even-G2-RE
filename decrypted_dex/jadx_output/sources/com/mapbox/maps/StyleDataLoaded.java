package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StyleDataLoaded implements Serializable {
    private final EventTimeInterval timeInterval;
    private final StyleDataLoadedType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StyleDataLoaded(StyleDataLoadedType styleDataLoadedType, EventTimeInterval eventTimeInterval) {
        this.type = styleDataLoadedType;
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleDataLoaded.class != obj.getClass()) {
            return false;
        }
        StyleDataLoaded styleDataLoaded = (StyleDataLoaded) obj;
        return Objects.equals(this.type, styleDataLoaded.type) && Objects.equals(this.timeInterval, styleDataLoaded.timeInterval);
    }

    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    public StyleDataLoadedType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.timeInterval);
    }

    public String toString() {
        return "[type: " + RecordUtils.fieldToString(this.type) + ", timeInterval: " + RecordUtils.fieldToString(this.timeInterval) + "]";
    }
}
