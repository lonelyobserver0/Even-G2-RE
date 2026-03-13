package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PushHistoryRecord implements Serializable {
    private final String properties;
    private final String type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public PushHistoryRecord(String str, String str2) {
        this.type = str;
        this.properties = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PushHistoryRecord pushHistoryRecord = (PushHistoryRecord) obj;
        return Objects.equals(this.type, pushHistoryRecord.type) && Objects.equals(this.properties, pushHistoryRecord.properties);
    }

    public String getProperties() {
        return this.properties;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.properties);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[type: ");
        h.z(sb2, this.type, ", properties: ");
        return h.t(sb2, this.properties, "]");
    }
}
