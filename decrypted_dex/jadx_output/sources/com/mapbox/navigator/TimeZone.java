package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TimeZone implements Serializable {
    private final String abbreviation;
    private final String identifier;
    private final String offset;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public TimeZone(String str, String str2, String str3) {
        this.offset = str;
        this.identifier = str2;
        this.abbreviation = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeZone timeZone = (TimeZone) obj;
        return Objects.equals(this.offset, timeZone.offset) && Objects.equals(this.identifier, timeZone.identifier) && Objects.equals(this.abbreviation, timeZone.abbreviation);
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return Objects.hash(this.offset, this.identifier, this.abbreviation);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[offset: ");
        h.z(sb2, this.offset, ", identifier: ");
        h.z(sb2, this.identifier, ", abbreviation: ");
        return h.t(sb2, this.abbreviation, "]");
    }
}
