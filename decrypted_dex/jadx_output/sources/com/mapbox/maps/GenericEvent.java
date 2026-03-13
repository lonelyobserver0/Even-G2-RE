package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class GenericEvent implements Serializable {
    private final Value data;
    private final String name;
    private final EventTimeInterval timeInterval;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public GenericEvent(String str, Value value, EventTimeInterval eventTimeInterval) {
        this.name = str;
        this.data = value;
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GenericEvent.class != obj.getClass()) {
            return false;
        }
        GenericEvent genericEvent = (GenericEvent) obj;
        return Objects.equals(this.name, genericEvent.name) && Objects.equals(this.data, genericEvent.data) && Objects.equals(this.timeInterval, genericEvent.timeInterval);
    }

    public Value getData() {
        return this.data;
    }

    public String getName() {
        return this.name;
    }

    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.data, this.timeInterval);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[name: ");
        Xa.h.z(sb2, this.name, ", data: ");
        sb2.append(RecordUtils.fieldToString(this.data));
        sb2.append(", timeInterval: ");
        sb2.append(RecordUtils.fieldToString(this.timeInterval));
        sb2.append("]");
        return sb2.toString();
    }
}
