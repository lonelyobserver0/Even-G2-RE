package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class EventTimeInterval implements Serializable {
    private final Date begin;
    private final Date end;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public EventTimeInterval(Date date, Date date2) {
        this.begin = date;
        this.end = date2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventTimeInterval eventTimeInterval = (EventTimeInterval) obj;
        return Objects.equals(this.begin, eventTimeInterval.begin) && Objects.equals(this.end, eventTimeInterval.end);
    }

    public Date getBegin() {
        return this.begin;
    }

    public Date getEnd() {
        return this.end;
    }

    public int hashCode() {
        return Objects.hash(this.begin, this.end);
    }

    public String toString() {
        return "[begin: " + RecordUtils.fieldToString(this.begin) + ", end: " + RecordUtils.fieldToString(this.end) + "]";
    }
}
